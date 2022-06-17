package br.com.entra21.teamroxo.transport.classes;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.herancas.PedidoDados;
import br.com.entra21.teamroxo.transport.log.Brasil;
import br.com.entra21.teamroxo.transport.log.Logistica;

public class Pedidos extends PedidoDados {

	DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/YY");
	DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
	Scanner input = new Scanner(System.in);
	boolean pass = false;

	private boolean find = false;

	// RASTREIO SEM LOGIN
	public void rastrearPacote() {

		String code;

		System.out.println("\n=====================================\n PACOTES A CAMINHO \n=====================================\n");
		System.out.println("!> DIGITE O CÓDIGO DO PACOTE:");
		code = input.nextLine();

		try {
			for (int i = 0; i < Main.pedidoData.getCodigoRastreioBD().size(); i++) {
				if (code.equals(Main.pedidoData.getCodigoRastreioBD((byte) i)))
					;
				{
					System.out.println("Pacote N. " + (i + 1) + ": CÓDIGO - ("
							+ Main.pedidoData.getCodigoRastreioBD((byte) i) + ") - PREÇO DO FRETE: R$"
							+ Main.pedidoData.getPrecoFreteBD((byte) i) + " - ENVIADO: "
							+ Main.pedidoData.getDataEnvioBD((byte) i).format(data) + " às "
							+ Main.pedidoData.getHoraEnvioBD((byte) i).format(time) + "TRANSPORTADORA: "
							+ Main.transporteData.getEmpresaBD((byte) Main.pedidoData.getTransportadoraBD((byte) i)));
					find = true;
				}
			}
		} catch (Exception e) {
			System.out.println("!-------------- NENHUM PACOTE CADASTRADO AINDA --------------!");
		}

		if (find == false) {
			System.out.println("!------------------- NENHUM PACOTE -------------------!");
		}

	}

	// LISTAR PACOTES DE USUARIO LOGADO
	public void listarPacotes() {

		System.out.println("\n=====================================\n PACOTES A CAMINHO \n=====================================\n");

		// Listar Pacotes a caminho pro usuário
		try {
			for (int i = 0; i < Main.pedidoData.getCodigoRastreioBD().size(); i++) {

				if (Main.loginData.account == Main.pedidoData.getDestinatarioBD((byte) i)) {
					System.out.println(
							"Pacote N. " + (i + 1) + ": CÓDIGO - (" + Main.pedidoData.getCodigoRastreioBD((byte) i)
									+ ") - PREÇO DO FRETE: R$" + Main.pedidoData.getPrecoFreteBD((byte) i)
									+ " - ENVIADO: " + Main.pedidoData.getDataEnvioBD((byte) i).format(data) + " às "
									+ Main.pedidoData.getHoraEnvioBD((byte) i).format(time));
					find = true;
				}

			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("!-------------- NENHUM PACOTE CADASTRADO AINDA --------------!");
		}

		if (find == false) {
			System.out.println("!------------------- NENHUM PACOTE -------------------!");
		}

		System.out.println("\n=====================================\n PACOTES ENVIADOS \n=====================================\n");

		// Listar Pacotes que ele encaminhou a outro
		try {
			for (int i = 0; i < Main.pedidoData.getCodigoRastreioBD().size(); i++) {

				if (Main.loginData.account == Main.pedidoData.getRemetenteBD((byte) i)) {
					System.out.println(
							"Pacote N. " + (i + 1) + ": CÓDIGO - (" + Main.pedidoData.getCodigoRastreioBD((byte) i)
									+ ") - PREÇO DO FRETE: R$" + Main.pedidoData.getPrecoFreteBD((byte) i)
									+ " - ENVIADO: " + Main.pedidoData.getDataEnvioBD((byte) i).format(data) + " às "
									+ Main.pedidoData.getHoraEnvioBD((byte) i).format(time));
					find = true;

				}

			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("!-------------- NENHUM PACOTE CADASTRADO AINDA --------------!");
		}

		if (find == false) {
			System.out.println("!------------------- NENHUM PACOTE -------------------!");
		}

	}

	// CADASTRA PACOTE TANTO DE USUARIO LOGADO COMO NÃO-LOGADO
	public void cadastrarPacote() {

		String cpfRe, nomeRe;
		String cpfDe, nomeDe;
		byte estadoDe = 0, estadoRe = 0;
		float altura, comprimento, largura;

		// REMETENTE
		System.out.println("--------Bem vindo ao envio de pacotes----------");
		System.out.println("-----------------------------------------------");
		System.out.println("-------------------Remetente-------------------\n");
		
		if(Login.logged == false) {
			do {
				
				System.out.println("Insira o CPF/CNPJ do Remetente: ");
				cpfRe=tratamentoCpf(input.next());
				
				if(cpfRe.length() == 11){
	            	pass = true;
	            	System.out.println("\n====================================\n ENVIO DE PESSOA FISICA (CPF) \n==========================================\n");
	            }else if(cpfRe.length() == 14) {
	            	pass = true;
	            	System.out.println("\n========================================\n ENVIO DE EMPRESA (CNPJ) \n===========================================\n");
	            }else {
	            	System.out.println("\n=================================\n ERRO NO CPF/CNPJ - CODE: "+cpfRe.length()+" \n=========================================\n");
	            }
				
			}while(pass != true);
			
			pass = false;
			
			// PROCURAR SE USUARIO JA ESTA CADASTRADO
			for(byte i=0; i<Main.loginData.getUser().size();i++) {
				if(Main.loginData.getCpf(i).equals(cpfRe)) {
					System.out.println("DADOS DO REMETENTE ENCONTRADOS");
					System.out.println("Nome: "+Main.loginData.getNome(i)+" de "+Main.loginData.getEstadoOrigem(i));
					nomeRe = Main.loginData.getNome(i);
					estadoRe = tratamentoEstado(Main.loginData.getEstadoOrigem(i));
					pass = true;
					break;
				}
			}
			
			if(pass == false) {
				
				System.out.println("Insira o nome do Remetente: ");
				nomeRe = tratamentoNome(input.next());
				
				do {
		        	
		        	System.out.println("Digite seu estado: ");
		        	
		        	String estado = input.next();
		        	
		            if(tratamentoEstadoWord(estado.toUpperCase())) {
		            	estadoRe = tratamentoEstado(estado.toUpperCase());
		            	System.out.println("\n=====================================\n ESTADO "+Brasil.values()[estadoRe].getEstadoFull()+" ENCONTRADO! \n=====================================\n");
		            	pass = true;
		            }else {
		            	System.out.println("\n=====================================\n ESTADO NÃO EXISTE \n=====================================\n");
		            }
				}while(pass != true);
				
				Main.loginData.setCpf(cpfRe, (byte) Main.loginData.getUser().size());
				Main.loginData.setNome(nomeRe, (byte) Main.loginData.getUser().size());
				Main.loginData.setEstadoOrigem(Brasil.values()[estadoRe].getEstadoNome(), (byte) Main.loginData.getUser().size());
				Main.loginData.setEmail("<no email>", (byte) Main.loginData.getUser().size());
				Main.loginData.setUser("user"+Main.loginData.getUser().size(), (byte) Main.loginData.getUser().size());
				
				System.out.println("AGORA CRIE UMA SENHA PARA ACESSAR SEU PEDIDO FUTURAMENTE: ");
				Main.loginData.setSenha(input.next(), (byte) Main.loginData.getUser().size());
				
				System.out.println("NÃO ESQUEÇA DE ALTERAR SEUS DADOS DEPOIS EM 'MENU' > 'ALTERAR CADASTRO' ");
				
			}
			
			pass = false;
			
		}else {
			
			cpfRe = Main.loginData.getCpf(Login.account);
			nomeRe = Main.loginData.getNome(Login.account);
			estadoRe = tratamentoEstado(Main.loginData.getEstadoOrigem(Login.account));
			
		}
		
		// DESTINATARIO
		System.out.println("-----------------------------------------------");
		System.out.println("------------------Destinatario-----------------");
		
		do {
			System.out.println("Insira o CPF do Destinatario: ");

			cpfDe = tratamentoCpf(input.next());
			
			if(cpfDe.length() == 11){
	        	pass = true;
	        	System.out.println("\n====================================\n PARA PESSOA FISICA (CPF) \n==========================================\n");
	        }else if(cpfDe.length() == 14) {
	        	pass = true;
	        	System.out.println("\n========================================\n PARA EMPRESA (CNPJ) \n===========================================\n");
	        }else {
	        	System.out.println("\n=================================\n ERRO NO CPF/CNPJ - CODE: "+cpfDe.length()+" \n=========================================\n");
	        }
			
		}while(pass != true);
		
		pass = false;
		
		for(byte i=0; i<Main.loginData.getUser().size();i++) {
			if(Main.loginData.getCpf(i).equals(cpfDe)) {
				System.out.println("DADOS DO DESTINATARIO ENCONTRADOS");
				System.out.println("Nome: "+Main.loginData.getNome(i)+" de "+Main.loginData.getEstadoOrigem(i));
				nomeDe = Main.loginData.getNome(i);
				estadoDe = tratamentoEstado(Main.loginData.getEstadoOrigem(i));
				pass = true;
				break;
			}
		}
		
		if(pass == false) {
			
			System.out.println("Insira o nome do Destinatario: ");
			nomeDe = tratamentoNome(input.next());
			
			do {
	        	
	        	System.out.println("Digite seu estado: ");
	        	
	        	String estado = input.next();
	        	
	            if(tratamentoEstadoWord(estado.toUpperCase())) {
	            	estadoDe = tratamentoEstado(estado.toUpperCase());
	            	System.out.println("\n=====================================\n ESTADO "+Brasil.values()[estadoRe].getEstadoFull()+" ENCONTRADO! \n=====================================\n");
	            	pass = true;
	            }else {
	            	System.out.println("\n=====================================\n ESTADO NÃO EXISTE \n=====================================\n");
	            }
			}while(pass != true);
			
			Main.loginData.setCpf(cpfDe, (byte) Main.loginData.getUser().size());
			Main.loginData.setNome(nomeDe, (byte) Main.loginData.getUser().size());
			Main.loginData.setEstadoOrigem(Brasil.values()[estadoDe].getEstadoNome(), (byte) Main.loginData.getUser().size());
			Main.loginData.setEmail("<no email>", (byte) Main.loginData.getUser().size());
			Main.loginData.setUser("user"+Main.loginData.getUser().size(), (byte) Main.loginData.getUser().size());
			
			System.out.println("AGORA CRIE UMA SENHA PARA ACESSAR SEU PEDIDO FUTURAMENTE: ");
			Main.loginData.setSenha(input.next(), (byte) Main.loginData.getUser().size());
			
			System.out.println("NÃO ESQUEÇA DE ALTERAR SEUS DADOS DEPOIS EM 'MENU' > 'ALTERAR CADASTRO' ");
			
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("---------------------Pacote--------------------");
		System.out.println("Agora, por favor, digite as dimensoes do pacote em cm: ");
		System.out.println("Largura: ");
		largura=input.nextFloat();

		System.out.println("Altura: ");
		altura=input.nextFloat();

		System.out.println("Comprimento: ");
		comprimento=input.nextFloat();
		
		
		
		
		// LISTA AS TRANSPORTADORAS E O PREÇO DE CADA UMA DELAS
		System.out.println("\n============================================\n SELECIONE A EMPRESA QUE IRÁ TRANSPORTAR \n============================================\n");
		for(byte i=0;i<Main.transporteData.getEmpresaBD().size();i++) {
			System.out.println((i+1)+" - "+Main.transporteData.getEmpresaBD(i)+" - PRECO: R$"+Logistica.Logistica(Brasil.values()[estadoRe].getLatitude(), 
					Brasil.values()[estadoRe].getLongitude(), Brasil.values()[estadoDe].getLatitude(), Brasil.values()[estadoDe].getLongitude(), 
					comprimento, largura, altura, Main.transporteData.getDistanciaIndexBD(i), Main.transporteData.getPesoIndexBD(i), 
					Main.transporteData.getVolumeIndexBD(i)));
		}
		
		byte empresaEscolhida = input.nextByte();
		
		// SETA O PREÇO DO PACOTE
		Main.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[estadoRe].getLatitude(), 
					Brasil.values()[estadoRe].getLongitude(), Brasil.values()[estadoDe].getLatitude(), Brasil.values()[estadoDe].getLongitude(), 
					comprimento, largura, altura, Main.transporteData.getDistanciaIndexBD(empresaEscolhida), Main.transporteData.getPesoIndexBD(empresaEscolhida), 
					Main.transporteData.getVolumeIndexBD(empresaEscolhida)), (byte) Main.pedidoData.getCodigoRastreioBD().size());
		
		Main.pedidoData.setDataEnvioBD(LocalDate.now(), (byte) Main.pedidoData.getCodigoRastreioBD().size()); // SETA DATA DE ENVIO
		Main.pedidoData.setHoraEnvioBD(LocalTime.now(), (byte) Main.pedidoData.getCodigoRastreioBD().size()); // SETA HORA DE ENVIO

		// SETA REMETENTE JÁ LOGADO
		Main.pedidoData.setRemetenteBD(Login.account, (byte) Main.pedidoData.getCodigoRastreioBD().size());
		
		// SETA DESTINATÁRIO POR CPF
		for(byte i=0; i<Main.loginData.getUser().size();i++) {
			if(cpfDe.equals(Main.loginData.getCpf(i))) {
				Main.pedidoData.setDestinatarioBD(i, (byte) Main.pedidoData.getCodigoRastreioBD().size());
			}
			
		}

	}
	
	private String tratamentoCpf(String cpf) {
		
		try {
			cpf = cpf.replace(".", "");
			cpf = cpf.replace("-", "");
			cpf = cpf.replace("/", "");
			final long CPF = Long.parseLong(cpf); // VALIDAR SE O CPF TEM CARACTERES VÁLIDOS
			
			if(Main.loginData.getCpf().contains(String.valueOf(CPF)) == true) {
				return cpf;
			}else {
				return cpf;
			}
		}catch(Exception e) {
			return "DOCUMENTO INVÁLIDO!";
		}
		
	}
	
	private byte tratamentoEstado(String estado) {
		
		for(byte i=0;i<Brasil.values().length;i++) {
			if(Brasil.values()[i].getEstadoFull().equals(estado)){
				return i;
			}
			if(Brasil.values()[i].getEstadoNome().equals(estado)){
				return i;
			}
			if(Brasil.values()[i].getEstadoSigla().equals(estado)){
				return i;
			}
			
		}
		
		return -1;
				
	}
	
	private boolean tratamentoEstadoWord(String estado) {
		
		for(byte i=0;i<Brasil.values().length;i++) {
			if(Brasil.values()[i].getEstadoFull().equals(estado)){
				return true;
			}
			if(Brasil.values()[i].getEstadoNome().equals(estado)){
				return true;
			}
			if(Brasil.values()[i].getEstadoSigla().equals(estado)){
				return true;
			}
			
		}
		
		return false;
				
	}

	private String tratamentoNome(String nome) {
		
		nome = nome.toLowerCase();
		
		char[] name = nome.toCharArray();
		nome = nome.valueOf(name[0]).toUpperCase();
		
		for(byte i=1; i<name.length;i++) {
			if(" ".equals(String.valueOf(name[i]))) {
				nome += nome.valueOf(name[i]);
				nome += nome.valueOf(name[i+1]).toUpperCase();
				i++;
			}else {
				nome += nome.valueOf(name[i]);
			}
		}
		
		return nome;
		
	}
	
}



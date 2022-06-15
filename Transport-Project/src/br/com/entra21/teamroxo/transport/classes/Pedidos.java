package br.com.entra21.teamroxo.transport.classes;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.herancas.PedidoDados;
import br.com.entra21.teamroxo.transport.log.Brasil;

public class Pedidos extends PedidoDados {

	DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/YY");
	DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
	Scanner input = new Scanner(System.in);

	private boolean find = false;

	// RASTREIO SEM LOGIN
	public void rastrearPacote() {

		String code;

		System.out.println("!=========================> PACOTES A CAMINHO <=========================!");
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

	// LISTAR PACOTES DE USU�RIO LOGADO
	public void listarPacotes() {

		System.out.println("!=========================> PACOTES A CAMINHO <=========================!");

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
		} catch (Exception e) {
			System.out.println("!-------------- NENHUM PACOTE CADASTRADO AINDA --------------!");
		}

		if (find == false) {
			System.out.println("!------------------- NENHUM PACOTE -------------------!");
		}

		System.out.println("!=========================> PACOTES ENVIADOS <=========================!");

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
		} catch (Exception e) {
			System.out.println("!-------------- NENHUM PACOTE CADASTRADO AINDA --------------!");
		}

		if (find == false) {
			System.out.println("!------------------- NENHUM PACOTE -------------------!");
		}

	}

	// CADASTRA PACOTE TANTO DE USU�RIO LOGADO COMO NÃO-LOGADO
	public void cadastrarPacote() {

		// variaveis de kd tipo de pergunta
		// adubada no menu

		String cpfRe, nomeRe, estadoRe;
		String cpfDe, nomeDe, estadoDe;
		float altura, comprimento, largura;

		byte tamanho = (byte) Main.pedidoData.getCodigoRastreioBD().size();

		System.out.println("--------Bem vindo ao envio de pacotes----------");
		System.out.println("-----------------------------------------------");
		System.out.println("-------------------Remetente-------------------");
		System.out.println("Insira o CPF do Remetente: ");
		cpfRe=input.nextLine();
		
		System.out.println("Insira o nome do Remetente: ");
		nomeRe=input.nextLine();
		
		System.out.println("Insira o estado do Remetente: ");
		estadoRe=input.nextLine();
		
		System.out.println("-----------------------------------------------");
		System.out.println("------------------Destinatario-----------------");
		System.out.println("Insira o CPF do Destinatario: ");
		cpfDe=input.nextLine();
		
		System.out.println("Insira o nome do Destinatario: ");
		nomeDe=input.nextLine();
		
		System.out.println("Insira o estado do Destinatario: ");
		estadoDe=input.nextLine();
		
		System.out.println("-----------------------------------------------");
		System.out.println("---------------------Pacote--------------------");
		System.out.println("Agora, por favor, digite as dimens�es do pacote: ");
		System.out.println("Largura: ");
		largura=input.nextFloat();

		System.out.println("Altura: ");
		altura=input.nextFloat();

		System.out.println("Comprimento: ");
		comprimento=input.nextFloat();
		
		//Calculo da data atual para setar no cadastro do pacote
		//Calculo do valor de frete
		//Calculo do prazo em dias
		
		//Setar todas as variaveis no banco

		System.out.println("--------------------");

	}

}

package br.com.entra21.teamroxo.transport.classes;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.Menu;
import br.com.entra21.teamroxo.transport.log.Brasil;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.Menu;

public class RunLogin {

	static Scanner input = new Scanner(System.in);
	
	boolean isEnterprise, pass = false;

	// FUNÇÃO PARA FAZER LOGIN
	public void loging() {

		String user;
		String senha;
		boolean find = false;
		byte userIndex;

		System.out.println("!> DIGITE O NOME, USUARIO OU EMAIL");
		user = input.nextLine();

		do {
			for (int i = 0; i < Main.loginData.getUser().size(); i++) {
				if (user.toLowerCase().equals(Main.loginData.getNome((byte) i).toLowerCase())
						|| user.toLowerCase().equals(Main.loginData.getEmail((byte) i).toLowerCase())
						|| user.toLowerCase().equals(Main.loginData.getCpf((byte) i))) {

					System.out.println("!=======================> USUARIO ENCONTRADO! <=======================!");
					userIndex = (byte) i;
					find = true;
					System.out.println("!> DIGITE SUA SENHA:");
					senha = input.nextLine();

					if (senha.equals(Main.loginData.getSenha(userIndex))) {
						System.out.println(
								"!=======================> LOGIN REALIZADO COM SUCESSO! <=======================!");
						Login.logged = true;
						Login.account = userIndex;

						if (Main.loginData.getIsEnterpriseBD(userIndex) == true) {
							Login.isEnterpriseAccount = true;
						} else {
							Login.isEnterpriseAccount = false;
						}

						Menu.option = "0";
						break;

					} else {
						System.out.println("!=======================> SENHA INCORRETA! <=======================!");
						System.out.println("!> DIGITE A SENHA NOVAMENTE:");
						System.out.println("!> DIGITE 0 SE QUISER SAIR:");
					}

				}

			}
			
			Menu.option = "0";
			
		} while (!Menu.option.equals("0"));
		
		if(find == false) {
			System.out.println("USUARIO N�O ENCONTRADO!");
		}

	}

	// FUNÇÃO PARA CADASTRAR CLIENTE - PF/PJ
	public void registerCliente() {

		byte tamanho = (byte) Main.loginData.getUser().size();

        String cpf, nome, email, user, origemEstado, senha1, senha2;
        
        System.out.println("Insira os dados para se cadastrar.");
        
        do {
        	System.out.println("Digite seu CPF/CNPJ: ");
        	
            cpf = tratamentoCpf(input.nextLine());
            
            if(cpf.length() == 11){
            	isEnterprise = false;
            	pass = true;
            	System.out.println("\n====================================\n CADASTRANDO PESSOA FISICA (CPF) \n==========================================\n");
            }else if(cpf.length() == 14) {
            	isEnterprise = true;
            	pass = true;
            	System.out.println("\n========================================\n CADASTRANDO EMPRESA (CNPJ) \n===========================================\n");
            }else {
            	System.out.println("\n=================================\n ERRO AO CADASTRAR CPF/CNPJ: "+cpf+" \n=========================================\n");
            }
            
        }while(pass != true);
        
        pass = false;
        
        if(cpf.length() == 11) {
        	System.out.println("Digite seu nome completo: ");
            nome = tratamentoNome(input.nextLine());
        }else {
        	System.out.println("Digite o nome da Empresa: ");
            nome = tratamentoNome(input.nextLine());
        }
        
        
        		System.out.println("\n=================================\n NOME INSERIDO COM SUCESSO! ("+nome+") \n=======================================\n");
        
        do {
        	
        	System.out.println("Digite seu e-mail: ");
            email = input.nextLine();
            
            if(email.contains("@") && email.contains(".com") && !Main.loginData.getEmail().contains(email)) {
    			pass = true;
    		}else if(Main.loginData.getEmail().contains(email)){
    			System.out.println("\n============================================\n EMAIL JÁ CADASTRADO! \n=============================================\n");
    		}else {
    			System.out.println("\n===============================================\n EMAIL INVÁLIDO! \n===============================================\n");
    		}
            
        }while(pass != true);

        pass = false;
        
        do {
        	
        	System.out.println("Digite seu usuario: ");
            user = tratamentoUser(input.nextLine());
            
            if(Main.loginData.getValidUser().contains(user)) {
            	System.out.println("\n===============================================\n USUÁRIO JÁ EXISTE! \n===============================================\n");
            }else {
            	pass = true;
            	System.out.println("\n=====================================\n USUÁRIO "+user+" CADASTRADO COM SUCESSO! \n===================================\n");
            }
            
        }while(pass != true);
        
        pass = false;

        do {
        	
        	System.out.println("Digite seu estado: ");
            if(tratamentoEstado(origemEstado = input.nextLine().toUpperCase())) {
            	System.out.println("\n=====================================\n ESTADO "+origemEstado+" CADASTRADO! \n=====================================\n");
            	pass = true;
            }else {
            	System.out.println("\n=====================================\n ESTADO NÃO EXISTE \n=====================================\n");
            }
            
        }while(pass != true);
        
        pass = false;

        do {
            System.out.println("Digite sua senha: ");

            senha1 = input.next();
            
            if(senha1.length()<5) {
            	System.out.println("\n=====================================\n ERRO: A SENHA DEVE CONTER NO MÍNIMO 5 CARACTERES \n=====================================\n");
            }

            System.out.println("Digite sua senha novamente: ");
            senha2 = input.nextLine();

            if (senha1.equals(senha2)) {
                System.out.println("As senhas não conferem.");
            }else {
            	String pwd = "";
            	System.out.println("\n=====================================\n CONFIRMACAO DOS DADOS \n=====================================\n");
            	System.out.println("Nome: "+nome);
            	System.out.println("Email: "+email);
            	System.out.println("CPF/CNPJ: "+cpf);
            	System.out.println("Estado: "+origemEstado);
            	for (byte i=0;i<=senha1.length();i++) {
					pwd += "*";
				}
            	System.out.println(pwd);
            	System.out.println("\n=====================================\n CONFIRMAR DADOS? (Sim/Não) \n=====================================\n");
            	pwd = input.nextLine();
            	switch(pwd.toLowerCase()) {
            	case "sim", "s", "1":
            		pass = true;
            		break;
            	case "não", "n", "2":
            		System.out.println("\n=====================================\n ENCERRANDO CADASTRO... \n=====================================\n");
            		senha1 = "sair";
            		break;
            	default:
            		System.out.println("Sim ou não??");
            		break;
            	}
            	
            }

            if(senha1.equals("sair")) {
            	break;
            }
            
        } while (pass != true);
        
        
        
        System.out.println("Usuário cadastrado com sucesso!");
        
        Main.loginData.setCpf(cpf, tamanho);
        Main.loginData.setNome(nome, tamanho);
        Main.loginData.setEmail(email, tamanho);
        Main.loginData.setUser(user, tamanho);
        Main.loginData.setEstadoOrigem(origemEstado, tamanho);
        Main.loginData.setSenha(senha1, tamanho);
        Main.loginData.setIsEnterpriseBD(false, tamanho);
        Menu.option = "0";
		
	}
	
	// FUNÇÃO PARA CADASTRAR TRANSPORTADORA
	public void registerTransportadora() {
		
		byte tamanho = (byte) Main.loginData.getUser().size();

        String cpf, nome, email, user, origemEstado, senha1, senha2;

        System.out.println("Insira os dados para se cadastrar.");
        System.out.println("Digite seu CNPJ: ");
        cpf = input.nextLine();

        System.out.println("Digite o nome da transportadora: ");
        nome = input.nextLine();

        System.out.println("Digite seu e-mail: ");
        email = input.nextLine();

        System.out.println("Digite seu usuario: ");
        user = input.nextLine();

        System.out.println("Digite seu estado: ");
        if(tratamentoEstado(origemEstado = input.nextLine().toUpperCase())) {
        	
        }

        do {
            System.out.println("Digite sua senha: ");
            senha1 = input.nextLine();

            System.out.println("Digite sua senha novamente: ");
            senha2 = input.nextLine();

            if (!senha1.equals(senha2)) {
                System.out.println("As senhas n�o conferem.");
            }

        } while (!senha1.equals(senha2));
        System.out.println("Empresa cadastrada com sucesso!");

        Main.loginData.setCpf(cpf, tamanho);
        Main.loginData.setNome(nome, tamanho);
        Main.loginData.setEmail(email, tamanho);
        Main.loginData.setUser(user, tamanho);
        Main.loginData.setEstadoOrigem(origemEstado, tamanho);
        Main.loginData.setSenha(senha1, tamanho);
        Main.loginData.setIsEnterpriseBD(true, tamanho);
        Menu.option = "0";
		
	}
	
	private String tratamentoCpf(String cpf) {
	
		try {
			cpf = cpf.replace(".", "");
			cpf = cpf.replace("-", "");
			cpf = cpf.replace("/", "");
			final long CPF = Long.parseLong(cpf);
			;
			if(Main.loginData.getCpf().contains(String.valueOf(CPF)) == true) {
				return "CPF JÁ EXISTE";
			}else {
				return cpf;
			}
		}catch(Exception e) {
			return "DOCUMENTO INVÁLIDO!";
		}
		
	}
	
	// FALTA VALIDAR NOME REPETIDO
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

	private String tratamentoUser(String user) {
		
		user = user.replace(" ", "_");
		
		return user;
	}
	
	private boolean tratamentoEstado(String estado) {
		
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
	
}
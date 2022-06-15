package br.com.entra21.teamroxo.transport.classes;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.Menu;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.Menu;

public class RunLogin {

	static Scanner input = new Scanner(System.in);

	// FUNÃ‡ÃƒO PARA FAZER LOGIN
	public void loging() {

		String user;
		String senha;
		boolean find = false;
		byte userIndex;

		System.out.println("!> DIGITE O NOME, USUARIO OU EMAIL");
		user = input.nextLine();

		do {
			for (int i = 0; i < Main.loginData.getUser().size(); i++) {
				if (user.toLowerCase().equals(Main.loginData.getUser((byte) i).toLowerCase())
						|| user.toLowerCase().equals(Main.loginData.getNome((byte) i).toLowerCase())
						|| user.toLowerCase().equals(Main.loginData.getEmail((byte) i).toLowerCase())) {

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
			System.out.println("USUARIO Nï¿½O ENCONTRADO!");
		}

	}

	// FUNÃ‡ÃƒO PARA FAZER CADASTRO DE CLIENTE - PESSOA FÍSICA
	public void registerCliente() {

		byte tamanho = (byte) Main.loginData.getUser().size();

        String cpf, nome, email, user, origemEstado, senha1, senha2;
        boolean isEnterprise, pass = false;

        System.out.println("Insira os dados para se cadastrar.");
        
        do {
        	System.out.println("Digite seu CPF/CNPJ: ");
        	
            cpf = tratamentoCpf(input.nextLine());
            
            if(cpf.length() == 11){
            	isEnterprise = false;
            	pass = true;
            	System.out.println("CADASTRANDO PESSOA FÍSICA (CPF)");
            }else if(cpf.length() == 14) {
            	isEnterprise = true;
            	pass = true;
            	System.out.println("CADASTRANDO TRANSPORTADORA (CNPJ)");
            }else {
            	System.out.println("CPF/CNPJ INVÁLIDO!");
            }
            
        }while(pass != true);
        
        System.out.println("Digite seu nome completo: ");
        nome = tratamentoNome(input.nextLine());

        //PAREI AQUI... <--------------------------------------------
        System.out.println("Digite seu e-mail: ");
        email = input.next();
        
        //email.contains("@");
        //email.contains(".com");

        System.out.println("Digite seu usuario: ");
        user = input.next();
        
        email = input.nextLine();

        System.out.println("Digite seu usuario: ");
        user = input.nextLine();

        System.out.println("Digite seu estado: ");
        origemEstado = input.nextLine();

        do {
            System.out.println("Digite sua senha: ");

            senha1 = input.next();
            
            //senha1.length() < 8;


            System.out.println("Digite sua senha novamente: ");
            senha2 = input.nextLine();

            if (!senha1.equals(senha2)) {
                System.out.println("As senhas não conferem.");
            }

        } while (!senha1.equals(senha2));
        System.out.println("Usuário cadastrado com sucesso!");

        //confirmaÃ§Ã£o dos dados
        
        Main.loginData.setCpf(cpf, tamanho);
        Main.loginData.setNome(nome, tamanho);
        Main.loginData.setEmail(email, tamanho);
        Main.loginData.setUser(user, tamanho);
        Main.loginData.setEstadoOrigem(origemEstado, tamanho);
        Main.loginData.setSenha(senha1, tamanho);
        Main.loginData.setIsEnterpriseBD(false, tamanho);
        Menu.option = "0";
		
	}
	
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
        origemEstado = input.next();

        do {
            System.out.println("Digite sua senha: ");
            senha1 = input.nextLine();

            System.out.println("Digite sua senha novamente: ");
            senha2 = input.nextLine();

            if (!senha1.equals(senha2)) {
                System.out.println("As senhas não conferem.");
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
			final long CPF;
			cpf = cpf.replace(".", "");
			cpf = cpf.replace("-", "");
			cpf = cpf.replace("/", "");
			CPF = Long.parseLong(cpf);
			return cpf;
		}catch(Exception e) {
			return "ERROR!";
		}
		
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
	
	// A FAZER
	private String mostrarCpf(String cpf) {
		return null;
	}
	
	//A FAZER
	private String tratamentoEmail(String email) {
		return null;
	}
	
	//A FAZER
	private String tratamentoUser(String user) {
		return null;
	}
	
	
	
}
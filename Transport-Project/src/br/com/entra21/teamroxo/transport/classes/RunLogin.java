package br.com.entra21.teamroxo.transport.classes;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.Menu;

public class RunLogin {

	static Scanner input = new Scanner(System.in);

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
			System.out.println("USU�ARIO NÃO ENCONTRADO!");
		}

	}

	// FUNÇÃO PARA FAZER CADASTRO DE CLIENTE - PESSOA FISICA
	public void registerPF() {
		
		byte tamanho = (byte) Main.loginData.getUser().size();

        String cpf, nome, email, user, origemEstado, senha1, senha2;

        System.out.println("Insira os dados para se cadastrar.");
        System.out.println("Digite seu CPF/CNPJ: ");
        cpf = input.nextLine();

        System.out.println("Digite seu nome completo: ");
        nome = input.nextLine();

        System.out.println("Digite seu e-mail: ");
        email = input.nextLine();

        System.out.println("Digite seu usuario: ");
        user = input.nextLine();

        System.out.println("Digite seu estado: ");
        origemEstado = input.nextLine();

        do {
            System.out.println("Digite sua senha: ");
            senha1 = input.nextLine();

            System.out.println("Digite sua senha novamente: ");
            senha2 = input.nextLine();

            if (!senha1.equals(senha2)) {
                System.out.println("As senhas não conferem.");
            }

        } while (!senha1.equals(senha2));
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
	
	public void registerPJ() {
		
		byte tamanho = (byte) Main.loginData.getUser().size();

        String cpf, nome, email, user, origemEstado, senha1, senha2;

        System.out.println("Insira os dados para se cadastrar.");
        System.out.println("Digite seu CNPJ: ");
        cpf = input.nextLine();

        System.out.println("Digite o nome da empresa: ");
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
		
		return null;
		
	}
	
	private String tratamentoUser(String user) {
		
		return null;
		
	}
	
	private String tratamentoNome(String nome) {
		
		return null;
		
	}
	
}

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

		System.out.println("!> DIGITE O NOME, USUÁRIO OU EMAIL");
		user = input.nextLine();

		do {
			for (int i = 0; i < Main.loginData.getUser().size(); i++) {
				if (user.toLowerCase().equals(Main.loginData.getUser((byte) i).toLowerCase())
						|| user.toLowerCase().equals(Main.loginData.getNome((byte) i).toLowerCase())
						|| user.toLowerCase().equals(Main.loginData.getEmail((byte) i).toLowerCase())) {

					System.out.println("!=======================> USUÁRIO ENCONTRADO! <=======================!");
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
			
		} while (!Menu.option.equals("0"));
		
		if(find == false) {
			System.out.println("USUÁRIO NÃO ENCONTRADO!");
		}

	}

	// FUNÇÃO PARA FAZER CADASTRO DE CLIENTE - PESSOA FÍSICA
	public void registerPF() {
		
		// A FAZER
		
	}
	
	public void registerPJ() {
		
		// A FAZER
		
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

package br.com.entra21.teamroxo.transport.classes;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.Main;

public class RunLogin {

	static Scanner input = new Scanner(System.in);

	// FUNÇÃO PARA FAZER LOGIN
	public void loging() {

		String user;
		String senha;
		byte userIndex;

		System.out.println("!> DIGITE O NOME, USUÁRIO OU CPF:");
		user = input.nextLine();

		for (int i = 0; i < Main.loginData.getUser().size(); i++) {
			if (user.toLowerCase().equals(Main.loginData.getUser((byte) i).toLowerCase()) || 
					user.toLowerCase().equals(Main.loginData.getNome((byte) i).toLowerCase()) || 
					user.toLowerCase().equals(Main.loginData.getEmail((byte) i).toLowerCase()) || 
					user.toLowerCase().equals(Main.loginData.getCpf((byte) i))) {
				System.out.println("!=======================> USUÁRIO ENCONTRADO! <=======================!");
				userIndex = (byte) i;
				
				System.out.println("!> DIGITE SUA SENHA:");
				senha = input.nextLine();
				
				if (senha.equals(Main.loginData.getSenha(userIndex))) {
					System.out.println("!=======================> LOGIN REALIZADO COM SUCESSO! <=======================!");
					Login.logged = true;
					
					if (Main.loginData.getIsEnterpriseBD(userIndex) == true) {
						Login.isEnterpriseAccount = true;
					} else {
						Login.isEnterpriseAccount = false;
					}
					senha = "V";
				} else {
					System.out.println("!=======================> SENHA INCORRETA! <=======================!");
					System.out.println("!> DIGITE 0 SE QUISER SAIR");
				}
				
			} else {
				System.out.println("USUÁRIO NÃO ENCONTRADO!");
			}

		}

	}

	public void registerPF() {
		
		
		
	}
	
	public void registerPJ() {
		
	}
	
}

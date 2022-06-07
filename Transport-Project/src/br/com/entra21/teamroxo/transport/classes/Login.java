package br.com.entra21.teamroxo.transport.classes;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.herancas.*;

public class Login extends PessoaDados {
	static Scanner input = new Scanner(System.in);

	public static void aprender() {
		byte option;

		do {
			System.out.println("0 - Voltar");
			System.out.println("1 - Login");
			System.out.println("2 - Cadastro");

			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Voltando ao menu anterior..");
				//função do menu anterior
				break;

			case 1:
				login();
				break;

			case 2:
				cadastroLogin();
				break;

			default:
				System.out.println("Digite o número do menu");
				break;
			}

		} while (option != 0);

	}

	private static void cadastroLogin() {
		String nome, user, email, cpf, senha1, senha2;
		
		System.out.println("Digite seu nome completo: ");
		nome = input.next();
		
		System.out.println("Digite um login: ");
		user = input.next();
		
		System.out.println("Digite seu e-mail: ");
		email = input.next();
		
		System.out.println("Digite seu CPF: ");
		cpf = input.next();
		
		System.out.println("Digite sua senha: ");
		senha1 = input.next();
		
		System.out.println("Repita sua senha: ");
		senha2 = input.next();
		
		//Teste de validade da senha
		if(senha1==senha2) {
			System.out.println("Sucesso, seu cadastro foi realizado.");
			
		} 
		else {
			
		}
	}

	private static void login() {
		// TODO Auto-generated method stub
		
	}

	
}

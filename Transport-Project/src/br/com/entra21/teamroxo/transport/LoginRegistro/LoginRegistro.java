package br.com.entra21.teamroxo.transport.LoginRegistro;

import java.util.Scanner;

public class LoginRegistro {

	static Scanner input = new Scanner(System.in);

	public static void MenuInicial() {

		byte option;
		do {
			System.out.println("---Empresa-Titulo---");
			System.out.println("\n 1 - Login");
			System.out.println("\n 2 - Cadastrar Pedidos");
			System.out.println("\n 3 - Rastrear Pedidos");
			System.out.println("\n 0 - Sair");
			System.out.println("--------------------");
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Encerrando o programa...");
				break;

			case 1:
				// Login
				break;

			case 2:
				// Cadastrar
				break;

			case 3:
				// Rastrear
				break;

			default:
				System.out.println("Por favor, escolha uma opção valida!");
				break;

			}
		} while (option != 0);

	}

	private static void Login() {
//Login.login();
	}

	private static void Registro() {
//Login.cadastroLogin
	}

	private static void menuPf() {
		byte option;
		do {
			System.out.println("---Empresa-Titulo---");
			System.out.println("\n 1 - Meus Pedidos");
			System.out.println("\n 2 - Alterar Cadastro");
			System.out.println("\n 0 - Sair");
			System.out.println("--------------------");
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Encerrando o programa...");
				break;

			case 1:
				// Meus pedidos
				break;

			case 2:
				// Alterar
				break;

			default:
				System.out.println("Por favor, escolha uma opção valida!");
				break;

			}
		} while (option != 0);

	}

	private static void menuPj() {
		byte option;
		do {
			System.out.println("---Empresa-Titulo---");
			System.out.println("\n 1 - Remessas");
			System.out.println("\n 2 - Alterar Veiculos");
			System.out.println("\n 3 - Alterar Cadastro");
			System.out.println("\n 0 - Sair");
			System.out.println("--------------------");
			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Encerrando o programa...");
				break;

			case 1:
				// Remessas
				break;

			case 2:
				// Alterar V
				break;

			case 3:
				// Alterar C
				break;

			default:
				System.out.println("Por favor, escolha uma opção valida!");
				break;

			}
		} while (option != 0);
	}
}
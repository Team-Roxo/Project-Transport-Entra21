package br.com.entra21.teamroxo.transport;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.classes.*;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		if() {
			
		}
		
		byte option;
		do {
			System.out.println(inicialMenu());
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Volte sempre!!");
				break;

			case 1:

				break;

			case 2:

				break;

			case 3:

				break;

			default:
				System.out.println("Por favor,escolha uma opção válida!!");
				break;

			}

		} while (option != 0);

	}

	private static String inicialMenu() {
		String menu = "Saida21";

		menu += "\n  1 - Login";
		menu += "\n  2 - Cadastrar Pedidos";
		menu += "\n  3 - Rastrear Pedidos";
		menu += "\n  0 - Sair";

		return menu;
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

package br.com.entra21.teamroxo.transport;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.anotacoes.Startup;
import br.com.entra21.teamroxo.transport.classes.*;
import br.com.entra21.teamroxo.transport.scripts.LoginScript;

public class Main {

	public static Login loginData = new Login();
	public static Pedidos pedidoData = new Pedidos();
	public static Transporte transporteData = new Transporte();
	
	static Scanner input = new Scanner(System.in);
	
	@Startup
	public static void main(String[] args) {

		LoginScript.main(null); 
		
		if (Login.logged == false) {
			startupMenu();
		} else if (Login.logged == true && Login.isEnterpriseAccount == false) {
			menuPF();
		} else {
			menuPJ();
		}

	}

	private static void startupMenu() {

		Login mainLogin = new Login();
		String option;

		do {
			System.out.println(constructorMenu());

			option = input.nextLine();

			switch (option.toLowerCase()) {
			case "0", "sair":
				System.out.println("Encerrando o programa...");
				break;				
			case "1", "login":
				mainLogin.menuLogin();
				break;
			case "2", "cp", "cadastrar pedido":

				break;
			case "3", "rp", "rastrear pedidos":

				break;
			default:
				System.out.println("Por favor, escolha uma opção válida!!");
				break;
			}

		} while (option != "0");

	}

	private static String constructorMenu() {
		String menu = "!=================> Saida21 <=================!\n";

		menu += "\n1 - Login/Cadastrar";
		menu += "\n2 - Cadastrar Pedidos (CP)";
		menu += "\n3 - Rastrear Pedidos (RP)";
		menu += "\n0 - Sair\n";
		menu += "!=================> Saida21 <=================!";

		return menu;
	}

	private static void menuPF() {
		byte option;
		do {
			System.out.println("!=================> Saida21 <=================!\n");
			System.out.println("\n1 - Meus Pedidos");
			System.out.println("\n2 - Alterar Cadastro");
			System.out.println("\n0 - Sair");
			System.out.println("\n!=================> Saida21 <=================!");
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

	private static void menuPJ() {
		byte option;
		do {
			System.out.println("!=================> Saida21 <=================!\n");
			System.out.println("\n 1 - Remessas");
			System.out.println("\n 2 - Alterar Veiculos");
			System.out.println("\n 3 - Alterar Cadastro");
			System.out.println("\n 0 - Sair");
			System.out.println("\n!=================> Saida21 <=================!");
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

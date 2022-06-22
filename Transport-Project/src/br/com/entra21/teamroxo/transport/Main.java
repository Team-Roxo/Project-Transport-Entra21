package br.com.entra21.teamroxo.transport;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.anotacoes.Startup;
import br.com.entra21.teamroxo.transport.anotacoes.WhyHere;
import br.com.entra21.teamroxo.transport.classes.*;
import br.com.entra21.teamroxo.transport.log.Logistica;
import br.com.entra21.teamroxo.transport.scripts.StartupScript;

public class Main {

	@WhyHere
	public static Login loginData = new Login();
	@WhyHere
	public static Pedidos pedidoData = new Pedidos();
	@WhyHere
	public static Transporte transporteData = new Transporte();
	static String option;
	static Scanner input = new Scanner(System.in);

	@Startup
	public static void main(String[] args) {

		StartupScript.main(null);

		do {
			if (Login.logged == false) {
				startupMenu();
			} else if (Login.logged == true && Login.isEnterpriseAccount == false) {
				menuPF();
			} else {
				menuPJ();
			}
		} while (!option.equals("0"));

	}

	private static void startupMenu() {

		do {
			System.out.println(constructorMenu());

			option = input.nextLine();

			switch (option.toLowerCase()) {
			case "0", "sair":
				System.out.println("Encerrando o programa...");
				System.exit(1);
				break;
			case "1", "login":

				loginData.Cadastro();

				break;
			case "2", "cp", "cadastrar pacote":

				pedidoData.cadastrarPacote();

				break;
			case "3", "rp", "rastrear pacote":

				pedidoData.rastrearPacote();

				break;

			case "1122334455", "adminlista":

				Logistica.listarTransportadoras();
				Pedidos.listarPacotesFull();
				Login.listarLogin();

				break;

			default:
				System.out.println("Por favor, escolha uma opcao valida!");
				break;
			}

		} while (loginData.logged == false);

	}

	private static String constructorMenu() {
		String menu = "\n============================================\n Saida21 \n============================================\n";

		menu += "\n1 - Login/Cadastrar\n";
		menu += "2 - Cadastrar Pacote (CP)\n";
		menu += "3 - Rastrear Pacote (RP)\n";
		menu += "0 - Sair\n";
		menu += "\n============================================\n Saida21 \n============================================\n";

		return menu;
	}

	private static void menuPF() {
		do {
			System.out.println(
					"\n=====================================\n Saida21 \n=====================================\n");
			System.out.println("\n1 - Meus Pedidos/Envios");
			System.out.println("\n2 - Cadastrar Pacote");
			System.out.println("\n3 - Alterar Cadastro");
			System.out.println("\n4 - Mostrar Meus Dados");
			System.out.println("\n5 - Listar transportadoras");
			System.out.println("\n6 - Excluir cadastro");
			System.out.println("\n7 - Excluir transportadora");
			System.out.println("\n8 - Logoff");
			System.out.println("\n0 - Sair");
			System.out.println(
					"\n=====================================\n Saida21 \n=====================================\n");
			option = input.nextLine();

			switch (option) {

			case "0":
				System.out.println(
						"\n=====================================\n ENCERRANDO O PROGRAMA... \n=====================================\n");
				System.exit(1);
				break;

			case "1":

				pedidoData.listarPacotes();

				break;

			case "2":

				pedidoData.cadastrarPacote();

				break;
			case "3":

				loginData.alterarCadastro();

				break;
			case "4":

				loginData.mostrarLogin();

				break;
			case "5":

				Logistica.listarTransportadoras();

				break;

			case "6":

				RunLogin.excluirCadastro();

				break;

			case "7":

				Logistica.excluirTransportadoras();

				break;

			case "8":

				Login.logged = false;

				break;

			default:
				System.out.println("Por favor, escolha uma opcao valida!");
				break;

			}

		} while (loginData.logged == true && loginData.isEnterpriseAccount == false);

	}

	private static void menuPJ() {
		do {
			System.out.println(
					"\n=====================================\n Saida21 \n=====================================\n");
			System.out.println("\n 1 - Remessas");
			System.out.println("\n 2 - Alterar Veiculos");
			System.out.println("\n 3 - Alterar Cadastro");
			System.out.println("\n 4 - Listar transportadoras");
			System.out.println("\n 0 - Sair");
			System.out.println(
					"\n=====================================\n Saida21 \n=====================================\n");
			option = input.next();

			switch (option) {

			case "0":
				System.out.println("Encerrando o programa...");
				break;

			case "1":

				// Remessas

				break;

			case "2":

				// Alterar V

				break;

			case "3":

				// Alterar C

				break;

			case "4":

				Logistica.listarTransportadoras();

				break;

			default:
				System.out.println("Por favor, escolha uma opcao valida!");
				break;

			}
		} while (loginData.logged == true && loginData.isEnterpriseAccount == true);

	}

}

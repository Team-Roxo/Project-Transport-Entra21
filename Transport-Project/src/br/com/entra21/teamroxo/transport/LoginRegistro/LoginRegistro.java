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


	/*Registro,: Pf, Pj
	new Menu(" Qual vai ser o tipo da conta \n",
			new ArrayList<>(
					Arrays.asList("Pessoa Fisica", "Pessoa Juridica")))
			.Menu();
	*/
	
	
	
	//cadastrar pedidos: Remetente,Destinatario,Empresa que ira enviar,Pedir largura,altura e comprimento(tem que ser em Cm)
	private static void cadastrarPedidos() {
		
		String paoDeQueijo;
		
		
	System.out.println("---Empresa-Titulo---");
	System.out.println("Por favor, Coloque o CPF do Remetente: ");
	
	
	System.out.println("Agora digite o nome do mesmo: ");
	
	
	System.out.println("Digite o Estado que o Remetente reside: ");
	
	
	System.out.println("---Destinatario---");
	System.out.println("Digite o Cpf do destinatario: ");
	
	
	System.out.println("Digite o nome do destinatario: ");
	
	
	System.out.println("Digite o Estado em que o destinatario reside: ");
	
	
	System.out.println("---Pacote---");
	System.out.println("Agora por favor digite o tamanho do pacote: ");
	System.out.println("Largura: ");
	
	
	System.out.println("Altura: ");
	
	
	System.out.println("Comprimento: ");
	
	
	System.out.println("--------------------");
	paoDeQueijo = input.nextLine();
	
	;
	
	
	
	
	//Alterar cadastro: 
	
	
	
	}
}
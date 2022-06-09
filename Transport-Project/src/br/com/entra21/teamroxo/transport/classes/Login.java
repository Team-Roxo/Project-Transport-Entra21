package br.com.entra21.teamroxo.transport.classes;

import java.util.Scanner;
import br.com.entra21.teamroxo.transport.herancas.*;

public class Login extends PessoaDados {

	static Scanner input = new Scanner(System.in);

	//IDEIA PARA FAZER NA CLASSE LOGIN
	
	/*
	 * 
	 * -> Construtor da classe para chamar (primeiro vazio e depois com os objetos)
	 * 
	 * -> Segundo construtor de validação (eu (kalil) irei fazer as validações) para se 
	 * 	  ele já estiver Logado mostrar um Menu para ALTERAR, LISTAR SEUS PEDIDOS, etc 
	 * 	  
	 * -> Se não, mostrar OUTRO Menu com opções para fazer LOGIN e CADASTRAR-SE (se houver
	 * 	  mais pontos, só adicionarem). 	 
	 * 
	 * -> Depois dos construtores de LOGADO ou NÃO LOGADO, chamar função pra alternativas acima
	 * 	  como: listar pedidos, alterar cadastro (oferecendo opção doq ele quer trocar). 
	 * 
	 * 
	 */
	
	
	
	public static void aprender() {
		byte option;

		do {
			System.out.println("0 - Voltar");
			System.out.println("1 - Login");
			System.out.println("2 - Cadastro");
			System.out.println("3 - Alterar cadastro");
			System.out.println("4 - Excluir usu�rio");

			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Voltando ao menu anterior..");

				break;

			case 1:
				login();
				break;

			case 2:
				cadastroLogin();
				break;

			case 3:
				alterarCadastro();
				break;

			case 4:
				excluirUsuario();
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

		// Teste de validade da senha
		if (senha1 == senha2) {
			System.out.println("Sucesso, seu cadastro foi realizado.");

		} else {

		}
	}

	private static void login() {


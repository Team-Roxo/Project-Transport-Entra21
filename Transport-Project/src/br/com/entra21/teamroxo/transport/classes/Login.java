package br.com.entra21.teamroxo.transport.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.com.entra21.teamroxo.transport.herancas.*;

public class Login extends PessoaDados {

	static Scanner input = new Scanner(System.in);


	static HashMap<String, String> login = new HashMap<>();

	public Login(String nome, HashSet<String> user, HashSet<String> email, HashSet<String> cpf, String senha) {
		super(nome, user, email, cpf, senha);
	}

	public static void cadastroLogin() {

		String cpfLogin, nomeLogin, emailLogin, senhaLogin, userLogin, senha1, senha2;
		// String[] dados = new String[] {};

		HashMap<String, String[]> login = new HashMap<>();

		// limpa todos os dados
		login.clear();

		System.out.println("Insira os dados para se cadastrar.");

		System.out.println("Digite seu CPF: ");
		cpfLogin = input.next();
		login.put(cpfLogin, null);

		System.out.println("Digite seu nome completo: ");
		nomeLogin = input.next();

		System.out.println("Digite seu e-mail: ");
		emailLogin = input.next();

		System.out.println("Digite seu usu�rio: ");
		userLogin = input.next();

		do {
=======
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


			System.out.println("Digite sua senha: ");
			senha1 = input.next();

			System.out.println("Digite novamente sua senha: ");
			senha2 = input.next();


			// sempre est� entrando no IF, mesmo com senhas iguais
			// if (senha1 != senha2) {
			// System.out.println("As senhas n�o conferem, digite novamente!");
			// }

			case 0:
				System.out.println("Voltando ao menu anterior..");

				break;


		} while (senha1 == senha2);

		senhaLogin = senha1;


		System.out.println("Usu�rio cadastrado com sucesso.");

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


		login.put(userLogin, new String[] { nomeLogin, userLogin, emailLogin, cpfLogin, senhaLogin });

	}


	private static void login() {

		String cpfLogin, senhaLogin, userLogin, validLogin;
		HashMap<String, String[]> login = new HashMap<>();

		System.out.println("Insira os dados para o login.");

		// do {

		System.out.println("Digite seu usu�rio: ");
		userLogin = input.next();

		System.out.println("Digite sua senha: ");
		senhaLogin = input.next();

		// validLogin = login.get(userLogin);

		// if(userLogin == login.getOrDefault(userLogin, null)) {

		// }

		// }while();
	}

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


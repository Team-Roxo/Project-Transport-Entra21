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

		System.out.println("Digite seu usuário: ");
		userLogin = input.next();

		do {

			System.out.println("Digite sua senha: ");
			senha1 = input.next();

			System.out.println("Digite novamente sua senha: ");
			senha2 = input.next();

			// sempre está entrando no IF, mesmo com senhas iguais
			// if (senha1 != senha2) {
			// System.out.println("As senhas não conferem, digite novamente!");
			// }

		} while (senha1 == senha2);

		senhaLogin = senha1;

		System.out.println("Usuário cadastrado com sucesso.");

		login.put(userLogin, new String[] { nomeLogin, userLogin, emailLogin, cpfLogin, senhaLogin });

	}

	private static void login() {

		String cpfLogin, senhaLogin, userLogin, validLogin;
		HashMap<String, String[]> login = new HashMap<>();

		System.out.println("Insira os dados para o login.");

		// do {

		System.out.println("Digite seu usuário: ");
		userLogin = input.next();

		System.out.println("Digite sua senha: ");
		senhaLogin = input.next();

		// validLogin = login.get(userLogin);

		// if(userLogin == login.getOrDefault(userLogin, null)) {

		// }

		// }while();
	}

}

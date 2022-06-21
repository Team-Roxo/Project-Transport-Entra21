package br.com.entra21.teamroxo.transport.classes;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.Menu;
import br.com.entra21.teamroxo.transport.anotacoes.CpfErrorCode;
import br.com.entra21.teamroxo.transport.log.Brasil;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.Menu;

public class RunLogin {

	static Scanner input = new Scanner(System.in);

	boolean pass = false;

	// FUNCAO PARA FAZER LOGIN
	public void loging() {

		String user;
		String senha;
		boolean find = false;
		byte userIndex;

		System.out.println("!> DIGITE O USUARIO, EMAIL OU CPF");
		user = input.next();

		do {
			for (int i = 0; i < Main.loginData.getUser().size(); i++) {
				if (user.toLowerCase().equals(Main.loginData.getUser((byte) i).toLowerCase())
						|| user.toLowerCase().equals(Main.loginData.getEmail((byte) i).toLowerCase())
						|| user.toLowerCase().equals(Main.loginData.getCpf((byte) i))) {

					System.out.println(
							"\n====================================\n USUARIO ENCONTRADO! \n====================================\n");
					find = true;
					System.out.println("!> DIGITE SUA SENHA:");
					senha = input.next();

					if (senha.equals(Main.loginData.getSenha((byte) i))) {
						System.out.println(
								"\n====================================\n LOGIN REALIZADO COM SUCESSO! \n====================================\n");
						Login.logged = true;
						Login.account = (byte) i;

						if (Main.loginData.getIsEnterpriseBD((byte) i) == true) {
							Login.isEnterpriseAccount = true;
						} else {
							Login.isEnterpriseAccount = false;
						}

						Menu.option = "0";
						break;

					} else {
						System.out.println(
								"\n====================================\n SENHA INCORRETA! \n====================================\n");
					}

				}

			}

			Menu.option = "0";

		} while (!Menu.option.equals("0"));

		if (find == false) {
			System.out.println(
					"\n====================================\n USUARIO NAO ENCONTRADO! \n====================================\n");
		}

	}

	// FUNCAO PARA CADASTRAR CLIENTE - PF/PJ
	public void registerCliente() {

		byte tamanho = (byte) Main.loginData.getUser().size();

		String cpf, nome, email, user, origemEstado, senha1, senha2;

		System.out.println(
				"\n====================================\n CADASTRO NA PLATAFORMA \n====================================\n");

		do {
			System.out.println("!> DIGITE SEU CPF/CNPJ: ");
			input.nextLine();
			cpf = tratamentoCpf(input.nextLine());

			if (cpf.length() == 11) {
				pass = true;
				System.out.println(
						"\n====================================\n CADASTRANDO PESSOA FISICA (CPF) \n==========================================\n");
			} else if (cpf.length() == 14) {
				pass = true;
				System.out.println(
						"\n========================================\n CADASTRANDO EMPRESA (CNPJ) \n===========================================\n");
			} else {
				System.out.println("\n=================================\n ERRO AO CADASTRAR CPF/CNPJ - CODE: "
						+ cpf.length() + " \n=========================================\n");
			}

		} while (pass != true);

		pass = false;

		if (cpf.length() == 11) {
			System.out.println("!> DIGITE SEU NOME COMPLETO: ");
			nome = tratamentoNome(input.nextLine());
		} else {
			System.out.println("!> DIGITE O NOME DA SUA EMPRESA:  ");
			nome = tratamentoNome(input.nextLine());
		}

		System.out.println("\n=================================\n NOME INSERIDO COM SUCESSO! (" + nome
				+ ") \n=======================================\n");

		do {

			System.out.println("!> DIGITE SEU EMAIL: ");
			email = input.nextLine();

			if (email.contains("@") && email.contains(".com") && !Main.loginData.getEmail().contains(email)) {
				pass = true;
			} else if (Main.loginData.getEmail().contains(email)) {
				System.out.println(
						"\n============================================\n EMAIL JA CADASTRADO! \n=============================================\n");
			} else {
				System.out.println(
						"\n===============================================\n EMAIL INVALIDO! \n===============================================\n");
			}

		} while (pass != true);

		pass = false;

		do {

			System.out.println("!> DIGITE O NOME DE USUARIO: ");
			user = tratamentoUser(input.nextLine());

			if (Main.loginData.getValidUser().contains(user)) {
				System.out.println(
						"\n===============================================\n USUARIO JA EXISTE! \n===============================================\n");
			} else {
				pass = true;
				System.out.println("\n=====================================\n USUARIO " + user
						+ " CADASTRADO COM SUCESSO! \n===================================\n");
			}

		} while (pass != true);

		pass = false;

		do {

			System.out.println("Digite seu estado: ");
			if (tratamentoEstado(origemEstado = input.nextLine().toUpperCase())) {
				System.out.println("\n=====================================\n ESTADO " + origemEstado
						+ " CADASTRADO! \n=====================================\n");
				pass = true;
			} else {
				System.out.println(
						"\n=====================================\n ESTADO NAO EXISTE \n=====================================\n");
			}

		} while (pass != true);

		pass = false;

		do {
			System.out.println("!> DIGITE SUA SENHA: ");

			senha1 = input.next();

			if (senha1.length() < 5) {
				System.out.println(
						"\n=====================================\n ERRO: A SENHA DEVE CONTER NO MINIMO 5 CARACTERES \n=====================================\n");
			} else {

				System.out.println("!> DIGITE SUA SENHA NOVAMENTE: ");
				senha2 = input.next();

				if (senha1.equals(senha2)) {

					String pwd = "";
					System.out.println(
							"\n=====================================\n CONFIRMACAO DOS DADOS \n=====================================\n");
					System.out.println("Nome: " + nome);
					System.out.println("Usurio: " + user);
					System.out.println("Email: " + email);
					System.out.println("CPF/CNPJ: " + cpf);
					System.out.println("Estado: " + origemEstado);
					for (byte i = 0; i <= senha1.length(); i++) {
						pwd += "*";
					}
					System.out.println(pwd);
					System.out.println(
							"\n=====================================\n CONFIRMAR DADOS? (Sim/Nao) \n=====================================\n");
					pwd = input.next();
					switch (pwd.toLowerCase()) {
					case "sim", "s", "1":
						pass = true;
						break;
					case "nao", "n", "2":
						System.out.println(
								"\n=====================================\n ENCERRANDO CADASTRO... \n=====================================\n");
						senha1 = "sair";
						break;
					default:
						System.out.println("Sim ou nao?? >:[ ");
						break;
					}

				} else {

					System.out.println(
							"\n=====================================\n AS SENHAS NAO CONFEREM! \n=====================================\n");

				}

			}

			if (senha1.equals("sair")) {
				break;
			}

		} while (pass != true);

		System.out.println(
				"\n====================================\n USUARIO CADASTRADO COM SUCESSO! \n====================================\n");

		Main.loginData.setCpf(cpf, tamanho);
		Main.loginData.setNome(nome, tamanho);
		Main.loginData.setEmail(email, tamanho);
		Main.loginData.setUser(user, tamanho);
		Main.loginData.setEstadoOrigem(origemEstado, tamanho);
		Main.loginData.setSenha(senha1, tamanho);
		Main.loginData.setIsEnterpriseBD(false, tamanho);
		Menu.option = "0";

	}

	// FUNCAO PARA CADASTRAR TRANSPORTADORA
	public void registerTransportadora() {

		byte tamanho = (byte) Main.transporteData.getEmpresaBD().size();

		String nome, email, senha1, senha2;

		System.out.println("Insira os dados para se cadastrar.");

		System.out.println("Digite o nome da transportadora: ");
		nome = input.nextLine();

		System.out.println("Digite seu e-mail: ");
		email = input.nextLine();

		do {
			System.out.println("Digite sua senha: ");
			senha1 = input.nextLine();

			System.out.println("Digite sua senha novamente: ");
			senha2 = input.nextLine();

			if (!senha1.equals(senha2)) {
				System.out.println("As senhas nao conferem.");
			}

		} while (!senha1.equals(senha2));
		System.out.println("Empresa cadastrada com sucesso!");

		Main.transporteData.setEmpresaBD(nome, tamanho);
		Main.transporteData.setEmailBD(email, tamanho);
		Main.transporteData.setSenhaBD(senha1, tamanho);
		Main.transporteData.setDistanciaIndexBD(0.01f, tamanho);
		Main.transporteData.setVolumeIndexBD(0.02f, tamanho);
		Main.transporteData.setPesoIndexBD(0.001f, tamanho);
		Menu.option = "0";

	}

	// FUNCAO PARA ALTERAR CADASTROS EXISTENTES
	public void alterarCadastro() {

		String senha;

		System.out.println(
				"\n=====================================\n ALTERACAO DE CADASTRO \n=====================================\n");
		System.out.println("!> DIGITE SUA SENHA PARA CONTINUAR: ");
		senha = input.next();

		if (senha.equals(Main.loginData.getSenha(Login.account))) {
			System.out.println("QUAL DADO VOCE QUER ALTERAR?");
			System.out.println("1 - NOME");
			System.out.println("2 - EMAIL");
			System.out.println("3 - SENHA");
			System.out.println("4 - ESTADO");
			System.out.println("5 - CPF/CNPJ");

			switch (input.next().toLowerCase()) {
			case "1", "nome":

				System.out.println("!> DIGITE SEU NOME:");
				Main.loginData.getNomeBD().remove(Login.account);
				input.nextLine();
				Main.loginData.setNome(tratamentoNome(input.nextLine()), Login.account);

				break;
			case "2", "email":

				System.out.println("!> DIGITE SEU NOVO EMAIL:");
				String email = input.next();

				if (email.contains("@") && email.contains(".com") && !Main.loginData.getEmail().contains(email)) {
					System.out.println(
							"\n============================================\n EMAIL ATUALIZADO! \n============================================\n");
					Main.loginData.getEmail().remove(email);
					Main.loginData.getEmailBD().remove(Login.account);
					Main.loginData.setEmail(email, Login.account);
				} else if (Main.loginData.getEmail().contains(email)) {
					System.out.println(
							"\n============================================\n ERRO! EMAIL JA CADASTRADO! \n=============================================\n");
				} else {
					System.out.println(
							"\n===============================================\n ERRO! EMAIL INVALIDO! \n===============================================\n");
				}

				break;
			case "3", "senha":

				System.out.println("!> DIGITE SUA NOVA SENHA:");
				Main.loginData.getSenhaBD().remove(Login.account);
				Main.loginData.setSenha(input.next(), Login.account);

				break;
			case "4", "estado":

				System.out.println("!> DIGITE SEU NOVO ESTADO");
				String origemEstado = input.nextLine();

				if (tratamentoEstado(origemEstado = input.nextLine().toUpperCase())) {
					System.out.println("\n=====================================\n ESTADO " + origemEstado
							+ " ATUALIZADO! \n=====================================\n");
					Main.loginData.getEstadoOrigemBD().remove(Login.account);
					Main.loginData.setEstadoOrigem(origemEstado, Login.account);
				} else {
					System.out.println(
							"\n=====================================\n ESTADO NAO EXISTE \n=====================================\n");
				}

				break;
			case "5", "cpf", "cnpj", "cpf/cnpj":

				System.out.println("!> DIGITE SEU CPF/CNPJ");
				String cpf = tratamentoCpf(input.next());

				if (cpf.length() == 11) {
					System.out.println(
							"\n====================================\n CPF ATUALIZADO! \n==========================================\n");
					Main.loginData.getCpf().remove(Main.loginData.getCpf(Login.account));
					Main.loginData.getCpfBD().remove(Login.account);
					Main.loginData.setCpf(cpf, Login.account);
				} else if (cpf.length() == 14) {
					System.out.println(
							"\n========================================\n CNPJ ATUALIZADO! \n===========================================\n");
					Main.loginData.getCpf().remove(Main.loginData.getCpf(Login.account));
					Main.loginData.getCpfBD().remove(Login.account);
					Main.loginData.setCpf(cpf, Login.account);
				} else {
					System.out.println("\n=================================\n ERRO AO ATUALIZAR CPF/CNPJ: " + cpf
							+ " \n=========================================\n");
				}

				break;
			case "0", "sair":
				break;
			default:

				System.out.println("OPCAO NAO EXISTE! SAINDO...");

				break;
			}

		}

	}

	public static void excluirCadastro() {

		String senha;

		System.out.println(
				"\n=====================================\n EXCLUIR CADASTRO \n=====================================\n");
		System.out.println("!> DIGITE SUA SENHA PARA CONTINUAR: ");
		senha = input.next();

		if (senha.equals(Main.loginData.getSenha(Login.account))) {
			System.out.println("VOCE TEM CERTEZA QUE QUER EXCLUIR SUA CONTA?");

			switch (input.next().toLowerCase()) {
			case "1", "sim", "s":

				Main.loginData.getNomeBD().remove(Login.account);
				Main.loginData.getCpfBD().remove(Login.account);
				Main.loginData.getEmailBD().remove(Login.account);
				Main.loginData.getUserBD().remove(Login.account);
				Main.loginData.getEstadoOrigemBD().remove(Login.account);
				Main.loginData.getSenhaBD().remove(Login.account);
				Main.loginData.getIsEnterpriseBD().remove(Login.account);

				System.out.println("FAZENDO O LOGOFF.");
				Login.logged = false;
				
				break;

			
			default:
				System.out.println("RETORNANDO AO MENU.");

				break;
			}

		}

	}

	// TRATAMENTOS DE DADOS PARA CADASTRO

	@CpfErrorCode
	private String tratamentoCpf(String cpf) {

		try {
			cpf = cpf.replace(".", "");
			cpf = cpf.replace("-", "");
			cpf = cpf.replace("/", "");
			final long CPF = Long.parseLong(cpf); // VALIDAR SE O CPF TEM CARACTERES VALIDOS
			;
			if (Main.loginData.getCpf().contains(String.valueOf(CPF)) == true) {
				return "CPF JA EXISTE";
			} else {
				return cpf;
			}
		} catch (Exception e) {
			return "DOCUMENTO INVALIDO!";
		}

	}

	private String tratamentoNome(String nome) {

		nome = nome.toLowerCase();

		char[] name = nome.toCharArray();
		nome = nome.valueOf(name[0]).toUpperCase();

		for (byte i = 1; i < name.length; i++) {
			if (" ".equals(String.valueOf(name[i]))) {
				nome += nome.valueOf(name[i]);
				nome += nome.valueOf(name[i + 1]).toUpperCase();
				i++;
			} else {
				nome += nome.valueOf(name[i]);
			}
		}

		return nome;

	}

	private String tratamentoUser(String user) {

		user = user.replace(" ", "_");

		return user;
	}

	private boolean tratamentoEstado(String estado) {

		for (byte i = 0; i < Brasil.values().length; i++) {
			if (Brasil.values()[i].getEstadoFull().equals(estado)) {
				return true;
			}
			if (Brasil.values()[i].getEstadoNome().equals(estado)) {
				return true;
			}
			if (Brasil.values()[i].getEstadoSigla().equals(estado)) {
				return true;
			}

		}

		return false;

	}

}
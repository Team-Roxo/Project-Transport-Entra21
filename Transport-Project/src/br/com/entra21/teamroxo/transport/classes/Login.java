package br.com.entra21.teamroxo.transport.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.entra21.teamroxo.transport.herancas.*;
import br.com.entra21.teamroxo.transport.*;

public class Login extends PessoaDados {
	
	static Scanner input = new Scanner(System.in);
	
	private static RunLogin log = new RunLogin();
	public static boolean logged = false;
	public static boolean isEnterpriseAccount = false;
	public static byte account;
	
	public Login() {
		
	}
	
	public static void Cadastro() {
		System.out.println(Menu.executarMenu("LOGIN/CADASTRO", new ArrayList<String>(Arrays.asList("Login\n", "Cadastro Cliente (Remetente/Destinatário)\n", "Cadastro: Transportadora\n"))));
		do {
			Menu.option = input.next();
			switch (Menu.option.toLowerCase()) {
			case "1", "login":
				
				log.loging();
			
				break;
			case "2", "pf", "cliente", "cliente pf":
				
				log.registerCliente();
			
				break;
			case "3", "pj", "transportadora":
				
				log.registerTransportadora();
			
				break;
			case "0", "voltar":
				
				break;
			case "-1", "sair":
				
				System.out.println("!=======================> ENCERRANDO PROGRAMA <=======================!");
				System.exit(1);
				break;
			}
		} while (!Menu.option.equals("0"));
		
	}

	public void mostrarLogin() {
		
		System.out.println("\n============================================\n MEUS DADOS \n============================================\n");
		System.out.println("Nome: "+Main.loginData.getNome(account));
		System.out.println("User: "+Main.loginData.getUser(account));
		System.out.println("E-mail: "+Main.loginData.getEmail(account));
		System.out.println("CPF/CNPJ: "+Main.loginData.getCpf(account));
		System.out.println("Estado de Origem: "+Main.loginData.getEstadoOrigem(account));
		System.out.println("Senha: "+Main.loginData.getSenha(account));
		
	}
	
	public void alterarCadastro() {
		
		log.alterarCadastro();
		
	}
	
}

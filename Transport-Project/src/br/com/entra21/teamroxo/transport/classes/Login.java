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
		System.out.println(Menu.executarMenu("LOGIN/CADASTRO", new ArrayList<String>(Arrays.asList("LOGIN", "CADASTRO: CLIENTE - (PF)", "CADASTRO: TRANSPORTADORA (PJ)"))));
		do {
			Menu.option = input.nextLine();
			switch (Menu.option.toLowerCase()) {
			case "1", "login":
				
				log.loging();
			
				break;
			case "2", "pf", "cliente", "cliente pf":
				
				log.registerPF();
			
				break;
			case "3", "pj", "transportadora":
				
				log.registerPJ();
			
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
	
	public void Logged() {
		System.out.println(Menu.executarMenu("PAINEL DO USUÁRIO", new ArrayList<String>(Arrays.asList("MEUS PEDIDOS (MP)", "ALTERAR CADASTRO (AC)", "LOGOFF (LO)"))));
		do {
			Menu.option = input.nextLine().toLowerCase();
			switch (Menu.option.toLowerCase()) {
			case "1", "pedidos", "meus pedidos", "mp":
				
				
				
				break;
			case "2", "alterar", "alterar cadastro", "ac":
				
				
				
				break;
			case "3", "logoff", "lo":
				
				
				
				break;
			case "0", "voltar":
				
				
				
				break;
			case "-1", "sair":
				System.out.println("!=======================> ENCERRANDO PROGRAMA <=======================!");
				System.exit(1);
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA!");
				break;
			}
		} while (!Menu.option.equals("0") || !Menu.option.equals("voltar") || !Menu.option.equals("sair"));
	}
	
	public void LoggedEnterprise() {
		Menu.executarMenu("PAINEL DA EMPRESA", new ArrayList<String>(Arrays.asList("REMESSAS", "ALTERAR VEÍCULOS", "ALTERAR CADASTRO", "LOGOFF")));
		Menu.option = input.nextLine();
		switch(Menu.option.toLowerCase()) {
		//A FAZER
		}
	}
	
}

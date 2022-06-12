package br.com.entra21.teamroxo.transport.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.entra21.teamroxo.transport.herancas.*;
import br.com.entra21.teamroxo.transport.*;

public class Login extends PessoaDados {
	  
	static Scanner input = new Scanner(System.in);
	private static RunLogin log = new RunLogin();
	private static Menu menu = new Menu();
	public static boolean logged = false;
	public static boolean isEnterpriseAccount = false;
	
	public Login() {
		
	}
	
	//VALIDAÇÃO DE LOGIN E TIPO DE LOGIN
	public void menuLogin() {
		if(logged == false) {
			Cadastro();
		}else {
			if(isEnterpriseAccount == false) {
				this.Logged();
			}else {
				this.LoggedEnterprise();
			}
		}
	}
	
	public Login(String nome, String user, String email, String cpf, String senha) {
		super(nome, user, email, cpf, senha);
	}
	
	private static void Cadastro() {
		System.out.println(menu.executarMenu("LOGIN/CADASTRO", 
				new ArrayList<String>(Arrays.asList("LOGIN", "CADASTRO: CLIENTE - (PF)", "CADASTRO: TRANSPORTADORA (PJ)"))));
		Menu.option = input.nextLine();
		switch(Menu.option.toLowerCase()) {
		case "1", "login":
			log.loging();
			break;
		case "2", "pf", "cliente", "cliente pf":
			log.registerPF(); // A FAZER
			break;
		case "3", "pj", "transportadora":
			log.registerPJ(); // A FAZER
			break;
		}
		
	}
	
	private void Logged() {
		Menu.executarMenu("PAINEL DO USUÁRIO", new ArrayList<String>(Arrays.asList("MEUS PEDIDOS", "ALTERAR CADASTRO", "LOGOFF")));
		Menu.option = input.nextLine();
		switch(Menu.option.toLowerCase()) {
		//A FAZER
		}
	}
	
	private void LoggedEnterprise() {
		Menu.executarMenu("PAINEL DA EMPRESA", new ArrayList<String>(Arrays.asList("REMESSAS", "ALTERAR VEÍCULOS", "ALTERAR CADASTRO", "LOGOFF")));
		Menu.option = input.nextLine();
		switch(Menu.option.toLowerCase()) {
		//A FAZER
		}
	}
	
}

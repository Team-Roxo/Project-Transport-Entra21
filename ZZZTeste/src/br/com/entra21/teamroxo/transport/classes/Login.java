package br.com.entra21.teamroxo.transport.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import br.com.entra21.teamroxo.transport.herancas.*;
import br.teste.entra21.Menu;

public class Login extends PessoaDados {
  
	private RunLogin log;
	public static boolean logged = false;
	public static boolean isEnterpriseAccount = false;
	
	public Login() {
		
	}
	
	public void menuLogin() {
		System.out.println("Menu login");
		if(logged = false) {
			Cadastro();
		}else {
			if(isEnterpriseAccount = false) {
				Logged();
			}else {
				LoggedEnterprise();
			}
		}
	}
	
	public Login(String nome, String user, String email, String cpf, String senha) {
		super(nome, user, email, cpf, senha);
	}
	
	/*
	 * public Login() {
	 * 
	 * if(logged = false) { Cadastro(); }else { if(isEnterpriseAccount = false) {
	 * Logged(); }else { LoggedEnterprise(); } }
	 * 
	 * }
	 */
	
	private void Cadastro() {
		Menu.executarMenu("LOGIN/CADASTRO", new ArrayList<String>(Arrays.asList("LOGIN", "CLIENTE PF (Clientes)", "CLIENTE PJ (Empresas)")));
		
		switch(Menu.option) {
		case 1:
			log.loging();
			break;
		case 2:
			break;
		case 3:
			break;
		}
		
	}
	
	private void Logged() {
		Menu.executarMenu("PAINEL DO USUÁRIO", new ArrayList<String>(Arrays.asList("MEUS PEDIDOS", "ALTERAR CADASTRO", "LOGOFF")));
	}
	
	private void LoggedEnterprise() {
		Menu.executarMenu("PAINEL DA EMPRESA", new ArrayList<String>(Arrays.asList("REMESSAS", "ALTERAR VEÍCULOS", "ALTERAR CADASTRO", "LOGOFF")));
	}
	
	private void createLogin() {
		
	}
	
}

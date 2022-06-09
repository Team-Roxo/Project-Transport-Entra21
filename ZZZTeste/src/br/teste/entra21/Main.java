package br.teste.entra21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.com.entra21.teamroxo.transport.classes.Login;
import br.com.entra21.teamroxo.transport.herancas.PessoaDados;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * do {
		 * 
		 * Menu.executarMenu("PROJECT TEAM ROXO: TRANSPORTE", new
		 * ArrayList<String>(Arrays.asList("LOGIN", "RASTREIO", "NOVA REMESSA", "")));
		 * 
		 * }while();
		 */
		
		Login application = new Login("Kalil", "admin", "kjfakhouri@gmail.com", "05325091298", "123456");
		
		application.menuLogin();
			
	}

}

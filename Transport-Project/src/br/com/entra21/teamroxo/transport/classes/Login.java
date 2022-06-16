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
		System.out.println(Menu.executarMenu("LOGIN/CADASTRO", new ArrayList<String>(Arrays.asList("Login\n", "CADASTRO: CLIENTE - (PF)\n", "CADASTRO: TRANSPORTADORA (PJ)\n"))));
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
	
	public void logoff() {
		
		Login.logged = false;
		
	}
	
	public void alterarCadastro() {
		
		log.alterarCadastro();
		
	}
	
}

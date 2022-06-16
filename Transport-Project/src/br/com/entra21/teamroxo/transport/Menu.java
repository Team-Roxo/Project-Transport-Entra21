package br.com.entra21.teamroxo.transport;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

static Scanner input = new Scanner(System.in);
	
	public static String option;
	
	public static String executarMenu(String titulo, ArrayList<String> conteudo) {
		
		String menu = "!================ "+titulo+" ================!\n";
		
		for (int i=0; i<conteudo.size(); i++) {
			menu += "\n"+(i+1)+" - "+conteudo.get(i);
		}
		
		menu += "\n0 - VOLTAR";
		menu += "\n-1 - SAIR";
	
		return menu;
		
	}
	
	public byte capturarOpcao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
package br.teste.entra21;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	static Scanner input = new Scanner(System.in);
	
	public static byte option;
	
	public static String executarMenu(String titulo, ArrayList<String> conteudo) {
		
		do {
		String menu = "!================ "+titulo+" ================!";
		
		for (int i=0; i<conteudo.size(); i++) {
			menu += "/t"+(i+1)+" - "+conteudo.get(i);
		}
		
		menu += "/t0 - Voltar";
	
		return menu;
		
		}while(capturarOpcao(option = input.nextByte()) != 0);
		
	}
	
	private static byte capturarOpcao(byte op) {
		
		switch(op) {
		case 0:
			//cabou :)
			break;
		}
		
		return op;
		
	}
	
}

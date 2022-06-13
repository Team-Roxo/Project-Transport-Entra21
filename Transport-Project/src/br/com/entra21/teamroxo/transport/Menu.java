package br.com.entra21.teamroxo.transport;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	private Scanner entrada = new Scanner(System.in);
	ArrayList<String> opcoes;

	public Menu(ArrayList<String> options) {
		super();
		this.opcoes = options;

	}

	public void Menu() {

		do {

			if (opcoes != null && !opcoes.isEmpty()) {
				for (int contador = 0; contador < opcoes.size(); contador++) {
				System.out.println(" " + (contador + 1) + " = " + opcoes.get(contador));
				}
				System.out.println(" 0 = Voltar");
				System.out.println("-1 = Sair");

			} else {
				System.out.println("Não há itens especificos para essa aula???");
			}

		} while (catchOption() != 0);
	}

public byte catchOption() {
	byte option;
	option = entrada.nextByte();

	switch (option) {

	case -1:
		System.exit(-1);
		;
		break;
	case 0:
		System.out.println("Até a proxima!");
		break;
	}
	return option;
		
		
	}
}



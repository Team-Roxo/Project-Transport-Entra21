package br.com.entra21.teamroxo.transport;

import java.util.HashMap;

public class Repositorio {

	public static HashMap<String, Main> Pessoas = new HashMap<>();
	public static HashMap<String, Main> Transportes = new HashMap<>();

	public static void InicializarPessoas() {

		if (Pessoas.isEmpty()) {
			Pessoas.put(null, null);
			Pessoas.put(null, null);

		}

	}

	public void inicializarTransporte() {
		if (Transportes.isEmpty()) {
			Transportes.put(null, null);
			Transportes.put(null, null);

		}
		
	}
	
}

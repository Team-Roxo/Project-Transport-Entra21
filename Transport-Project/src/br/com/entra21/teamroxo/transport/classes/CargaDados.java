package br.com.entra21.teamroxo.transport.classes;

import java.util.HashMap;
import java.util.HashSet;

import br.com.entra21.teamroxo.transport.herancas.PessoaDados;

public class CargaDados extends PessoaDados{
	
	HashMap<String, String[]> login = new HashMap<>();
	public CargaDados(String nome, HashSet<String> user, HashSet<String> email, HashSet<String> cpf, String senha) {
		super(nome, user, email, cpf, senha);
	
	System.out.println(" ------------- Criando dados --------------");
	login.put("12274953740",
			new String[] { "Mateus", "goettems", "mateusgoettems@gmail.com", "12274953740", "senha123456" });
	login.put("12274953741",
			new String[] { "Mateus", "goettems", "mateusgoettems@gmail.com", "12274953740", "senha123456" });
	login.put("12274953742",
			new String[] { "Mateus", "goettems", "mateusgoettems@gmail.com", "12274953740", "senha123456" });
	login.put("12274953743",
			new String[] { "Mateus", "goettems", "mateusgoettems@gmail.com", "12274953740", "senha123456" });
	
}
}

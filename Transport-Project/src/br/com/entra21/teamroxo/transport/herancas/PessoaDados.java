package br.com.entra21.teamroxo.transport.herancas;

import java.util.HashSet;

public class PessoaDados {

	private String nome;
	private HashSet <String> user = new HashSet<>();
	private HashSet <String> email = new HashSet<>();
	private HashSet <String> cpf = new HashSet<>();
	private String senha;
	
	public PessoaDados() {
		super();
	}

	public PessoaDados(String nome, HashSet<String> user, HashSet<String> email, HashSet<String> cpf, String senha) {
		super();
		this.nome = nome;
		this.user = user;
		this.email = email;
		this.cpf = cpf;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public HashSet<String> getUser() {
		return user;
	}

	public void setUser(HashSet<String> user) {
		this.user = user;
	}

	public HashSet<String> getEmail() {
		return email;
	}

	public void setEmail(HashSet<String> email) {
		this.email = email;
	}

	public HashSet<String> getCpf() {
		return cpf;
	}

	public void setCpf(HashSet<String> cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
}

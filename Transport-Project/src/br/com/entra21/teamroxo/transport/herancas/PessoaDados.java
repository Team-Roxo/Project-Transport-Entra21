package br.com.entra21.teamroxo.transport.herancas;

import java.util.ArrayList;
import java.util.HashSet;

public class PessoaDados {

	//"BANCO DE DADOS"
	private ArrayList <String>  nomeBD         = new ArrayList<>();
	private ArrayList <String>  userBD 		   = new ArrayList<>();
	private ArrayList <String>  emailBD 	   = new ArrayList<>();
	private ArrayList <String>  cpfBD 		   = new ArrayList<>();
	private ArrayList <String>  senhaBD 	   = new ArrayList<>();
	private ArrayList <String>  estadoOrigemBD = new ArrayList<>();
	private ArrayList <Boolean> isEnterpriseBD = new ArrayList<>();
	
	//VALIDA DUPLICIDADE
	private HashSet <String> user  = new HashSet<>();
	private HashSet <String> email = new HashSet<>();
	private HashSet <String> cpf   = new HashSet<>();
	
	public PessoaDados() {
		super();
	}

	public PessoaDados(String nome, String user, String email, String cpf, String senha, String estadoOrigemBD, boolean isEnterprise) {
		super();
		this.nomeBD.add(nome);
		this.userBD.add(user);
		this.emailBD.add(email);
		this.cpfBD.add(cpf);
		this.senhaBD.add(senha);
		this.isEnterpriseBD.add(isEnterprise);
		this.estadoOrigemBD.add(estadoOrigemBD);
		this.user.add(user);
		this.email.add(email);
		this.cpf.add(cpf);
	}

	public String getNome(byte index) {
		return nomeBD.get(index);
	}

	public void setNome(String nome, byte index) {
		this.nomeBD.add(index, nome);
	}

	//Retorna o valor pronta em String dentro do ArrayList
	public String getUser(byte index) {
		return userBD.get(index);
	}
	
	//Retorno a ArrayList inteira, possibilitando usar os Wrappers
	public ArrayList<String> getUser(){
		return userBD;
	}
	
	public ArrayList<String> getEmail(){
		return emailBD;
	}

	public void setUser(String user, byte index) {
		this.userBD.add(index, user);
		this.user.add(this.userBD.get(index));
	}

	public String getEmail(byte index) {
		return emailBD.get(index);
	}

	public void setEmail(String email, byte index) {
		this.emailBD.add(index, email);
		this.email.add(this.emailBD.get(index));
	}

	public String getCpf(byte index) {
		return cpfBD.get(index);
	}

	public void setCpf(String cpf, byte index) {
		this.cpfBD.add(index, cpf);
		this.cpf.add(this.cpfBD.get(index));
	}

	public String getSenha(byte index) {
		return senhaBD.get(index);
	}

	public void setSenha(String senha, byte index) {
		this.senhaBD.add(index, senha);
	}
	
	public String getEstadoOrigem(byte index) {
		return estadoOrigemBD.get(index);
	}

	public void setEstadoOrigem(String estado, byte index) {
		this.estadoOrigemBD.add(index, estado);
	}
	
	public boolean getIsEnterpriseBD(byte index) {
		return isEnterpriseBD.get(index);
	}

	public void setIsEnterpriseBD(boolean isEnterpriseBD, byte index) {
		this.isEnterpriseBD.add(index, isEnterpriseBD);
	}
	
	
	
}

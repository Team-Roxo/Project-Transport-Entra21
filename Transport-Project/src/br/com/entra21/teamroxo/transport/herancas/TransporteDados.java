package br.com.entra21.teamroxo.transport.herancas;

import java.util.ArrayList;
import java.util.HashSet;

public class TransporteDados {

	// BANCO DE DADOS
	private ArrayList<String> empresaBD 	   = new ArrayList<>();
	private ArrayList<String> emailBD 		   = new ArrayList<>();
	private ArrayList<String> senhaBD 		   = new ArrayList<>();
	private ArrayList<Float>  distanciaIndexBD = new ArrayList<>(); //0.01
	private ArrayList<Float>  pesoIndexBD 	   = new ArrayList<>(); //0.02
	private ArrayList<Float>  volumeIndexBD    = new ArrayList<>(); //0.003

	//VALIDA DUPLICIDADE
	private HashSet <String> empresa = new HashSet<>();
	private HashSet <String> email 	 = new HashSet<>();
	
	public TransporteDados() {
		super();
	}
	
	public TransporteDados(String empresaBD, String emailBD, String senhaBD, float distanciaIndex, float pesoIndex, float volumeIndex) {
		super();
		this.empresaBD.add(empresaBD);
		this.emailBD.add(emailBD);
		this.senhaBD.add(senhaBD);
		this.distanciaIndexBD.add(distanciaIndex);
		this.pesoIndexBD.add(pesoIndex);
		this.volumeIndexBD.add(volumeIndex);
		this.empresa.add(empresaBD);
		this.email.add(emailBD);
	}

	//Retorna o valor pronta em String dentro do ArrayList
	public String getEmpresaBD(byte index) {
		return empresaBD.get(index);
	}
	
	//Retorno a ArrayList inteira, possibilitando usar os Wrappers
	public ArrayList<String> getEmpresaBD() {
		return empresaBD;
	}

	public void setEmpresaBD(String empresaBD, byte index) {
		this.empresaBD.add(index, empresaBD);
		this.empresa.add(empresaBD);
	}

	public String getEmailBD(byte index) {
		return emailBD.get(index);
	}

	public void setEmailBD(String emailBD, byte index) {
		this.emailBD.add(index, emailBD);
		this.email.add(emailBD);
	}

	public String getSenhaBD(byte index) {
		return senhaBD.get(index);
	}

	public void setSenhaBD(String senhaBD, byte index) {
		this.senhaBD.add(index, senhaBD);
	}

	public float getDistanciaIndexBD(byte index) {
		return distanciaIndexBD.get(index);
	}

	public void setDistanciaIndexBD(float distanciaIndexBD, byte index) {
		this.distanciaIndexBD.add(index, distanciaIndexBD);
	}

	public float getPesoIndexBD(byte index) {
		return pesoIndexBD.get(index);
	}

	public void setPesoIndexBD(float pesoIndexBD, byte index) {
		this.pesoIndexBD.add(index, pesoIndexBD);
	}

	public float getVolumeIndexBD(byte index) {
		return volumeIndexBD.get(index);
	}

	public void setVolumeIndexBD(float volumeIndexBD, byte index) {
		this.volumeIndexBD.add(index, volumeIndexBD);
	}
	
	
	
}

package br.com.entra21.teamroxo.transport.herancas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;

public class PedidoDados{
	
	//QUANTO AO ENVIO GERAL - BANCO DE DADOS
	private ArrayList <String>    enderecoRemetenteBD  = new ArrayList<>();
	private ArrayList <String>    enderecoDestinoBD    = new ArrayList<>();
	private ArrayList <String>    codigoRastreioBD     = new ArrayList<>();
	private ArrayList <LocalDate> dataEnvioBD 		   = new ArrayList<>();
	private ArrayList <LocalDate> dataChegadaBD 	   = new ArrayList<>();
	private ArrayList <LocalDate> previsaoChegadaBD    = new ArrayList<>();
	private ArrayList <LocalTime> horaEnvioBD 		   = new ArrayList<>();
	private ArrayList <LocalTime> horaChegadaBD 	   = new ArrayList<>();
	
	//DIMENS�ES DO OBJETO - BANCO DE DADOS
	private ArrayList <Float> alturaBD 		= new ArrayList<>();
	private ArrayList <Float> larguraBD 	= new ArrayList<>();
	private ArrayList <Float> comprimentoBD = new ArrayList<>();
	
	//VARIAVEIS QUE DEFINEM VALOR - BANCO DE DADOS
	private ArrayList <Float>  precoFreteBD      	= new ArrayList<>();
	private ArrayList <Byte>   transportadoraBD  	= new ArrayList<>(); //index da transportadora
	private ArrayList <Byte>   remetenteBD       	= new ArrayList<>(); //index do cliente que enviou
	private ArrayList <Byte>   destinatarioBD	 	= new ArrayList<>(); //index do cliente que ir� receber
	
	//VALIDA DUPLICIDADE
	private HashSet <String> codigoRastreio = new HashSet<>();
	
	public PedidoDados() {
		super();
	}

	public PedidoDados(String enderecoRemetenteBD, String enderecoDestinoBD, String codigoRastreioBD, LocalDate dataEnvioBD, LocalDate dataChegadaBD,
			LocalDate previsaoChegadaBD, LocalTime horaEnvioBD,	LocalTime horaChegadaBD, float alturaBD, float larguraBD, float comprimentoBD, 
			float precoFreteBD, byte transportadoraBD, byte remetenteBD, byte destinatarioBD, String codigoRastreio) {
		super();
		this.enderecoRemetenteBD.add(enderecoRemetenteBD);
		this.enderecoDestinoBD.add(enderecoDestinoBD);
		this.codigoRastreioBD.add(codigoRastreioBD);
		this.codigoRastreio.add(codigoRastreioBD);
		this.dataEnvioBD.add(dataEnvioBD);
		this.dataChegadaBD.add(dataChegadaBD);
		this.previsaoChegadaBD.add(previsaoChegadaBD);
		this.horaEnvioBD.add(horaEnvioBD);
		this.horaChegadaBD.add(horaChegadaBD);
		this.alturaBD.add(alturaBD);
		this.larguraBD.add(larguraBD);
		this.comprimentoBD.add(comprimentoBD);
		this.precoFreteBD.add(precoFreteBD);
		this.transportadoraBD.add(transportadoraBD);
		this.remetenteBD.add(remetenteBD);
		this.destinatarioBD.add(destinatarioBD);
		this.codigoRastreio.add(codigoRastreioBD);
	}

	public String getEnderecoRemetenteBD(byte index) {
		return enderecoRemetenteBD.get(index);
	}

	public void setEnderecoRemetenteBD(String enderecoRemetenteBD) {
		this.enderecoRemetenteBD.add(enderecoRemetenteBD);
	}

	public String getEnderecoDestinoBD(byte index) {
		return enderecoDestinoBD.get(index);
	}

	public void setEnderecoDestinoBD(String enderecoDestinoBD) {
		this.enderecoDestinoBD.add(enderecoDestinoBD);
	}

	//Retorna o valor pronta em String dentro do ArrayList
	public String getCodigoRastreioBD(byte index) {
		return codigoRastreioBD.get(index);
	}
	
	//Retorno a ArrayList inteira, possibilitando usar os Wrappers
	public ArrayList<String> getCodigoRastreioBD() {
		return codigoRastreioBD;
	}

	public void setCodigoRastreioBD(String codigoRastreioBD) {
		this.codigoRastreioBD.add(codigoRastreioBD);
	}

	public LocalDate getDataEnvioBD(byte index) {
		return dataEnvioBD.get(index);
	}

	public void setDataEnvioBD(LocalDate dataEnvioBD) {
		this.dataEnvioBD.add(dataEnvioBD);
	}

	public LocalDate getDataChegadaBD(byte index) {
		return dataChegadaBD.get(index);
	}

	public void setDataChegadaBD(LocalDate dataChegadaBD) {
		this.dataChegadaBD.add(dataChegadaBD);
	}

	public LocalDate getPrevisaoChegadaBD(byte index) {
		return previsaoChegadaBD.get(index);
	}

	public void setPrevisaoChegadaBD(LocalDate previsaoChegadaBD) {
		this.previsaoChegadaBD.add(previsaoChegadaBD);
	}

	public LocalTime getHoraEnvioBD(byte index) {
		return horaEnvioBD.get(index);
	}

	public void setHoraEnvioBD(LocalTime horaEnvioBD) {
		this.horaEnvioBD.add(horaEnvioBD);
	}

	public LocalTime getHoraChegadaBD(byte index) {
		return horaChegadaBD.get(index);
	}

	public void setHoraChegadaBD(LocalTime horaChegadaBD) {
		this.horaChegadaBD.add(horaChegadaBD);
	}

	public float getAlturaBD(byte index) {
		return alturaBD.get(index);
	}

	public void setAlturaBD(float alturaBD) {
		this.alturaBD.add(alturaBD);
	}

	public float getLarguraBD(byte index) {
		return larguraBD.get(index);
	}

	public void setLarguraBD(float larguraBD) {
		this.larguraBD.add(larguraBD);
	}

	public float getComprimentoBD(byte index) {
		return comprimentoBD.get(index);
	}

	public void setComprimentoBD(float comprimentoBD) {
		this.comprimentoBD.add(comprimentoBD);
	}

	public float getPrecoFreteBD(byte index) {
		return precoFreteBD.get(index);
	}

	public void setPrecoFreteBD(float precoFreteBD) {
		this.precoFreteBD.add(precoFreteBD);
	}

	public byte getTransportadoraBD(byte index) {
		return transportadoraBD.get(index);
	}

	public void setTransportadoraBD(byte transportadoraBD) {
		this.transportadoraBD.add(transportadoraBD);
	}

	public byte getRemetenteBD(byte index) {
		return remetenteBD.get(index);
	}

	public void setRemetenteBD(byte remetenteBD) {
		this.remetenteBD.add(remetenteBD);
	}

	public byte getDestinatarioBD(byte index) {
		return destinatarioBD.get(index);
	}

	public void setDestinatarioBD(byte destinatarioBD) {
		this.destinatarioBD.add(destinatarioBD);
	}
	
}
package br.com.entra21.teamroxo.transport.herancas;

import java.util.HashSet;

public class PedidoDados{

	//QUANTO AO ENVIO GERAL
	private String enderecoRemetente;
	private String enderecoDestino;
	private String dataEnvio;
	private String dataChegada;
	private String previsaoChegada;
	private String horaEnvio;
	private String horaChegada;
	private HashSet <String> codigoRastreio = new HashSet<>();
	
	//DIMENSÕES DO OBJETO
	private float altura;
	private float largura;
	private float profundidade;
	
	//VARIAVEIS QUE DEFINEM VALOR
	private float precoFrete;
	private String regiaoEnvio;
	private String regiaoEntrega;
	//private String empresaTransporte;
	
	//QUE DEFINEM DONO DO PACOTE (REMETENTE + DESTINATÁRIO)
	private String userRemetente;
	//private String userDestinatario;
	//private String transportadora;
	
	public PedidoDados() {
		super();
	}
	
}

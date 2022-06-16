package br.com.entra21.teamroxo.transport;

import java.util.HashMap;

import br.com.entra21.teamroxo.transport.herancas.PessoaDados;
import br.com.entra21.teamroxo.transport.herancas.TransporteDados;

public class Repositorio {

	
public static HashMap<String,PessoaDados> pessoas = new HashMap<>();
public static HashMap<String, TransporteDados> transportes = new HashMap<>();


public static void inicializarPessoas() {
	if(pessoas.isEmpty()) {
		
	}
	pessoas.put("Bruno", new PessoaDados("Bruno" , "bruno.roberto" , "Bruno@gmail.com" , "456.789.012-34" , "123123" , "PR" , (true) ));
	pessoas.put("Kalil", new PessoaDados("Kalil" , "kalil.jaques" , "kjfakhouri@gmail.com" , "123.456.789-01" , "123123" , "AP" , (false) ));
	pessoas.put("Mateus", new PessoaDados("Mateus" , "mat.felipe" , "mat@gmail.com" , "234.567.890-12" , "123123" , "RS" , (false) ));
	pessoas.put("Cristian", new PessoaDados("Cristian" , "cristian.baade" , "cristian@gmail.com" , "345.678.901-23" , "123123" , "SC" , (true) ));
	
	// perguntar se já deixo inicializada 
	
}

public static void inicializarTransporte() {
	if(transportes.isEmpty()) {
		
	}
	transportes.put("Saida-21", new TransporteDados("SAIDA-21" , "contato@saida21.com.br" , "123456" , (float)0.01f , (float)0.02f , (float)0.003f));
	transportes.put("CORREIOS", new TransporteDados("CORREIOS" , "contato@correios.gov.br" , "123456" , (float)0.03f , (float)0.02f , (float)0.002f));
	transportes.put("AZUL EXPRESS", new TransporteDados("AZUL EXPRESS" , "contato@azul.com.br" , "123456" , (float)0.01f , (float)0.03f , (float)0.005f));
}

}

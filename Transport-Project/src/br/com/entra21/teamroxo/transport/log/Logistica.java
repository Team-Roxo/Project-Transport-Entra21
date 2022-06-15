package br.com.entra21.teamroxo.transport.log;

import br.com.entra21.teamroxo.transport.anotacoes.*;

public class Logistica {

	@Haversine
	private static float haversine(float lat1, float long1, float lat2, float long2) {
		
		float earthRad = 6371;
		
		float distanciaLat = (float) Math.toRadians(lat1 - lat2);
		float distanciaLong = (float) Math.toRadians(long1 - long2);
		
		lat1 = (float) Math.toRadians(lat1);
		lat2 = (float) Math.toRadians(lat2);
		
		float formula = (float) Math.pow(Math.sin(distanciaLat/2), 2) + (float) Math.pow(Math.sin(distanciaLong/2), 2) * 
					    (float) Math.cos(lat1) * (float) Math.cos(lat2);
		
		float calculo = 2 * (float)Math.asin(Math.sqrt(formula));
		
		earthRad *= calculo;
		
		return earthRad;	
		
	}
	
	private static float volume(float comprimento, float largura, float altura) {
		
		float volumeTotal = comprimento*largura*altura;
		return volumeTotal;
		
	}
	
	@PesoCubico
	public float Logistica(float lat1, float long1, float lat2, float long2, float comprimento, 
				 float largura, float altura, float distIndex, float pesoIndex, float volIndex) {
		
		float precoFinal;
		float pesoCubico;
		float distancia;
		
		pesoCubico = volume(comprimento, largura, altura)/6000;
		distancia = haversine(lat1, long1, lat2, long2);
		precoFinal = (float) ((distancia*distIndex)+(pesoCubico*pesoIndex)+(volume(comprimento, largura, altura)*volIndex)); //padrão (respectivamente): 0.01, 0.02, 0.003
		
		return precoFinal;
		
	}
	
}
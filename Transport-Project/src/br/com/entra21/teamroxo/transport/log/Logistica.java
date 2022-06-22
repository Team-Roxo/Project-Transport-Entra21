package br.com.entra21.teamroxo.transport.log;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.anotacoes.*;

public class Logistica {

	static Scanner input = new Scanner(System.in);

	@Haversine
	private static float haversine(float lat1, float long1, float lat2, float long2) {

		float earthRad = 6371;

		float distanciaLat = (float) Math.toRadians(lat1 - lat2);
		float distanciaLong = (float) Math.toRadians(long1 - long2);

		lat1 = (float) Math.toRadians(lat1);
		lat2 = (float) Math.toRadians(lat2);

		float formula = (float) Math.pow(Math.sin(distanciaLat / 2), 2)
				+ (float) Math.pow(Math.sin(distanciaLong / 2), 2) * (float) Math.cos(lat1) * (float) Math.cos(lat2);

		float calculo = 2 * (float) Math.asin(Math.sqrt(formula));

		earthRad *= calculo;

		return earthRad;

	}

	private static float volume(float comprimento, float largura, float altura) {

		float volumeTotal = comprimento * largura * altura;
		return volumeTotal;

	}

	@PesoCubico
	public static float Logistica(float lat1, float long1, float lat2, float long2, float comprimento, float largura,
			float altura, float distIndex, float pesoIndex, float volIndex) {

		float precoFinal;
		float pesoCubico;
		float distancia;

		pesoCubico = volume(comprimento, largura, altura) / 6000;
		distancia = haversine(lat1, long1, lat2, long2);
		precoFinal = (float) ((distancia * distIndex) + (pesoCubico * pesoIndex)
				+ (volume(comprimento, largura, altura) * volIndex)); // padrão (respectivamente): 0.01, 0.02, 0.003

		Random random = new Random();

		// SETA HORA DE CHEGADA
		Main.pedidoData.setHoraChegadaBD(LocalTime.of(LocalTime.now().getHour(),(LocalTime.now().getMinute()+1) ),
				(byte) Main.pedidoData.getCodigoRastreioBD().size());

		return precoFinal;

	}

	public static void listarTransportadoras() {

		System.out.println(
				"\n=====================================\n  TRANSPORTADORAS DISPONIVEIS \n=====================================\n");

		for (int i = 0; i < Main.transporteData.getEmpresaBD().size(); i++) {

			System.out.println(
					"Transportadora N.: " + (i + 1) + "  RAZAO SOCIAL: " + Main.transporteData.getEmpresaBD((byte) i));

		}

	}

	public static void excluirTransportadoras() {

		System.out.println(
				"\n=====================================\n  EXCLUIR TRANSPORTADORAS \n=====================================\n");

		for (int i = 0; i < Main.transporteData.getEmpresaBD().size(); i++) {

			System.out.println(
					"Transportadora N.: " + (i + 1) + "  RAZAO SOCIAL: " + Main.transporteData.getEmpresaBD((byte) i));

		}

		System.out.println(
				"\n=====================================\nSELECIONE O INDICE PARA EXCLUIR A TRANSPORTADORA\n=====================================\n ");
		byte option = input.nextByte();

		System.out
				.println("VOCE SELECIONOU A TRANSPORTADORA: " + Main.transporteData.getEmpresaBD((byte) (option - 1)));

		System.out.println("QUER MESMO EXCLUIR?");

		switch (input.next().toLowerCase()) {
		case "1", "sim", "s":

			Main.transporteData.getEmpresaBD().remove(option - 1);

			System.out.println("TRANSPORTADORA REMOVIDA COM SUCESSO.");

			break;
		case "2", "nao", "n":
			System.out.println("OK, SAINDO!");

			break;
		default:
			System.out.println("OPCAO INVALIDA! SAINDO...");
			break;
		}

	}
}

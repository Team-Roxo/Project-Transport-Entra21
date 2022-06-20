package br.com.entra21.teamroxo.transport.scripts;

import java.time.LocalDate;
import java.time.LocalTime;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.anotacoes.*;
import br.com.entra21.teamroxo.transport.classes.Login;
import br.com.entra21.teamroxo.transport.log.Brasil;
import br.com.entra21.teamroxo.transport.log.Logistica;

@Initialize @Startup
public class StartupScript {

	public static void main(String[] args) {
		
		Main initialize = new Main();
		
		//LOGINS
		initialize.loginData.setNome("Kalil", (byte) 0);
		initialize.loginData.setEmail("kjfakhouri@gmail.com", (byte) 0);
		initialize.loginData.setUser("kalil.jaques", (byte) 0);
		initialize.loginData.setSenha("123123", (byte) 0);
		initialize.loginData.setEstadoOrigem("AP", (byte) 0);
		initialize.loginData.setCpf("12345678901", (byte) 0);
		initialize.loginData.setIsEnterpriseBD(false, (byte) 0);
		
		initialize.loginData.setNome("Mateus", (byte) 1);
		initialize.loginData.setEmail("mat@gmail.com", (byte) 1);
		initialize.loginData.setUser("mat.felipe", (byte) 1);
		initialize.loginData.setSenha("123123", (byte) 1);
		initialize.loginData.setEstadoOrigem("RS", (byte) 1);
		initialize.loginData.setCpf("23456789012", (byte) 1);
		initialize.loginData.setIsEnterpriseBD(false, (byte) 1);
		
		initialize.loginData.setNome("Cristian", (byte) 2);
		initialize.loginData.setEmail("cristian@gmail.com", (byte) 2);
		initialize.loginData.setUser("cristian.baade", (byte) 2);
		initialize.loginData.setSenha("123123", (byte) 2);
		initialize.loginData.setEstadoOrigem("SC", (byte) 2);
		initialize.loginData.setCpf("34567890123", (byte) 2);
		initialize.loginData.setIsEnterpriseBD(false, (byte) 2);
		
		initialize.loginData.setNome("Bruno", (byte) 3);
		initialize.loginData.setEmail("bruno@gmail.com", (byte) 3);
		initialize.loginData.setUser("bruno.roberto", (byte) 3);
		initialize.loginData.setSenha("123123", (byte) 3);
		initialize.loginData.setEstadoOrigem("PR", (byte) 3);
		initialize.loginData.setCpf("45678901234", (byte) 3);
		initialize.loginData.setIsEnterpriseBD(false, (byte) 3);
		
		//TRANSPORTADORAS
		initialize.transporteData.setEmpresaBD("SAIDA-21", (byte) 0);
		initialize.transporteData.setEmailBD("contato@saida21.com.br", (byte) 0);
		initialize.transporteData.setSenhaBD("123456", (byte) 0);
		initialize.transporteData.setDistanciaIndexBD(0.01f, (byte) 0);
		initialize.transporteData.setPesoIndexBD(0.02f, (byte) 0);
		initialize.transporteData.setVolumeIndexBD(0.003f, (byte) 0);
		
		initialize.transporteData.setEmpresaBD("CORREIOS", (byte) 1);
		initialize.transporteData.setEmailBD("contato@correios.gov.br", (byte) 1);
		initialize.transporteData.setSenhaBD("123456", (byte) 1);
		initialize.transporteData.setDistanciaIndexBD(0.025f, (byte) 1);
		initialize.transporteData.setPesoIndexBD(0.02f, (byte) 1);
		initialize.transporteData.setVolumeIndexBD(0.002f, (byte) 1);
		
		initialize.transporteData.setEmpresaBD("AZUL EXPRESS", (byte) 2);
		initialize.transporteData.setEmailBD("contato@azul.com.br", (byte) 2);
		initialize.transporteData.setSenhaBD("123456", (byte) 2);
		initialize.transporteData.setDistanciaIndexBD(0.01f, (byte) 2);
		initialize.transporteData.setPesoIndexBD(0.03f, (byte) 2);
		initialize.transporteData.setVolumeIndexBD(0.008f, (byte) 2);
		
		initialize.transporteData.setEmpresaBD("JAMEF", (byte) 3);
		initialize.transporteData.setEmailBD("contato@jamef.com.br", (byte) 3);
		initialize.transporteData.setSenhaBD("123456", (byte) 3);
		initialize.transporteData.setDistanciaIndexBD(0.01f, (byte) 3);
		initialize.transporteData.setPesoIndexBD(0.03f, (byte) 3);
		initialize.transporteData.setVolumeIndexBD(0.008f, (byte) 3);
		
		initialize.transporteData.setEmpresaBD("SEQUOIA", (byte) 4);
		initialize.transporteData.setEmailBD("contato@sequoia.com.br", (byte) 4);
		initialize.transporteData.setSenhaBD("123456", (byte) 4);
		initialize.transporteData.setDistanciaIndexBD(0.01f, (byte) 4);
		initialize.transporteData.setPesoIndexBD(0.03f, (byte) 4);
		initialize.transporteData.setVolumeIndexBD(0.008f, (byte) 4);
		
		initialize.transporteData.setEmpresaBD("TOTAL EXPRESS", (byte) 5);
		initialize.transporteData.setEmailBD("contato@total.com.br", (byte) 5);
		initialize.transporteData.setSenhaBD("123456", (byte) 5);
		initialize.transporteData.setDistanciaIndexBD(0.01f, (byte) 5);
		initialize.transporteData.setPesoIndexBD(0.03f, (byte) 5);
		initialize.transporteData.setVolumeIndexBD(0.008f, (byte) 5);
		
		initialize.transporteData.setEmpresaBD("MOVELOG", (byte) 6);
		initialize.transporteData.setEmailBD("contato@movelog.com.br", (byte) 6);
		initialize.transporteData.setSenhaBD("123456", (byte) 6);
		initialize.transporteData.setDistanciaIndexBD(0.01f, (byte) 6);
		initialize.transporteData.setPesoIndexBD(0.03f, (byte) 6);
		initialize.transporteData.setVolumeIndexBD(0.008f, (byte) 6);
		
		initialize.transporteData.setEmpresaBD("JADLOG", (byte) 7);
		initialize.transporteData.setEmailBD("contato@jadlog.com.br", (byte) 7);
		initialize.transporteData.setSenhaBD("123456", (byte) 7);
		initialize.transporteData.setDistanciaIndexBD(0.01f, (byte) 7);
		initialize.transporteData.setPesoIndexBD(0.03f, (byte) 7);
		initialize.transporteData.setVolumeIndexBD(0.008f, (byte) 7);
		
		initialize.transporteData.setEmpresaBD("BRASPRESS", (byte) 8);
		initialize.transporteData.setEmailBD("contato@braspress.com.br", (byte) 8);
		initialize.transporteData.setSenhaBD("123456", (byte) 8);
		initialize.transporteData.setDistanciaIndexBD(0.01f, (byte) 8);
		initialize.transporteData.setPesoIndexBD(0.03f, (byte) 8);
		initialize.transporteData.setVolumeIndexBD(0.008f, (byte) 8);

		// PEDIDOS
		//01-user-kalil
		initialize.pedidoData.setEnderecoRemetenteBD((byte) 0, (byte) 0);
		initialize.pedidoData.setEnderecoDestinoBD((byte) 5, (byte) 0);
		initialize.pedidoData.setCodigoRastreioBD("BR123456789BR", (byte) 0);
		initialize.pedidoData.setDataEnvioBD(LocalDate.of(2022, 6, 15), (byte) 0);
		initialize.pedidoData.setDataChegadaBD(LocalDate.of(2022, 6, 20), (byte) 0);
		initialize.pedidoData.setPrevisaoChegadaBD(LocalDate.of(2022, 6, 19), (byte) 0);
		initialize.pedidoData.setHoraEnvioBD(LocalTime.of(15, 30), (byte) 0);
		initialize.pedidoData.setHoraChegadaBD(LocalTime.of(06, 35), (byte) 0);
		initialize.pedidoData.setAlturaBD(100, (byte) 0);
		initialize.pedidoData.setLarguraBD(50, (byte) 0);
		initialize.pedidoData.setComprimentoBD(27, (byte) 0);
		initialize.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[0].getLatitude(),
				Brasil.values()[0].getLongitude(), Brasil.values()[5].getLatitude(), Brasil.values()[5].getLongitude(),
				100, 50, 27, Main.transporteData.getDistanciaIndexBD((byte) 0),
				Main.transporteData.getPesoIndexBD((byte) 0), Main.transporteData.getVolumeIndexBD((byte) 0)),
				(byte) 0);
		initialize.pedidoData.setTransportadoraBD((byte) 0, (byte) 0);
		initialize.pedidoData.setRemetenteBD((byte) 0, (byte) 0);
		initialize.pedidoData.setDestinatarioBD((byte) 1, (byte) 0);
		
		//02-user-kalil
		initialize.pedidoData.setEnderecoRemetenteBD((byte) 3, (byte) 1);
		initialize.pedidoData.setEnderecoDestinoBD((byte) 8, (byte) 1);
		initialize.pedidoData.setCodigoRastreioBD("BR123325796BR", (byte) 1);
		initialize.pedidoData.setDataEnvioBD(LocalDate.of(2022, 6, 15), (byte) 1);
		initialize.pedidoData.setDataChegadaBD(LocalDate.of(2022, 6, 20), (byte) 1);
		initialize.pedidoData.setPrevisaoChegadaBD(LocalDate.of(2022, 6, 19), (byte) 1);
		initialize.pedidoData.setHoraEnvioBD(LocalTime.of(15, 30), (byte) 1);
		initialize.pedidoData.setHoraChegadaBD(LocalTime.of(06, 35), (byte) 1);
		initialize.pedidoData.setAlturaBD(50, (byte) 1);
		initialize.pedidoData.setLarguraBD(25, (byte) 1);
		initialize.pedidoData.setComprimentoBD(20, (byte) 1);
		initialize.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[3].getLatitude(),
				Brasil.values()[3].getLongitude(), Brasil.values()[8].getLatitude(), Brasil.values()[8].getLongitude(),
				50, 25, 20, Main.transporteData.getDistanciaIndexBD((byte) 1),
				Main.transporteData.getPesoIndexBD((byte) 1), Main.transporteData.getVolumeIndexBD((byte) 1)),
				(byte) 1);
		initialize.pedidoData.setTransportadoraBD((byte) 1, (byte) 1);
		initialize.pedidoData.setRemetenteBD((byte) 0, (byte) 1);
		initialize.pedidoData.setDestinatarioBD((byte) 2, (byte) 1);
		
		//03-user-kalil
		initialize.pedidoData.setEnderecoRemetenteBD((byte) 4, (byte) 2);
		initialize.pedidoData.setEnderecoDestinoBD((byte) 9, (byte) 2);
		initialize.pedidoData.setCodigoRastreioBD("BR123323212BR", (byte) 2);
		initialize.pedidoData.setDataEnvioBD(LocalDate.of(2022, 6, 19), (byte) 2);
		initialize.pedidoData.setDataChegadaBD(LocalDate.of(2022, 6, 24), (byte) 2);
		initialize.pedidoData.setPrevisaoChegadaBD(LocalDate.of(2022, 6, 25), (byte) 2);
		initialize.pedidoData.setHoraEnvioBD(LocalTime.of(8, 45), (byte) 2);
		initialize.pedidoData.setHoraChegadaBD(LocalTime.of(9, 55), (byte) 2);
		initialize.pedidoData.setAlturaBD(41, (byte) 2);
		initialize.pedidoData.setLarguraBD(35, (byte) 2);
		initialize.pedidoData.setComprimentoBD(56, (byte) 2);
		initialize.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[4].getLatitude(),
				Brasil.values()[4].getLongitude(), Brasil.values()[9].getLatitude(), Brasil.values()[9].getLongitude(),
				41, 35, 56, Main.transporteData.getDistanciaIndexBD((byte) 1),
				Main.transporteData.getPesoIndexBD((byte) 2), Main.transporteData.getVolumeIndexBD((byte) 2)),
				(byte) 2);
		initialize.pedidoData.setTransportadoraBD((byte) 3, (byte) 2);
		initialize.pedidoData.setRemetenteBD((byte) 0, (byte) 2);
		initialize.pedidoData.setDestinatarioBD((byte) 3, (byte) 2);
		
		//04-user-mateus
				initialize.pedidoData.setEnderecoRemetenteBD((byte) 5, (byte) 3);
				initialize.pedidoData.setEnderecoDestinoBD((byte) 10, (byte) 3);
				initialize.pedidoData.setCodigoRastreioBD("BR123451268BR", (byte) 3);
				initialize.pedidoData.setDataEnvioBD(LocalDate.of(2022, 6, 21), (byte) 3);
				initialize.pedidoData.setDataChegadaBD(LocalDate.of(2022, 6, 29), (byte) 3);
				initialize.pedidoData.setPrevisaoChegadaBD(LocalDate.of(2022, 6, 30), (byte) 3);
				initialize.pedidoData.setHoraEnvioBD(LocalTime.of(12, 21), (byte) 3);
				initialize.pedidoData.setHoraChegadaBD(LocalTime.of(14, 15), (byte) 3);
				initialize.pedidoData.setAlturaBD(20, (byte) 3);
				initialize.pedidoData.setLarguraBD(15, (byte) 3);
				initialize.pedidoData.setComprimentoBD(10, (byte) 3);
				initialize.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[5].getLatitude(),
						Brasil.values()[5].getLongitude(), Brasil.values()[10].getLatitude(), Brasil.values()[10].getLongitude(),
						20, 15, 10, Main.transporteData.getDistanciaIndexBD((byte) 3),
						Main.transporteData.getPesoIndexBD((byte) 3), Main.transporteData.getVolumeIndexBD((byte) 3)),
						(byte) 3);
				initialize.pedidoData.setTransportadoraBD((byte) 4, (byte) 3);
				initialize.pedidoData.setRemetenteBD((byte) 1, (byte) 3);
				initialize.pedidoData.setDestinatarioBD((byte) 0, (byte) 3);
				
				//05-user-mateus
				initialize.pedidoData.setEnderecoRemetenteBD((byte) 5, (byte) 4);
				initialize.pedidoData.setEnderecoDestinoBD((byte) 10, (byte) 4);
				initialize.pedidoData.setCodigoRastreioBD("BR123451268BR", (byte) 4);
				initialize.pedidoData.setDataEnvioBD(LocalDate.of(2022, 6, 18), (byte) 4);
				initialize.pedidoData.setDataChegadaBD(LocalDate.of(2022, 6, 29), (byte) 4);
				initialize.pedidoData.setPrevisaoChegadaBD(LocalDate.of(2022, 6, 30), (byte) 4);
				initialize.pedidoData.setHoraEnvioBD(LocalTime.of(18, 05), (byte) 4);
				initialize.pedidoData.setHoraChegadaBD(LocalTime.of(16, 10), (byte) 4);
				initialize.pedidoData.setAlturaBD(15, (byte) 4);
				initialize.pedidoData.setLarguraBD(15, (byte) 4);
				initialize.pedidoData.setComprimentoBD(05, (byte) 4);
				initialize.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[5].getLatitude(),
						Brasil.values()[5].getLongitude(), Brasil.values()[10].getLatitude(), Brasil.values()[10].getLongitude(),
						15, 15, 05, Main.transporteData.getDistanciaIndexBD((byte) 4),
						Main.transporteData.getPesoIndexBD((byte) 4), Main.transporteData.getVolumeIndexBD((byte) 4)),
						(byte) 4);
				initialize.pedidoData.setTransportadoraBD((byte) 5, (byte) 4);
				initialize.pedidoData.setRemetenteBD((byte) 1, (byte) 4);
				initialize.pedidoData.setDestinatarioBD((byte) 2, (byte) 4);
				
				//06-user-mateus
				initialize.pedidoData.setEnderecoRemetenteBD((byte) 6, (byte) 5);
				initialize.pedidoData.setEnderecoDestinoBD((byte) 11, (byte) 5);
				initialize.pedidoData.setCodigoRastreioBD("BR123457799BR", (byte) 5);
				initialize.pedidoData.setDataEnvioBD(LocalDate.of(2022, 6, 17), (byte) 5);
				initialize.pedidoData.setDataChegadaBD(LocalDate.of(2022, 6, 27), (byte) 5);
				initialize.pedidoData.setPrevisaoChegadaBD(LocalDate.of(2022, 6, 28), (byte) 5);
				initialize.pedidoData.setHoraEnvioBD(LocalTime.of(17, 00), (byte) 5);
				initialize.pedidoData.setHoraChegadaBD(LocalTime.of(18, 30), (byte) 5);
				initialize.pedidoData.setAlturaBD(20, (byte) 5);
				initialize.pedidoData.setLarguraBD(15, (byte) 5);
				initialize.pedidoData.setComprimentoBD(10, (byte) 5);
				initialize.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[6].getLatitude(),
						Brasil.values()[6].getLongitude(), Brasil.values()[11].getLatitude(), Brasil.values()[11].getLongitude(),
						20, 15, 10, Main.transporteData.getDistanciaIndexBD((byte) 5),
						Main.transporteData.getPesoIndexBD((byte) 5), Main.transporteData.getVolumeIndexBD((byte) 5)),
						(byte) 5);
				initialize.pedidoData.setTransportadoraBD((byte) 6, (byte) 5);
				initialize.pedidoData.setRemetenteBD((byte) 1, (byte) 5);
				initialize.pedidoData.setDestinatarioBD((byte) 3, (byte) 5);
				
				//07-user-cristian
				initialize.pedidoData.setEnderecoRemetenteBD((byte) 7, (byte) 6);
				initialize.pedidoData.setEnderecoDestinoBD((byte) 12, (byte) 6);
				initialize.pedidoData.setCodigoRastreioBD("BR123454433BR", (byte) 6);
				initialize.pedidoData.setDataEnvioBD(LocalDate.of(2022, 6, 17), (byte) 6);
				initialize.pedidoData.setDataChegadaBD(LocalDate.of(2022, 6, 27), (byte) 6);
				initialize.pedidoData.setPrevisaoChegadaBD(LocalDate.of(2022, 6, 28), (byte) 6);
				initialize.pedidoData.setHoraEnvioBD(LocalTime.of(17, 00), (byte) 6);
				initialize.pedidoData.setHoraChegadaBD(LocalTime.of(18, 30), (byte) 6);
				initialize.pedidoData.setAlturaBD(20, (byte) 6);
				initialize.pedidoData.setLarguraBD(15, (byte) 6);
				initialize.pedidoData.setComprimentoBD(10, (byte) 6);
				initialize.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[6].getLatitude(),
						Brasil.values()[6].getLongitude(), Brasil.values()[11].getLatitude(), Brasil.values()[11].getLongitude(),
						20, 15, 10, Main.transporteData.getDistanciaIndexBD((byte) 6),
						Main.transporteData.getPesoIndexBD((byte) 6), Main.transporteData.getVolumeIndexBD((byte) 6)),
						(byte) 6);
				initialize.pedidoData.setTransportadoraBD((byte) 7, (byte) 6);
				initialize.pedidoData.setRemetenteBD((byte) 2, (byte) 6);
				initialize.pedidoData.setDestinatarioBD((byte) 0, (byte) 6);
				
				//08-user-cristian
				initialize.pedidoData.setEnderecoRemetenteBD((byte) 8, (byte) 7);
				initialize.pedidoData.setEnderecoDestinoBD((byte) 13, (byte) 7);
				initialize.pedidoData.setCodigoRastreioBD("BR123451111BR", (byte) 7);
				initialize.pedidoData.setDataEnvioBD(LocalDate.of(2022, 6, 16), (byte) 7);
				initialize.pedidoData.setDataChegadaBD(LocalDate.of(2022, 6, 26), (byte) 7);
				initialize.pedidoData.setPrevisaoChegadaBD(LocalDate.of(2022, 6, 27), (byte) 7);
				initialize.pedidoData.setHoraEnvioBD(LocalTime.of(14, 00), (byte) 7);
				initialize.pedidoData.setHoraChegadaBD(LocalTime.of(11, 30), (byte) 7);
				initialize.pedidoData.setAlturaBD(16, (byte) 7);
				initialize.pedidoData.setLarguraBD(150, (byte) 7);
				initialize.pedidoData.setComprimentoBD(20, (byte) 7);
				initialize.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[8].getLatitude(),
						Brasil.values()[8].getLongitude(), Brasil.values()[13].getLatitude(), Brasil.values()[13].getLongitude(),
						16, 150, 20, Main.transporteData.getDistanciaIndexBD((byte) 7),
						Main.transporteData.getPesoIndexBD((byte) 7), Main.transporteData.getVolumeIndexBD((byte) 7)),
						(byte) 7);
				initialize.pedidoData.setTransportadoraBD((byte) 8, (byte) 7);
				initialize.pedidoData.setRemetenteBD((byte) 2, (byte) 7);
				initialize.pedidoData.setDestinatarioBD((byte) 1, (byte) 7);
				
				//09-user-cristian
				initialize.pedidoData.setEnderecoRemetenteBD((byte) 9, (byte) 8);
				initialize.pedidoData.setEnderecoDestinoBD((byte) 14, (byte) 8);
				initialize.pedidoData.setCodigoRastreioBD("BR123452222BR", (byte) 8);
				initialize.pedidoData.setDataEnvioBD(LocalDate.of(2022, 6, 15), (byte) 8);
				initialize.pedidoData.setDataChegadaBD(LocalDate.of(2022, 6, 25), (byte) 8);
				initialize.pedidoData.setPrevisaoChegadaBD(LocalDate.of(2022, 6, 26), (byte) 8);
				initialize.pedidoData.setHoraEnvioBD(LocalTime.of(11, 00), (byte) 8);
				initialize.pedidoData.setHoraChegadaBD(LocalTime.of(10, 30), (byte) 8);
				initialize.pedidoData.setAlturaBD(160, (byte) 8);
				initialize.pedidoData.setLarguraBD(15, (byte) 8);
				initialize.pedidoData.setComprimentoBD(20, (byte) 8);
				initialize.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[9].getLatitude(),
						Brasil.values()[9].getLongitude(), Brasil.values()[14].getLatitude(), Brasil.values()[14].getLongitude(),
						160, 15, 20, Main.transporteData.getDistanciaIndexBD((byte) 8),
						Main.transporteData.getPesoIndexBD((byte) 8), Main.transporteData.getVolumeIndexBD((byte) 8)),
						(byte) 8);
				initialize.pedidoData.setTransportadoraBD((byte) 3, (byte) 8);
				initialize.pedidoData.setRemetenteBD((byte) 2, (byte) 8);
				initialize.pedidoData.setDestinatarioBD((byte) 3, (byte) 8);
				
//				//10-user-bruno
//				initialize.pedidoData.setEnderecoRemetenteBD((byte) 10, (byte) 9);
//				initialize.pedidoData.setEnderecoDestinoBD((byte) 14, (byte) 9);
//				initialize.pedidoData.setCodigoRastreioBD("BR123453333BR", (byte) 9);
//				initialize.pedidoData.setDataEnvioBD(LocalDate.of(2022, 6, 15), (byte) 9);
//				initialize.pedidoData.setDataChegadaBD(LocalDate.of(2022, 6, 25), (byte) 9);
//				initialize.pedidoData.setPrevisaoChegadaBD(LocalDate.of(2022, 6, 26), (byte) 9);
//				initialize.pedidoData.setHoraEnvioBD(LocalTime.of(11, 00), (byte) 9);
//				initialize.pedidoData.setHoraChegadaBD(LocalTime.of(10, 30), (byte) 9);
//				initialize.pedidoData.setAlturaBD(10, (byte) 9);
//				initialize.pedidoData.setLarguraBD(15, (byte) 9);
//				initialize.pedidoData.setComprimentoBD(22, (byte) 9);
//				initialize.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[10].getLatitude(),
//						Brasil.values()[10].getLongitude(), Brasil.values()[14].getLatitude(), Brasil.values()[14].getLongitude(),
//						10, 15, 22, Main.transporteData.getDistanciaIndexBD((byte) 9),
//						Main.transporteData.getPesoIndexBD((byte) 9), Main.transporteData.getVolumeIndexBD((byte) 9)),
//						(byte) 9);
//				initialize.pedidoData.setTransportadoraBD((byte) 4, (byte) 9);
//				initialize.pedidoData.setRemetenteBD((byte) 3, (byte) 9);
//				initialize.pedidoData.setDestinatarioBD((byte) 0, (byte) 9);
//				
//				//11-user-bruno
//				initialize.pedidoData.setEnderecoRemetenteBD((byte) 11, (byte) 10);
//				initialize.pedidoData.setEnderecoDestinoBD((byte) 16, (byte) 10);
//				initialize.pedidoData.setCodigoRastreioBD("BR123454444BR", (byte) 10);
//				initialize.pedidoData.setDataEnvioBD(LocalDate.of(2022, 6, 18), (byte) 10);
//				initialize.pedidoData.setDataChegadaBD(LocalDate.of(2022, 6, 23), (byte) 10);
//				initialize.pedidoData.setPrevisaoChegadaBD(LocalDate.of(2022, 6, 24), (byte) 10);
//				initialize.pedidoData.setHoraEnvioBD(LocalTime.of(8, 10), (byte) 10);
//				initialize.pedidoData.setHoraChegadaBD(LocalTime.of(16, 40), (byte) 10);
//				initialize.pedidoData.setAlturaBD(30, (byte) 10);
//				initialize.pedidoData.setLarguraBD(15, (byte) 10);
//				initialize.pedidoData.setComprimentoBD(28, (byte) 10);
//				initialize.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[11].getLatitude(),
//						Brasil.values()[11].getLongitude(), Brasil.values()[16].getLatitude(), Brasil.values()[16].getLongitude(),
//						30, 15, 28, Main.transporteData.getDistanciaIndexBD((byte) 10),
//						Main.transporteData.getPesoIndexBD((byte) 10), Main.transporteData.getVolumeIndexBD((byte) 10)),
//						(byte) 10);
//				initialize.pedidoData.setTransportadoraBD((byte) 5, (byte) 10);
//				initialize.pedidoData.setRemetenteBD((byte) 3, (byte) 10);
//				initialize.pedidoData.setDestinatarioBD((byte) 1, (byte) 10);
//				
//				//12-user-bruno
//				initialize.pedidoData.setEnderecoRemetenteBD((byte) 12, (byte) 11);
//				initialize.pedidoData.setEnderecoDestinoBD((byte) 17, (byte) 11);
//				initialize.pedidoData.setCodigoRastreioBD("BR123455555BR", (byte) 11);
//				initialize.pedidoData.setDataEnvioBD(LocalDate.of(2022, 6, 19), (byte) 11);
//				initialize.pedidoData.setDataChegadaBD(LocalDate.of(2022, 6, 29), (byte) 11);
//				initialize.pedidoData.setPrevisaoChegadaBD(LocalDate.of(2022, 6, 30), (byte) 11);
//				initialize.pedidoData.setHoraEnvioBD(LocalTime.of(14, 30), (byte) 11);
//				initialize.pedidoData.setHoraChegadaBD(LocalTime.of(17, 40), (byte) 11);
//				initialize.pedidoData.setAlturaBD(300, (byte) 11);
//				initialize.pedidoData.setLarguraBD(150, (byte) 11);
//				initialize.pedidoData.setComprimentoBD(280, (byte) 11);
//				initialize.pedidoData.setPrecoFreteBD(Logistica.Logistica(Brasil.values()[12].getLatitude(),
//						Brasil.values()[12].getLongitude(), Brasil.values()[17].getLatitude(), Brasil.values()[17].getLongitude(),
//						300, 150, 280, Main.transporteData.getDistanciaIndexBD((byte) 11),
//						Main.transporteData.getPesoIndexBD((byte) 11), Main.transporteData.getVolumeIndexBD((byte) 11)),
//						(byte) 11);
//				initialize.pedidoData.setTransportadoraBD((byte) 6, (byte) 11);
//				initialize.pedidoData.setRemetenteBD((byte) 3, (byte) 11);
//				initialize.pedidoData.setDestinatarioBD((byte) 2, (byte) 11);
		
	}

	public static void setEmpresaBD(String next) {
		// TODO Auto-generated method stub
		
	}

	public static void setEmailBD(String next) {
		// TODO Auto-generated method stub
		
	}

}

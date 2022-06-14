package br.com.entra21.teamroxo.transport.scripts;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.anotacoes.*;
import br.com.entra21.teamroxo.transport.classes.Login;

@Initialize
@Startup
public class StartupScript {

	public static void main(String[] args) {

		Main initialize = new Main();

		initialize.loginData.setNome("Kalil", (byte) 0);
		initialize.loginData.setEmail("kjfakhouri@gmail.com", (byte) 0);
		initialize.loginData.setUser("kakakouri", (byte) 0);
		initialize.loginData.setSenha("123123", (byte) 0);
		initialize.loginData.setCpf("123123123-12", (byte) 0);
		initialize.loginData.setIsEnterpriseBD(false, (byte) 0);

		initialize.loginData.setNome("Mateus", (byte) 1);
		initialize.loginData.setEmail("mat@gmail.com", (byte) 1);
		initialize.loginData.setUser("mat.felipe", (byte) 1);
		initialize.loginData.setSenha("123123", (byte) 1);
		initialize.loginData.setCpf("123123123-12", (byte) 1);
		initialize.loginData.setIsEnterpriseBD(false, (byte) 1);

		initialize.loginData.setNome("Cristian", (byte) 2);
		initialize.loginData.setEmail("cristian@gmail.com", (byte) 2);
		initialize.loginData.setUser("cris", (byte) 2);
		initialize.loginData.setSenha("123123", (byte) 2);
		initialize.loginData.setCpf("123123123-12", (byte) 2);
		initialize.loginData.setIsEnterpriseBD(true, (byte) 2);

		initialize.loginData.setNome("Bruno", (byte) 3);
		initialize.loginData.setEmail("bruno@gmail.com", (byte) 3);
		initialize.loginData.setUser("bruno", (byte) 3);
		initialize.loginData.setSenha("123123", (byte) 3);
		initialize.loginData.setCpf("123123123-12", (byte) 3);
		initialize.loginData.setIsEnterpriseBD(true, (byte) 3);

		// TRANSPORTADORAS
		initialize.transporteData.setEmpresaBD("SAIDA-21", (byte) 0);
		initialize.transporteData.setEmailBD("contato@saida21.com.br", (byte) 0);
		initialize.transporteData.setSenhaBD("123456", (byte) 0);
		initialize.transporteData.setDistanciaIndexBD(0.01f, (byte) 0);
		initialize.transporteData.setPesoIndexBD(0.02f, (byte) 0);
		initialize.transporteData.setVolumeIndexBD(0.003f, (byte) 0);

		initialize.transporteData.setEmpresaBD("CORREIOS", (byte) 1);
		initialize.transporteData.setEmailBD("contato@correios.gov.br", (byte) 1);
		initialize.transporteData.setSenhaBD("123456", (byte) 1);
		initialize.transporteData.setDistanciaIndexBD(0.03f, (byte) 1);
		initialize.transporteData.setPesoIndexBD(0.02f, (byte) 1);
		initialize.transporteData.setVolumeIndexBD(0.002f, (byte) 1);

		initialize.transporteData.setEmpresaBD("AZUL EXPRESS", (byte) 2);
		initialize.transporteData.setEmailBD("contato@azul.com.br", (byte) 2);
		initialize.transporteData.setSenhaBD("123456", (byte) 2);
		initialize.transporteData.setDistanciaIndexBD(0.01f, (byte) 2);
		initialize.transporteData.setPesoIndexBD(0.03f, (byte) 2);
		initialize.transporteData.setVolumeIndexBD(0.005f, (byte) 2);

	}

}
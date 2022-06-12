package br.com.entra21.teamroxo.transport.scripts;

import br.com.entra21.teamroxo.transport.Main;
import br.com.entra21.teamroxo.transport.anotacoes.*;
import br.com.entra21.teamroxo.transport.classes.Login;

@Initialize
public class LoginScript {

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
		
	}

}

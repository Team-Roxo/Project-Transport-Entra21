package br.com.entra21.teamroxo.transport.classes;

import java.util.Scanner;

import br.com.entra21.teamroxo.transport.herancas.PessoaDados;

public class RunLogin extends PessoaDados {

	static Scanner input = new Scanner(System.in);
	
	
	//FUNÇÃO PARA FAZER LOGIN
	public void loging() {
		
		String user;
		String senha;
		byte userIndex;
		
		System.out.println("Digite seu usuário:");
		user = input.nextLine();
		
		for(int i=0;i<=getUser().size();i++) {
			if(user == getUser((byte)i)) {
				System.out.println("USUÁRIO ENCONTRADO!");
				userIndex = (byte) i;
				do {
					
					System.out.println("Digite sua senha:");
					senha = input.nextLine();
					if(senha == getSenha(userIndex)) {
						System.out.println("LOGIN REALIZADO COM SUCESSO!");
						Login.logged = true;
						if(getIsEnterpriseBD(userIndex) == true) {
							Login.isEnterpriseAccount = true;
						}else {
							Login.isEnterpriseAccount = false;
						}
						senha = "V";
					}else {
						System.out.println("Senha incorreta!");
						System.out.println("Digite 0 se quiser sair");
					}
				}while(senha != "0" || senha == "V");
			}else {
				System.out.println("USUÁRIO NÃO ENCONTRADO!");
			}
		}
		
	}
	
}

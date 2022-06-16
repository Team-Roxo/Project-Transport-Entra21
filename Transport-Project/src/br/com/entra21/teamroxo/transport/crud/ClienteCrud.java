package br.com.entra21.teamroxo.transport.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import br.com.entra21.teamroxo.transport.Menu;
import br.com.entra21.teamroxo.transport.Repositorio;
import br.com.entra21.teamroxo.transport.herancas.PessoaDados;

public class ClienteCrud extends Menu implements ICrud<PessoaDados> {

	private HashMap<String, PessoaDados> lista = Repositorio.pessoas;
	private final String CHAVE = "User";

	public ClienteCrud() {
		super();
	}

	public ClienteCrud(String string, ArrayList arrayList) {
		
	}

	public byte capturarOpcao() {
		byte opcao = super.capturarOpcao();
		switch (opcao) {
		case 1:
			listar(Repositorio.pessoas);
			break;
		case 2:
			adicionar();
			break;

		case 3:
			exibirDetalhes(buscar(capturarChave()));
			break;

		case 4:
			editar(capturarChave());
			break;
		case 5:
			deletar(capturarChave());
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		return opcao;
	}

	private void exibirDetalhes(PessoaDados buscar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listar(HashMap<String, PessoaDados> lista) {
		System.out.println("Listando pessoas...");
		for (Entry<String, PessoaDados> pessoa : lista.entrySet()) {
			System.out.println(
					"Chave: " + pessoa.getKey() + "\t\t" + pessoa.getValue().getUser() + pessoa.getValue().getEmail());

		}
		System.out.println("-------------" + (lista.isEmpty() ? "Lista vazia" : "Quantidade " + lista.size()));

	}

	@Override
	public void adicionar() {
		PessoaDados novo = capturarValores();
		if (buscar(novo) == null) {
			//Repositorio.pessoas.put(novo.getUser(), novo);  PUT NÃO ESTA FUNCIONANDO 
			//lista

		} else {
			System.out.println("Já existe alguem com a chave " + novo.getUser());

		}

	}

	@Override
	public PessoaDados capturarValores() {
		PessoaDados formulario = new PessoaDados();
		System.out.println("Informe o usuario:");
		/*
		 * formulario.setUser(super.getClass().next());
		 * System.out.println("Informe o email");
		 * formulario.setEmail(super.getClass().nextLine());
		 */
		
		return formulario;
		
		
		//faltando scanner 
		//.NEXT E .NEXTline não funcionam 
	}

	@Override
	public PessoaDados buscar(PessoaDados chave) {
		PessoaDados busca = Repositorio.pessoas.get(chave.getUser());

		return busca;

	}

	@Override
	public void editar(PessoaDados chave) {
		PessoaDados cadastroAtual = buscar(chave);
		if (cadastroAtual == null) {
			System.out.println("Não existe um registro com CHAVE:" + chave.getUser());
		} else {
			//lista.put(chave.getUser(), capturarValores()); put também não funciona 
			System.out.println("Dados atualizados");
		}
	}

	@Override
	public void deletar(PessoaDados chave) {

		PessoaDados cadastroAtual = buscar(chave);
		if (cadastroAtual == null) {
			System.out.println("Não existe um registro com CHAVE:" + chave.getUser());
		} else {
			lista.remove(chave.getUser());
			System.out.println("Item excluido");
		}

	}

	@Override
	public PessoaDados capturarChave() {
		return null;

	

	
	}

	@Override
	public void exibirDetalhes() {

	}
	
}

package br.com.entra21.teamroxo.transport.Crud;

import java.util.HashMap;

import br.com.entra21.teamroxo.transport.Menu;
import br.com.entra21.teamroxo.transport.Repositorio;
import br.com.entra21.teamroxo.transport.herancas.PessoaDados;

public class ClienteCrud extends Menu implements ICrud<PessoaDados> {

	private HashMap<String, PessoaDados> lista = Repositorio.Pessoas;
	private final String CAMPO_CHAVE = "User";

	public ClienteCrud() {
		super();
	}

		

public byte capturarOpcao() {
		byte opcao = super.capturarOpcao();
		switch (opcao) {
		case 1:
			listar(lista);
			break;
		case 2:
			adicionar();
			break;
		/*
		 * case 3: exibirDetalhes(buscar(capturarChave())); break;
		 */
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
	

	@Override
	public void listar(HashMap<String, PessoaDados> lista) {
		

	}

	@Override
	public void adicionar() {

	}
	@Override
	public PessoaDados buscar(PessoaDados chave) {
		return lista.get(chave.getUser());
                                            
	}
	 

	@Override
	public void editar(PessoaDados chave) {
		PessoaDados cadastroAtual = buscar(chave);
		if (cadastroAtual == null) {
			System.out.println("Não existe um registro com CHAVE:" + chave.getUser());
		} else {
		//	lista.put(chave.getUser(), capturarValores());
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
	public PessoaDados capturarValores() {

		return null;
	}

	@Override
	public void exibirDetalhes() {

	}

}

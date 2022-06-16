package br.com.entra21.teamroxo.transport.crud;

import java.util.HashMap;

import br.com.entra21.teamroxo.transport.Menu;
import br.com.entra21.teamroxo.transport.Repositorio;
import br.com.entra21.teamroxo.transport.classes.Transporte;
import br.com.entra21.teamroxo.transport.herancas.PessoaDados;
import br.com.entra21.teamroxo.transport.herancas.TransporteDados;

public class TransporteCrud extends Menu implements ICrud<TransporteDados> {

	private HashMap<String, TransporteDados> lista = Repositorio.transportes;

	public TransporteCrud() {
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
		case 3:
			// exibirDetalhes(buscar(capturarChave()));
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

	@Override
	public void listar(HashMap<String, TransporteDados> lista) {

	}

	@Override
	public void adicionar() {

	}

	@Override
	public void editar(TransporteDados chave) {
		Transporte transporteAtual = buscar(chave);
		/*
		 * if (transporteAtual == null) {
		 * System.out.println("NaO existe um registro com CHAVE:" + chave.getNome()); }
		 * else { lista.put(chave.getNome(),capturarValores()) ;
		 * System.out.println("Dados atualizados"); }
		 */

	}

	@Override
	public void deletar(TransporteDados chave) {
		Transporte transporteAtual = buscar(chave);
		/*
		 * if (transporteAtual == null) { System.out.println("Não encontramos " +
		 * chave.getEmailBD()); } else { lista.remove(chave.getEmailBD());
		 * System.out.println("Item excluido"); }
		 * 
		 */
	}

	public Transporte buscar(TransporteDados chave) {
		return null;
	}

	@Override
	public TransporteDados capturarChave() {
		return null;
	}

	@Override
	public TransporteDados capturarValores() {
		return null;
	}

	@Override
	public void exibirDetalhes() {

	}

	@Override
	public PessoaDados buscar(PessoaDados chave) {
		return null;
	}
	
}

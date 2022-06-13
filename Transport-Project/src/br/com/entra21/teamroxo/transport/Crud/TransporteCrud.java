package br.com.entra21.teamroxo.transport.Crud;

import java.util.HashMap;

import br.com.entra21.teamroxo.transport.Menu;
import br.com.entra21.teamroxo.transport.Repositorio;
import br.com.entra21.teamroxo.transport.classes.Transporte;
import br.com.entra21.teamroxo.transport.herancas.PessoaDados;
import br.com.entra21.teamroxo.transport.herancas.TransporteDados;

public class TransporteCrud extends Menu implements ICrud<TransporteDados> {

	/* private HashMap<String,Transporte> lista = Repositorio.Transportes; */

	private HashMap<String, TransporteDados> lista = Repositorio.Transportes;

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
		// TODO Auto-generated method stub

	}

	@Override
	public void adicionar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void editar(TransporteDados chave) {
		Transporte transporteAtual = buscar(chave);
		/*
		 * if (transporteAtual == null) {
		 * System.out.println("Não existe um registro com CHAVE:" + chave.getNome()); }
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

	private Transporte buscar(TransporteDados chave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransporteDados capturarChave() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransporteDados capturarValores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub

	}

	@Override
	public PessoaDados buscar(PessoaDados chave) {
		// TODO Auto-generated method stub
		return null;
	}
}

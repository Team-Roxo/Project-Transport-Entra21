package br.com.entra21.teamroxo.transport.crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import br.com.entra21.teamroxo.transport.herancas.PessoaDados;
import br.com.entra21.teamroxo.transport.herancas.TransporteDados;

public interface ICrud<G> {

public void listar(HashMap<String,G> lista );
	
	public void adicionar();

	public void editar(G chave);

	public void deletar(G chave);

	public G capturarChave();

	public G capturarValores();
	
	public G buscar(G chave);

	public void exibirDetalhes();

	PessoaDados buscar(PessoaDados chave);

	void exibirDetalhes(TransporteDados completo);
	
}

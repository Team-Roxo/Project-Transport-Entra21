package br.com.entra21.teamroxo.transport.Crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import br.com.entra21.teamroxo.transport.herancas.PessoaDados;

public interface ICrud<G> {
	
	public void listar(HashMap<String,G> lista );
	
	public void adicionar();

	public void editar(G chave);

	public void deletar(G chave);

	public G capturarChave();

	public G capturarValores();

	public void exibirDetalhes();

	PessoaDados buscar(PessoaDados chave);

}

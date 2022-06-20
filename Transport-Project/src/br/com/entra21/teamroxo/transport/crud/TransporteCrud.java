package br.com.entra21.teamroxo.transport.crud;

import java.util.HashMap;
import java.util.Map.Entry;

import br.com.entra21.teamroxo.transport.Menu;
import br.com.entra21.teamroxo.transport.Repositorio;
import br.com.entra21.teamroxo.transport.classes.Transporte;
import br.com.entra21.teamroxo.transport.herancas.PessoaDados;
import br.com.entra21.teamroxo.transport.herancas.TransporteDados;
import br.com.entra21.teamroxo.transport.scripts.StartupScript;

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

	@Override
	public void listar(HashMap<String, TransporteDados> lista) {
		System.out.println("Listando pessoas...");
		for (Entry<String, TransporteDados> transporte : lista.entrySet()) {
		System.out.println("Chave: " + transporte.getKey() + "\t\t" + transporte.getValue().getEmpresaBD());
		}
		

		System.out.println("-------------" + (lista.isEmpty() ? "Lista vazia" : "Quantidade " + lista.size()));
	}
	

	


	@Override
	public void adicionar() {
		TransporteDados novo = capturarValores();
		if (buscar(novo) == null) {
			//Repositorio.pessoas.put(novo.getEmpresaBD(), novo);  
			//StartupScript.put(novo.getEmpresaBD(), novo);
			//Acredito que o certo é dar o put no StartupScript, visto que é onde está sendo armazenado o banco de dados... Repositorio foi criado mas não tem ligação
		} else {
			System.out.println("Já existe alguem com a chave " + novo.getEmpresaBD());

		}

	}

	@Override
	public void editar(TransporteDados chave) {
		Transporte transporteAtual = buscar(chave);
		
		  if (transporteAtual == null) {
		  System.out.println("Não existe um registro com CHAVE:" + chave.getEmpresaBD()); }
		else { //StartupScript.put(chave.getEmpresaBD(), capturarValores());
			/* lista.put(chave.getEmpresaBD(),capturarValores()) ; */
			//Aqui ocorre a mesma dúvida da classe adicionar
		  System.out.println("Dados atualizados"); }
		 

	}
 public Transporte buscar(TransporteDados chave) {
	 
	 
	 //return StartupScript.get(chave.getEmpresaBD());
	 return null;
	}

	@Override
	public void deletar(TransporteDados chave) {
		TransporteDados transporteAtual = buscar(chave);
		
		  if (transporteAtual == null) { System.out.println("Não encontramos " +
		  chave.getEmpresaBD()); } else { lista.remove(chave.getEmpresaBD());
		  System.out.println("Item excluido"); }
		  
		  //lista ou StartupScript?
		  
		 
	}

	
	@Override
	public TransporteDados capturarChave() {
		TransporteDados formulario = new Transporte();
		System.out.println("Informe a CHAVE" );
		formulario.setEmpresaBD(input.next());
		return formulario;
		
		
		
	}
	
	

	 @Override 

	 public TransporteDados capturarValores() { 
		
		  System.out.println("Capturando dados completos:");
		  
		  System.out.println("Informe a empresa:");
		  StartupScript.setEmpresaBD(input.next());
		  //Repositorio.transportes.setEmpresaBD(input.nextByte());
		  
		  
		  System.out.println("Informe o email:");
		  StartupScript.setEmailBD(input.next());
		  
		  
		  return null;
		  
		 
	 } 
	
	@Override
	public void exibirDetalhes(TransporteDados completo) {
			if(completo==null) {
				System.out.println("Nao e possivel exibir os detalhes, item nao localizado");
			}else {
				System.out.println(completo.toString()); 
			}
			
		}

	

	@Override
	public PessoaDados buscar(PessoaDados chave) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void exibirDetalhes() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * @Override public TransporteDados capturarValores() { // TODO Auto-generated
	 * method stub return null; }
	 */

	
	
}

package br.com.entra21.teamroxo.transport.anotacoes;

/**
 * 
 * Construtores do "Banco de Dados" dos Clientes, Transportadoras e Pedidos
 * chamados em "primeira inst�ncia" no c�digo Main por qu� foi identificado
 * que se criado em outra classe e ela for chamada futuramente (o que aconteceria),
 * mas assim que retornasse para Main com as a��es ou retorno de valor, os valores 
 * declarados no Banco de Dados � perdido (exclu�do da RAM), ent�o chamamos ela na Main
 * pois nunca vai ser perdida at� que o programa se feche e pode ser chamada de qualquer 
 * Classe por est� como "public static".
 * 
 * @author Team Roxo
 *
 */

public @interface WhyHere {

}
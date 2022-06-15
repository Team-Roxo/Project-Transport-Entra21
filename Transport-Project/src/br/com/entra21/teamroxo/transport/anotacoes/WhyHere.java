package br.com.entra21.teamroxo.transport.anotacoes;

/**
 * 
 * Construtores do "Banco de Dados" dos Clientes, Transportadoras e Pedidos
 * chamados em "primeira instância" no código Main por quê foi identificado
 * que se criado em outra classe e ela for chamada futuramente (o que aconteceria),
 * mas assim que retornasse para Main com as ações ou retorno de valor, os valores 
 * declarados no Banco de Dados é perdido (excluído da RAM), então chamamos ela na Main
 * pois nunca vai ser perdida até que o programa se feche e pode ser chamada de qualquer 
 * Classe por está como "public static".
 * 
 * @author Team Roxo
 *
 */

public @interface WhyHere {

}
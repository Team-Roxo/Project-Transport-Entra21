package br.com.entra21.teamroxo.transport.anotacoes;

/**
 * 
 * Código de erro com base no tamanho da String (diferentes de 11 e 14, que é o tamanho do CPF e CNPJ, respectivamente),
 * qualquer valor fora do padrão será considerado errado e exibido como código, possibilitando verificar se o usuário
 * digitou o CPF ou CNPJ corretos.
 * 
 * Não foi aplicado a validação de série de números para CPF, que consiste na soma de todos os números e o resultado
 * retornar 44 ou 55.
 * 
 * @author Team Roxo
 *
 */

public @interface CpfErrorCode {

}

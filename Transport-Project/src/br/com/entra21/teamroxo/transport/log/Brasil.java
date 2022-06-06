package br.com.entra21.teamroxo.transport.log;

public enum Brasil {

	AC(), AL(), AP(), AM(), BA(), CE(), DF(4, "DISTRITO FEDERAL"), ES(), GO(), MA(), MT(),
	MS(), MG(2, "MINAS GERAIS"), PA(), PB(), PR(), PE(2634, "PERNAMBUCO"), PI(2667, "PIAUI"), RJ(434, "RIO DE JANEIRO"), RN(2818, "RIO GRANDE DO NORTE"), 
	RS(1038, "RIO GRANDE DO SUL"), RO(2236, "RONDONIA"), RR(3175, "RORAIMA"),
	SC(520, "SANTA CATARINA", SP(0, "SÃO PAULO"), 
	SE(2163, "SERGIPE"), TO(1579, "TOCANTINS");
	
	private final short priority;
	private final String estado;
}

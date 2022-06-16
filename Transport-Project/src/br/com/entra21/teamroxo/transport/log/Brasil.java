package br.com.entra21.teamroxo.transport.log;

public enum Brasil {

	AC(9.976919f, 67.812528f, "ACRE", "ACRE", "AC"), AL(9.667500f, 35.753559f, "ALAGOAS", "ALAGOAS", "AL"), AP(0f, 51.070610f, "AMAPÁ", "AMAPA", "AP"), 
	AM(3.142409f, 60.048479f, "AMAZONAS", "AMAZONAS", "AM"), BA(12.976564f, 38.515330f, "BAHIA", "BAHIA", "BA"), CE(3.722323f, 38.531526f, "CEARA", "CEARÁ", "CE"), 
	DF(15.803326f, 47.895079f, "DISTRITO FEDERAL", "DISTRITO FEDERAL", "DF"),	ES(20.322403f, 40.341272f, "ESPÍRITO SANTO", "ESPIRITO SANTO", "ES"), 
	GO(16.678874f, 49.245553f, "GOIÂNIA", "GOIANIA", "GO"), MA(2.543930f, 44.314497f, "MARANHÃO", "MARANHAO", "MA"), MT(15.602877f, 56.113537f, "MATO GROSSO", "MATO GROSSO", "MT"), 
	MS(20.459085f, 54.645131f, "MATO GROSSO DO SUL", "MATO GROSSO DO SUL", "MS"), MG(19.919361f, 43.949623f, "MINAS GERAIS", "MINAS GERAIS", "MG"), 
	PA(1.430440f, 48.496356f, "PARÁ", "PARA", "PA"), PB(7.134688f, 34.896569f, "PARAÍBA", "PARAIBA", "PB"), PR(25.412456f, 49.319688f, "PARANÁ", "PARANA", "PR"), 
	PE(8.047977f, 34.865021f, "PERNAMBUCO", "PERNAMBUCO", "PE"), PI(5.083167f, 42.789940f, "PIAUÍ", "PIAUI", "PI"),	RJ(22.904018f, 43.171155f, "RIO DE JANEIRO", "RIO DE JANEIRO", "RJ"), 
	RN(5.782763f, 35.216631f, "RIO GRANDE DO NORTE", "RIO GRANDE DO NORTE", "RN"), RS(30.047082f, 51.244518f, "RIO GRANDE DO SUL", "RIO GRANDE DO SUL", "RS"), 
	RO(8.760584f, 63.880794f, "RONDÔNIA", "RONDONIA", "RO"), RR(2.834102f, 60.682977f, "RORAIMA", "RORAIMA", "RR"), SC(26.919311f, 49.085675f, "SANTA CATARINA", "SANTA CATARINA", "SC"), 
	SP(23.559923f, 46.652957f, "SÃO PAULO", "SAO PAULO", "SP"), SE(10.926615f, 37.075952f, "SERGIPE", "SERGIPE", "SE"),	TO(10.254623f, 48.329435f, "TOCANTINS", "TOCATINS", "TO");
	
	private final float LATITUDE;
	private final float LONGITUDE;
	private final String ESTADOFULL;
	private final String ESTADONOME;
	private final String ESTADOSIGLA;
	
	private Brasil(float latitude, float longitude, String estadoFull, String estadoNome, String estadoSigla) {
		this.LATITUDE = latitude;
		this.LONGITUDE = longitude;
		this.ESTADOFULL = estadoFull;
		this.ESTADONOME = estadoNome;
		this.ESTADOSIGLA = estadoSigla;
	}

	public float getLatitude() {
		return LATITUDE;
	}

	public float getLongitude() {
		return LONGITUDE;
	}

	public String getEstadoFull() {
		return ESTADOFULL;
	}
	
	public String getEstadoNome() {
		return ESTADONOME;
	}
	
	public String getEstadoSigla() {
		return ESTADOSIGLA;
	}
	
}

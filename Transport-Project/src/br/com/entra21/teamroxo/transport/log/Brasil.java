package br.com.entra21.teamroxo.transport.log;

public enum Brasil {

	AC(9.976919f, 67.812528f, "ACRE"), AL(9.667500f, 35.753559f, "ALAGOAS"), AP(0f, 51.070610f, "AMAPA"), AM(3.142409f, 60.048479f, "AMAZONAS"), BA(12.976564f, 38.515330f, "BAHIA"), 
	CE(3.722323f, 38.531526f, "CEARA"), DF(15.803326f, 47.895079f, "DISTRITO FEDERAL"),	ES(20.322403f, 40.341272f, "ESPIRITO SANTO"), GO(16.678874f, 49.245553f, "GOIANIA"), 
	MA(2.543930f, 44.314497f, "MARANHAO"), MT(15.602877f, 56.113537f, "MATO GROSSO"), MS(20.459085f, 54.645131f, "MATO GROSSO DO SUL"), MG(19.919361f, 43.949623f, "MINAS GERAIS"), 
	PA(1.430440f, 48.496356f, "PARA"), PB(7.134688f, 34.896569f, "PARAIBA"), PR(25.412456f, 49.319688f, "PARANA"), PE(8.047977f, 34.865021f, "PERNAMBUCO"), PI(5.083167f, 42.789940f, "PIAUI"), 
	RJ(22.904018f, 43.171155f, "RIO DE JANEIRO"), RN(5.782763f, 35.216631f, "RIO GRANDE DO NORTE"), RS(30.047082f, 51.244518f, "RIO GRANDE DO SUL"), RO(8.760584f, 63.880794f, "RONDONIA"), 
	RR(2.834102f, 60.682977f, "RORAIMA"), SC(26.919311f, 49.085675f, "SANTA CATARINA"), SP(23.559923f, 46.652957f, "SAO PAULO"), SE(10.926615f, 37.075952f, "SERGIPE"), 
	TO(10.254623f, 48.329435f, "TOCANTINS");
	
	private final float latitude;
	private final float longitude;
	private final String estado;
	
	private Brasil(float latitude, float longitude, String estado) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.estado = estado;
	}

	public float getLatitude() {
		return latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public String getEstado() {
		return estado;
	}
	
}

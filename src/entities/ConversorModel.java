package entities;

public class ConversorModel {
	
	private float temperaturaInicial;
	private float temperaturaConvertida;
	private Conversao conversao;
	
	public float getTemperaturaInicial() {
		return temperaturaInicial;
	}
	public void setTemperaturaInicial(float temperaturaInicial) {
		this.temperaturaInicial = temperaturaInicial;
	}
	public float getTemperaturaConvertida() {
		return temperaturaConvertida;
	}
	public void setTemperaturaConvertida(float temperaturaConvertida) {
		this.temperaturaConvertida = temperaturaConvertida;
	}
	public Conversao getConversao() {
		return conversao;
	}
	public void setConversao(Conversao conversao) {
		this.conversao = conversao;
	}
	
	public float converter() {
		switch(conversao) {
			case celsiusToKelvin:
				temperaturaConvertida = (float) (temperaturaInicial + 273.15);
				break;
			case celsiusToFahrenheit:
				temperaturaConvertida = (temperaturaInicial * 9/5) + 32;
				break;
			case kelvinToCelsius:
				temperaturaConvertida = (temperaturaInicial * 9/5) + 32;
				break;
			case kelvinToFahrenheit:
				temperaturaConvertida = (float) ((temperaturaInicial - 273.15) * 9/5 + 32);
				break;
			case fahrenheitToKelvin:
				temperaturaConvertida = (float) ((temperaturaInicial - 32) * 5/9 + 273.15);
				break;
			case fahrenheitToCelsius:
				temperaturaConvertida = (temperaturaInicial - 32) * 5/9;
				break;
		}
		return temperaturaConvertida;
	}
	
	
}

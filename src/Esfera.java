package Class;

public class Esfera {
	private double raio;
	private double altura;
	
	
	public Esfera(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double areaEsfera() {
		return 4 * 3.1415 * (raio * raio);
	}
	
	public double calculoVolume() {
		return ((4.0/3.0) * 3.1415 * Math.pow(raio, 3));
	}
	
}
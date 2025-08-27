package Class;

public class Cone {
	private double raio;
	private double altura;
	
	public Cone(double raio, double altura) {
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
	
	public double calculoGeratriz() {
		return Math.sqrt((altura * altura) + (raio * raio));
	}
	
	public double calculoAreaLateral() {
		return 3.1415 * raio * calculoGeratriz();
	}
	
}

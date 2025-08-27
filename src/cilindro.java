package Class;

public class cilindro {
	private double raio;
	private double altura;
	
	public cilindro(double raio, double altura) {
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
	
	public double calculoAreaLateral() {
		return 2 * 3.1415 * raio * altura;
	}
	
	public double areaTotal() {
		return 2 * 3.1415 * raio * (raio + altura);
	}
	
	public double volume() {
		return 3.1415 * raio * raio * altura;
	}
	
}
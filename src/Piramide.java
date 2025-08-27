package Class;

public class Piramide {
	private double base;
	private double altura;
	
	public Piramide(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calculaVolume() {
		return ((1.0/3.0) * base * altura);
	}
	
	
}
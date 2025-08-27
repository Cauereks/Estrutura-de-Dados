package Class;

public class Retangulo {
	private double comprimento;
	private double largura;
	
	public Retangulo(double comprimento, double largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double calculoPerimetro() {
		return (comprimento + largura) * 2;
	}
	
	public double areaRetangulo() {
		return comprimento * largura;
	}
	
}
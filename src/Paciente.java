package Class;

public class Paciente {
	private String nome;
	private double peso;
	private double altura;
	
	public Paciente(String nome, double peso, double altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularIMC() {
		return peso / (altura * altura);
	}
	
	public void faixaPeso() {
		if(calcularIMC() < 20) {
			String msg = "abaixo do peso ideal";
		} else {
			if(calcularIMC() >= 20 && calcularIMC()<= 25) {
				String msg = "peso ideal";
			} else {
				if(calcularIMC() > 25 && calcularIMC() <= 30) {
					String msg = "excesso de peso";
				} else {
					if(calcularIMC() > 30 && calcularIMC() <= 35) {
						String msg = "obesidade";
					} else {
						String msg = "obesidade morbida";
					}
				}
			}
		}
	}
	
}

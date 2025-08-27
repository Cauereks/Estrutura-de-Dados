package Class;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	private char sexo;
	
	public Pessoa(String nome, double peso, double altura, char sexo) {
		
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double calcularIMC() {
		return peso / (altura * altura);
	}
	
	
}
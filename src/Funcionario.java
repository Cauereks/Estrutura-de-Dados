package Class;

public class Funcionario {
	private String nome;
	private double salario;
	private int numFilhos;
	
	public Funcionario(String nome, double salario, int numFilhos) {
		this.nome = nome;
		this.salario = salario;
		this.numFilhos = numFilhos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getNumFilhos() {
		return numFilhos;
	}

	public void setNumFilhos(int numFilhos) {
		this.numFilhos = numFilhos;
	}
	
	public double aumentoSalarial() {
		if(salario < 1903.98) {
			double porcent = 0.0;
		} else {
			if(salario < 2826.65 && salario >= 1903.99) {
				double porcent = 7.5;
			} else {
				if(salario < 3751.05 && salario >= 2826.66) {
					double porcent = 15.0;
				} else {
					if(salario < 4664.68 && salario >= 3751.05) {
						double porcent = 22.5;
					} else {
						double porcent = 27.5;
					}
				}
			}
		}
		return salario;
	}
	
	public double INSS() {
		if(salario <= 2545) {
			salario = salario + (salario * 0.6);
		} else {
			salario = salario + (salario * 0.1);
		}
		return salario;
	}
	
}

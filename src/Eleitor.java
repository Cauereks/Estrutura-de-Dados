package Class;

public class Eleitor {
	private String nome;
	private int anoNascimento;
	
	public Eleitor(String nome, int anoNascimento) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public int calculaIdade() {
		return 2025 - anoNascimento;
	}
	
	public int tipoEleitor() {
		if(calculaIdade() < 16) {
			String msg =  "Não eleitor";
		} else {
			if(calculaIdade() <= 18 && calculaIdade() >= 16) {
				String msg =  "Eleitor facultativo";
			} else {
				if(calculaIdade() >= 65 && calculaIdade() >= 16) {
					String msg =  "Eleitor obrigatorio";
				} else {
					String msg =  "Eleitor facultativo";
				}
			}
		}
		return anoNascimento;
	}
	
}

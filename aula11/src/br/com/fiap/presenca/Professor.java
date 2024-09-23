package br.com.fiap.presenca;

public class Professor extends Pessoa {
	
	private String inscricao;
	private String diciplina;
	
	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public String getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	public void ensinar() {
		System.out.println("Professor ensinando.");
	}
}

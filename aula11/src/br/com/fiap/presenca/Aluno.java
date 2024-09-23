package br.com.fiap.presenca;

public class Aluno extends Pessoa {
	
	private String rm;
	private String curso;

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void estudar() {
		System.out.println("Aluno estudando.");
	}
}

package br.com.fiap.presenca;

public class Pessoa {
	
	private String nome;
	private byte idade;
	private char sexo;	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void comer()  {
		System.out.println("Pessoa comendo");
	}

}

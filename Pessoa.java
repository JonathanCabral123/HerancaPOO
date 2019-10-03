


public abstract class Pessoa {
	
	public char nome;
	private int idade;
	private char sexo;
		

@SuppressWarnings("unused")
private char getNome() {
		return nome;
	}


	@SuppressWarnings("unused")
	private void setNome(char nome) {
		this.nome = nome;
	}


	@SuppressWarnings("unused")
	private int getIdade() {
		return idade;
	}


	@SuppressWarnings("unused")
	private void setIdade(int idade) {
		this.idade = idade;
	}


	@SuppressWarnings("unused")
	private char getSexo() {
		return sexo;
	}


	@SuppressWarnings("unused")
	private void setSexo(char sexo) {
		this.sexo = sexo;
	}


public void fazerAniversario() {
	   this.idade++;
}
	 
}


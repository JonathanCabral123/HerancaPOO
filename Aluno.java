
public class Aluno extends Pessoa {

	private int matricula;
	private char curso;
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno:" + this.nome);
	
}

	@SuppressWarnings("unused")
	private int getMatricula() {
		return matricula;
	}

	@SuppressWarnings("unused")
	private void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@SuppressWarnings("unused")
	private char getCurso() {
		return curso;
	}

	@SuppressWarnings("unused")
	private void setCurso(char curso) {
		this.curso = curso;
	}
}

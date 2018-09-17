package Lista7;

public class Exercicio1Enc {
	private String nome;
	private int idade = 0;

	public  Exercicio1Enc(){
		
	}
	public Exercicio1Enc(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int fazAniversario(int idade) {
		return this.idade + 1;
	}
}

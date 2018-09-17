package Lista6;

public class Exercicio5Eleicao {
	private String nome1;
	private int voto1;
	private String nome2;
	private int voto2;
	private String nome3;
	private int voto3;
	
	// Candidato 1 -----------------------------------------//
	public String getNome1() {
		return nome1;
	}
	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}
	public int getVoto1() {
		return voto1;
	}
	public void setVoto1(int voto1) {
		this.voto1 = 1;
	}
	public void c1() {
		this.setVoto1(this.getVoto1()+1);
	}
	
	// Candidato 2 -----------------------------------------//
	public String getNome2() {
		return nome2;
	}
	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}
	public int getVoto2() {
		return voto2;
	}
	public void setVoto2(int voto2) {
		this.voto2 = 1;
	}
	public void c2() {
		this.setVoto2(this.getVoto2()+1);
	}
	
	// Candidato 3 -----------------------------------------//
	public String getNome3() {
		return nome3;
	}
	public void setNome3(String nome3) {
		this.nome3 = nome3;
	}
	public int getVoto3() {
		return voto3;
	}
	public void setVoto3(int voto3) {
		this.voto3 = 1;
	}
	public void c3() {
		this.setVoto3(this.getVoto3()+1);
	}
		
	
}

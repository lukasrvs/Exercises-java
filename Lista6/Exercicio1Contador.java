package Lista6;

public class Exercicio1Contador { //Nessa classe não tem main
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void incremento() {
		this.setNumero(this.getNumero()+1);
	}
	
	public void decremento() {
		this.setNumero(this.getNumero()-1);
	}
	
}

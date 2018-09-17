package Lista6;

public class Exercicio3Quilowatt {

	private double salMin;
	private double quantidade;

	public double getSalMin() {
		return salMin;
	}

	public void setSalMin(double salMin) {
		this.salMin = salMin;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double valorKw() {
		return this.getSalMin() / 7 / 100;
	}

	public double valorTotal() {
		return this.getQuantidade() * valorKw();
	}

	public double valorTotalDesc() {
		return valorTotal() / 0.9;
	}

}

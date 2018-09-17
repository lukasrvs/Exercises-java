package Example;

public class contacorrente {
	private double saldo;
	
	public double getsaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double valor) {
		this.saldo = (this.getsaldo() + valor);
	}
	
	public void saque(double valor) {
		this.setSaldo( this.getsaldo() - valor);
	}
	
}

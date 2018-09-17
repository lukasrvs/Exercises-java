package Lista7;

import java.text.DecimalFormat;

public class Exercicio4Enc {
	DecimalFormat df = new DecimalFormat("0.00");
	private double motherBoard;
	private double processor;
	private double memory;
	private double hd;
	private double monitor;
	private String choose;

	public Exercicio4Enc() {
		this.motherBoard = 900.00;
		this.choose = "Configuração do computador escolhido:\n"
		+"Placa Mãe: R$"+df.format(this.getMotherBoard())+"\n";
	}

	public double getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(double motherBoard) {
		this.motherBoard = motherBoard;
	}

	public double getProcessor() {
		return processor;
	}

	public void setProcessor(double processor) {
		this.processor = processor;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public double getHd() {
		return hd;
	}

	public void setHd(double hd) {
		this.hd = hd;
	}

	public double getMonitor() {
		return monitor;
	}

	public void setMonitor(double monitor) {
		this.monitor = monitor;
	}

	public String getChoose() {
		return choose;
	}

	public void setChoose(String choose) {
		this.choose = choose;
	}

	public double calPrice() {
		return this.getMotherBoard() + this.getProcessor() + this.getMemory() + this.getHd() + this.getMonitor();
	}
}

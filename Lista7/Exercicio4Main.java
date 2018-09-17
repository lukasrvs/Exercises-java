package Lista7;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio4Main {

	public static void main(String[] args) {
		Exercicio4Enc co = new Exercicio4Enc();
		DecimalFormat df = new DecimalFormat("0.00");
		int op = 0;

		op = Integer.parseInt(JOptionPane.showInputDialog(
				"Escolha o porcessador para o seu computador:\n0 - Para não escolher\n1 - 3,3Ghz a R$250,00\n2 - 3,5Ghz a R$310,00\n3 - 3,9Ghz a R$620,00\n"));
		if (op == 1) {
			co.setProcessor(250);
			co.setChoose(co.getChoose() + "Processador 3,3Ghz a R$250,00\n");
		} else if (op == 2) {
			co.setProcessor(310);
			co.setChoose(co.getChoose() + "Processador 3,5Ghz a R$310,00\n");
		} else if (op == 3) {
			co.setProcessor(620);
			co.setChoose(co.getChoose() + "Processador 3,9Ghz a R$620,00\n");
		}
		op = Integer.parseInt(JOptionPane.showInputDialog(
				"Escolha a memória para o seu computador:\n0 - Para não escolher\n1 - 2 Gb a R$150,00\n2 - 4 Gb a R$600,00\n3 - 8 Gb a R$1200,00\n4 - 16 Gb a R$2400,00\n"));
		if (op == 1) {
			co.setMemory(150);
			co.setChoose(co.getChoose() + "Memória 2 Gb a R$150,00\n");
		} else if (op == 2) {
			co.setMemory(600);
			co.setChoose(co.getChoose() + "Memória 4 Gb a R$600,00\n");
		} else if (op == 3) {
			co.setMemory(1200);
			co.setChoose(co.getChoose() + "Memória 8 Gb a R$1200,00\n");
		} else if (op == 4) {
			co.setMemory(2400);
			co.setChoose(co.getChoose() + "Memória 16 Gb a R$2400,00\n");
		}
		op = Integer.parseInt(JOptionPane.showInputDialog(
				"Escolha o HD do seu computador:\n0 - Para não escolher\n1 - 500Gb a R$400,00\n2 - 1Tb a R$600,00\n3 - 2Tb a R$800,00\n"));
		if (op == 1) {
			co.setHd(400);
			co.setChoose(co.getChoose() + "HD 500Gb a R$400,00\n");
		} else if (op == 2) {
			co.setHd(600);
			co.setChoose(co.getChoose() + "HD 1Tb a R$600,00\n");
		} else if (op == 3) {
			co.setHd(800);
			co.setChoose(co.getChoose() + "HD 2Tb a R$800,00\n");
		}
		op = Integer.parseInt(JOptionPane
				.showInputDialog("Escolha o monitor do seu comnputador:\n0 - Para não escolher\n1 - 17\" a R$390,00\n2 - 19\" a R$520,00\n"));
		if (op == 1) {
			co.setMonitor(390);
			co.setChoose(co.getChoose() + "Monitor 17\" a R$390,00\n");
		} else if (op == 2) {
			co.setMonitor(520);
			co.setChoose(co.getChoose() + "Monitor 19\" a R$520,00\n");
		}

		JOptionPane.showMessageDialog(null, co.getChoose() + "Valor Total: R$" + df.format(co.calPrice()));

	}

}

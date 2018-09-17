package Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double altura;
		int tip;
		double ideal;
		
		System.out.println("Digite o sexo da pessoa: [1-Feminino 2-Masculino]");
		tip = scan.nextInt();
		System.out.println("Coloque a altura em metros: ");
		altura = Double.parseDouble(scan.nextLine());
		
		if(tip==1) {
			ideal=(62.1*altura)-44.7;
			System.out.println("O peso ideal para essa pessoa do sexo feminino é de: "+df.format(ideal));
			
		}else if(tip==2) {
			ideal=(72.7*altura)-58;
			System.out.println("O peso ideal para essa pessoa do sexo masculino é de: "+df.format(ideal));
		}
		
		scan.close();
	}
}

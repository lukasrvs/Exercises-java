package Lista2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	double lados;
	double medida;
	
	System.out.println("Digite o n�mero de lados: ");
	lados = scan.nextDouble();
	
	if(lados==3) {
		
		System.out.println("Digite a medida em (cm) do tri�ngulo: ");
		medida = scan.nextDouble();
		medida = lados * medida;
		
		System.out.println("O valor da �rea desse tri�ngulo � de: "+medida);
	}else if(lados==4) {
		
		System.out.println("Digite a medida em (cm) do quadrado: ");
		medida = scan.nextDouble();
		medida = lados * medida;
		
		System.out.println("O valor da �rea desse quadrado � de: "+medida);
	}else if(lados==5) {
		
		System.out.println("Digite a medida em (cm) do pent�gono: ");
		medida = scan.nextDouble();
		medida = lados * medida;
		
		System.out.println("O valor da �rea desse pent�gono � de: "+medida);
	}
	
	scan.close();
	
	}
}

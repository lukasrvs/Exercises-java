package Lista2;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double l1;
		double l2;
		double l3;
		
		System.out.println("Digite a medida do lado 1: ");
		l1 = scan.nextDouble();
		System.out.println("Digite a medida do lado 2: ");
		l2 = scan.nextDouble();
		System.out.println("Digite a medida do lado 3: ");
		l3 = scan.nextDouble();
		
		if((l1==l2)&&(l2==l3)) {
			System.out.println("Esse triângulo é Equilátero \nPois possui os 3 lados iguais.");			
		}else if((l1!=l2)&&(l1==l3)||(l2!=l3)&&(l2==l1)) {
			System.out.println("Esse triângulo é Isóscele \nPois possui 2 lados iguais");
		}else if((l1!=l2)&&(l2!=l3)) {
			System.out.println("Esse triângulo é Escaleno \nPois possui 3 lados diferentes");
			
		}
		scan.close();
	}
}

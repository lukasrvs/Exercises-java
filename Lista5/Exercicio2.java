package Lista5;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
					
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			int number2[] = new int[20];
			int i=0,j=0,aux=0;
			
			for(i=0;i<20;i++) {
				System.out.println("Insira o "+(i+1)+"º número:");
				number2[i] = Integer.parseInt(scan.nextLine());
				numbers.add(number2[i]);
			}

			System.out.println("Ordem normal: ");
			for(i=0;i<20;i++) {
			System.out.println(numbers.get(i));
			}
			
			for(i=0;i<20;i++){
				for(j=0;j<20;j++){
					if (number2[j]>number2[j+1]){
						aux = number2[j];
						number2[j] = number2[j+1];
						number2[j+1] = aux;
					}
				}
			}
			
			for(i=0;i<20;i++) {
				System.out.println(number2[i]);
			}
			
			scan.close();
	}

}

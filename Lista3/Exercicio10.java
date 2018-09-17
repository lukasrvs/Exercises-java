package Lista3;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			double massaI=0;
			double tempo=0;
			int cont=0;
			int h=0;
			int m=0;
			
			System.out.println("Digite a massa inicial do material em gramas: ");
			massaI = Double.parseDouble(scan.nextLine());
			
			while(massaI >= 0.5) {
				massaI /= 2;
				cont++;
				
			}
			
			tempo = cont * 50;
			for(;;) {
				
			if(tempo >= 3600) {
				h++;
				tempo-=3600;
			}else if(tempo >= 60) {
				m++;
				tempo -=60;
			}else {
				System.out.println("Total: "+h+" horas "+m+" minutos "+tempo+" segundos ");
				break;
			}
		}
			scan.close();
	}

}

package Lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1=0;
		int n2=0;
		int i=0;
		System.out.println("Digite o primeiro n�mero desejado: ");
		n1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero desejado: ");
		n2 = scan.nextInt();
		
		if(n1<n2) {
			for(i=n1+1;i<n2;i++) {
				System.out.println(" "+i);
			}
		}else if(n1>n2) {
			System.out.println("O primeiro n�mero � maior que o segundo assim n�o sendo poss�vel prosseguir a opera��o\nPROGRAMA FINALIZANDO...");
		}
		scan.close();
	}
}

package Lista4;

import java.util.Scanner;
/*import java.util.List;
import java.util.ArrayList;
*/
public class Exercicio6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			String dezena[] = {"Vinte","Trinta","Quarente","Cinquenta","Sessenta","Setenta","Oitenta","Noventa"};
			String unidade[] = {"Um","Dois","Três","Quatro","Cinco","Seis","Sete","Oito","Nove"};
			String centena[] = {"Cento","Duzentos","Trezentos","Quatrocentos","Quinhentos","Seiscentos","Setecentos","Oitocentos","Novecentos"}; 
			String dez19[] = {"Onze","Doze","Treze","Quatorze","Quinze","Dezesseis","Dezessete","Dezoito","Dezenove"};
			int vet[] = new int[3];
			int i=0,nd = dezena.length,nu = unidade.length,nc = centena.length,n19 = dez19.length;
			
			System.out.println("Digite um número _ _ _");
			for(i=0;i<3;i++) {
				vet[i] = (scan.nextInt());
			}
			
			/*for(;;) {
				if(vet[i]==0) {
					break;
				}if(vet[i]<=9) {
					
				}if((vet[i]<9)&(vet[i]>20)) {
				
				}if((vet[i]<=99)&(vet[i]>=20)) {
					
				}if(vet[i]<=999) {
					
				}
			}*/
			for(i=0;i<nc;i++) {
				System.out.print(centena[i]+" ");
				}
				System.out.println("\n");
				for(i=0;i<nd;i++) {
				System.out.print(dezena[i]+" ");
				}
				System.out.println("\n");
				for(i=0;i<nu;i++) {
				System.out.print(unidade[i]+" ");
				}
				System.out.println("\n");
				for(i=0;i<n19;i++) {
				System.out.print(dez19[i]+" ");
				}
			
			scan.close();
	}
}
/* 
*/
package Lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i=0,num=0,primo=0;
		
		for(num=101;num<=1000;num++){
			for(i=2;i<(num-1);i++){
			if(num % i==0){
				primo=1;
				break;
			}	
			}
			if(primo==0){
				System.out.println(" "+num);
			}
			primo=0;
		}
		
		scan.close();
	}
}

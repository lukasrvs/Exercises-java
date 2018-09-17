package Lista1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        int x;
        int y;
        float result;

        System.out.println("Qual o valor de X : ");
        x = in.nextInt();

        System.out.println("Qual o valor de Y :");
        y = in.nextInt();

        result =  x/y ;
        
        System.out.println("O valor da divisão é: "+ result);
	
        in.close();    
    }

}

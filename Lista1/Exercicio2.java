package Lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        int x;
        int y;
        int z;
        float result;

        System.out.println("Qual o valor de X : ");
        x = in.nextInt();

        System.out.println("Qual o valor de Y :");
        y = in.nextInt();
        
        System.out.println("Qual o valor de Z :");
        z = in.nextInt();
        
        result =  (x+y+z)/3 ;
        
        System.out.println("O valor da media é: "+ result);
	
        in.close();    
    }
}

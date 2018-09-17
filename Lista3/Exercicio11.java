package Lista3;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			 double saque=0,s1;
		     int cont50=0, cont10=0, cont5=0, cont2=0;
		     double nota50=50.00, nota10=10.00, nota5=5.00, nota2=2.00;
			
			System.out.println("Entre com valor para saque: ");
		    saque =  scan.nextInt();
		    s1 = saque;

		    for(;;) {
		    if(saque>=nota50) {
			    	saque-=nota50;
				   	cont50++;
		    }else if(saque>=nota10) {
			    	saque-=nota10;
				   	cont10++;
		    }else if(saque>=nota5) {
			    	saque-=nota5;
				   	cont5++;
			    
		    }else if(saque>=nota2) {
			    	saque-=nota2;
				   	cont2++;
			}else if(saque==0.00) {
			    	break;
		    }
		    }
		    
		    System.out.println("Valor do saque R$"+s1+"\n"
			    				+"Número de notas de 50: "+cont50+"\n"
			    					+"Número de notas de 10: "+cont10+"\n"
			    						+"Número de notas de 5: "+cont5+"\n"
			    							+"Número de notas de 2: "+cont2);
		    
			scan.close();
	}

}

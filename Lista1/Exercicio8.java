package Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//limitar casas decimais
		DecimalFormat df = new DecimalFormat("0.00");
		
        double comprimentoPista;
        double voltas;
        double reabastecimentos;
        double consumo;
        double minimoLitros;

        System.out.println("Qual o comprimento da pista (KM)");
        comprimentoPista = Double.parseDouble(in.nextLine());

        System.out.println("Qual o numero de voltas da prova:");
        voltas = Double.parseDouble(in.nextLine());

        System.out.println("Qual a quantidade de reabastecimentos desejados:");
        reabastecimentos = Double.parseDouble(in.nextLine());

        System.out.println("Qual o consumo do carro:");
        consumo = Double.parseDouble(in.nextLine());
        
        minimoLitros = (comprimentoPista * voltas) / consumo / (reabastecimentos+1);
        
        System.out.println("A quantidade de combustível necessária até o primeiro reabastecimento é "+df.format(minimoLitros));
	
        in.close();    
    }
}

package Example;

import java.util.Scanner;

public class funcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			int a,b,c;
	
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			
			int higher = max(a, b, c);
			
			showResult(higher);
			
			scan.close();
	}



public static int max(int x,int y,int z) {
	int aux;
	
	if(x > y && x > z) {
		aux = x;
	}else if(y > z) {
		aux = y;
	}else {
		aux = z;
	}
	return aux;
}
	public static void showResult(int value) {
		System.out.println("Higher = "+value);
	}

}
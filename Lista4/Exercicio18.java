package Lista4;

import java.util.Random;

public class Exercicio18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int a[][] = new int[3][3];
		int i=0,j=0;
		int x=0,y=0,z=0;
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				a[i][j] = r.nextInt(5);
			}
		}
		
		x=(a[0][0]*a[2][2]);
		x=x-(a[2][1]*a[0][2]);
		x=x*(-a[1][0]);
		
		y=(a[0][0]*a[2][2]);
		y=y-(a[2][0]*a[0][2]);;
		y=y*a[1][1];
		
		z=(a[0][0]*a[2][1]);
		z=z-(a[2][0]*a[0][1]);
		z=z*(-a[1][2]);
		
		int det= x + y +z;
		
		System.out.println("Valor da determinante:"+det);
	}
}

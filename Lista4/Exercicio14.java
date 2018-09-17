package Lista4;

public class Exercicio14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a[][] = new int[5][5];
			int i=0,j=0;
			
			for(i=0;i<5;i++) {
				for(j=0;j<5;j++) {
					a[i][j]=0;
				}
			}
			
			a[0][0]=1;
			a[1][1]=1;
			a[2][2]=1;
			a[3][3]=1;
			a[4][4]=1;
			
			for(i=0;i<5;i++) {
				for(j=0;j<5;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
	}
}

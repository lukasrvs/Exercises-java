package Lista4;

public class Exercicio12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int a[][] = new int[10][10];
			int i=0,j=0;
			
			for(i=0;i<10;i++) {
				for(j=0;j<10;j++) {
					a[i][j]=i+j;
				}
			}
			System.out.println("Somada:");
			for(i=0;i<10;i++) {
				for(j=0;j<10;j++) {
					System.out.print(a[i][j]+"   ");
				}
				System.out.println("\n");
			}
			
			for(i=0;i<10;i++) {
				for(j=0;j<10;j++) {
					a[i][j]=i*j;
				}
			}
			System.out.println("Multiplicação:");
			for(i=0;i<10;i++) {
				for(j=0;j<10;j++) {
					System.out.print(a[i][j]+"   ");
				}
				System.out.println("\n");
			}
	}
}

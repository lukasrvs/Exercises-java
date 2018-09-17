package Lista5;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			String num = null;
			int aux=0,numbm=0,numbn=0;
			
			
			System.out.println("Digite os números desejados separando-os por ';' ");
			num = String.valueOf(scan.nextLine());
			
			String[] nums = num.split(";");
			
			for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
			int numb = Integer.parseInt(nums[i]);
			if(numb>aux) {
				numbm=numb;
			}
			if(numb<aux) {
				numbn=numb;
			}
			}
			
			System.out.println("Numero maior: "+numbm+"\nNumero menor: "+numbn);
			
			scan.close();
	}

}

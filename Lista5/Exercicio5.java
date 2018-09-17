package Lista5;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = "";
		String[] palavra = {"aula até o meio dia"};
		

		System.out.println(palavra);
		
		StringBuilder sb = new StringBuilder();
		for(String letra : palavra) {
		sb.append(letra);	
		}
		frase = sb.toString();
		
		System.out.println(frase);
		
		System.out.println(sb.reverse());
		
	}

}

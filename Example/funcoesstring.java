package Example;

public class funcoesstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = " adcde FGHIJ ABC abc DEFG";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'X');
		String s07 = original.replace("abc", "XY");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -"+original+" - ");
		System.out.println("toLowerCase: -"+s01+" - ");
		System.out.println("toUpperCase: -"+s02+" - ");
		System.out.println("trim: -"+s03+" - ");
		System.out.println("substring(2): -"+s04+" - ");
		System.out.println("substring (2, 9): -"+s05+" - ");
		System.out.println("replace('a', 'X'): -"+s06+" - ");
		System.out.println("replace('abc', 'XY'): -"+s07+" - ");
		System.out.println("Index of 'bc': -"+i+" - ");
		System.out.println("Last index of 'bc': -"+j+" - ");
		
		
	}

}

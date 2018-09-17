//Importar especificamente ou apenas: import java.util.*;

package Example;

import java.util.List;
import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {

		// Declaração
		List lista = new ArrayList();
		String[] listaStr;

		// Adicionando
		lista.add("campo 1");
		lista.add("campo 2");
		lista.add("campo 3");

		// Tamanho do ArrayList. Retorno: 3
		System.out.println("--- Imprimindo Tamanho do ArrayList ---");
		System.out.println(lista.size());

		// Imprimindo todo o ArrayList
		System.out.println("--- Imprimindo ArrayList ---");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		// Convertendo de ArrayList para Array(Matriz)
		listaStr = (String[]) lista.toArray(new String[0]);

		// Imprimindo toda a matriz
		System.out.println("--- Imprimindo Array ---");
		for (int i = 0; i < listaStr.length; i++) {
			System.out.println(listaStr[i]);
		}
	}
}
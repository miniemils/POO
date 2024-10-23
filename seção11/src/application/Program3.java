package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //"Marco" será movido para a posição 2 na lista
		
		System.out.println(list.size()); //informa o tamanho da lista
		// list.remove(1); //remove o elemento da posição 1
		
		//imprime cada elemento da lista
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println();
		
		//remove da lista elementos que atendam a um predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println();
		
		System.out.println("Index of Bob = " + list.indexOf("Bob"));
		System.out.println("Index of Bob = " + list.indexOf("Marco"));
		System.out.println();
		
		//filtra elementos que atendam a um predicado, neste caso, nomes que começam com a letra A
		List<String> result = list.stream().filter(x-> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x: result) {
			System.out.println(x);
		}
		System.out.println();

		//encontra elementos que atendam a um predicado, neste caso, o primeiro elemento que começa com J
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
			System.out.println(name);
		}

}

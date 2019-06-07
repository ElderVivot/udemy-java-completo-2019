package sec05.aula_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
		List<String> list = new ArrayList<>();
		
		// adiciona os dados
		list.add("Elder");
		list.add("Amanda");
		list.add("Emanuel");
		
		// adiciona valor numa posição definida
		list.add(1, "ama");
		list.add(4, "Helena");
		
		// obtêm o tamanho da lista
		System.out.println("Tamanho: " + list.size());
		
		// encontra a posição de alguém na lista
		System.out.println("Amanda está na posição: " + list.indexOf("Amanda"));
		System.out.println("Sofia está na posição: " + list.indexOf("Sofia")); // quando não encontra a pessoa na lista retorna o valor -1
		
		// percorre a lista
		for(String val : list) {
			System.out.println(val);
		}
		
		// percorre a lista filtrando só as pessoas que começam com o nome 'E'
		List<String> filtro = list.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());
		System.out.println("--------------------");
		for(String val : filtro) {
			System.out.println(val);
		}
		
		// encontra um elemento na lista verificando por uma função lambda
		String filtro2 = list.stream().filter(x -> x.charAt(0) == 'H').findFirst().orElse(null);
		System.out.println("Filtro 2: " + filtro2);
		
		// remove da lista pelo valor
		list.remove("Amanda");
		
		// remove da lista pelo índice
		list.remove(1);
		
		// remove objeto da lista por função lambda
		list.removeIf(x -> x.charAt(0) == 'E');
		
		// percorre a lista
		System.out.println("--------------------");
		for(String val : list) {
			System.out.println(val);
		}
	}

}

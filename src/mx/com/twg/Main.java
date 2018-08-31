package mx.com.twg;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// ArrayList and Vector extends List extends Collection
		// HashSet extends Set extends Collection
		// HashMap extends Map

		// Si no se especifica el tipo de dato, por defecto es de tipo Object


		List lista = new ArrayList<>();
		lista.add("q");
		lista.add("w");
		lista.add("e");
		lista.add("r");
		lista.add("t");
		lista.add("t");
		
		imprimir(lista);
		
		Set set = new HashSet();
		
		set.add("100");
		set.add("200");
		set.add("300");
		set.add("300"); // No permite datos duplicados
		
		imprimir(set);
		
		Map map = new HashMap();
		map.put("1","N");
		map.put("2","H");
		map.put("3","C");
		
		imprimir(map.keySet());
		imprimir(map.values());
		
	}
	

	public static void imprimir(Collection lista){
		for(Object e:lista){
			System.out.print(e+" ");
		}
		System.out.println();
	}

}

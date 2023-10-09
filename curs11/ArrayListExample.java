package curs11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println(list.size());
		
		list.add("Mere");
		list.add("Pere");
		list.add("Prune");
		list.add("Gutui");
		
		System.out.println(list.size());
		
		for(String denumire : list){
			System.out.println(denumire);
			
		}
		
		System.out.println("Intoarce elementul cerut: ");
		
		//citesc element din lista
		System.out.println(list.get(2));
		
		System.out.println("============================");
		for(String denumire :list) {
			System.out.println(list.indexOf(denumire) + " : " + denumire);
		}
		//System.out.println(list.get(4));
		
		System.out.println("============================");
		
		//adaugam in lista
		list.add(0, "Struguri");
		list.add(5, "Capsuni");
		for(String denumire :list) {
			System.out.println(list.indexOf(denumire) + " : " + denumire);
		}
		
		//stergem din lista
		list.remove(4);
		System.out.println("============================");
		System.out.println(list.size());
		System.out.println("Lista noua: ");
		for(String denumire :list) {
			System.out.println(list.indexOf(denumire) + " : " + denumire);
		}
	
	}
	
}

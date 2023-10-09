package curs11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		String[] culori = {"alb", "negru", "verde", "albastru", "mov", "galben"};
		List<String> list = new ArrayList<>(Arrays.asList(culori));
		System.out.println(list);
		System.out.println(list.size());
		list.add("roz");
		System.out.println(list.size());
		System.out.println("================================================");
		//metoda care ne ajuta sa vedem daca contine un anumit element
		System.out.println(list.contains("maro"));
		
		System.out.println("================================================");
		//ne permite sa facem update unui element
		System.out.println(list.get(0));
		list.set(0, "alb pudra");
		System.out.println(list.get(0));
		System.out.println("================================================");
		for(String element:list) {
			System.out.println(element);
		}
		
		//stergem mai multe elemente
		list.subList(0, 2).clear();//imi sterge de la indexul 0 nclusiv pana la 2 exclusiv, deci doar doua elemente
		System.out.println("================================================");
		for(String element:list) {
			System.out.println(element);
		}
	}

}

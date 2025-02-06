package learnJava;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(33);
		set.add(48);
		set.add(98);
		set.add(68);
		set.add(78);
		
		
		System.out.println("Hashset print :  "+ set);
		
		System.out.println("Iterating using for loop : ");
		for(int num : set) {
			System.out.println(num);
		}
	}

}

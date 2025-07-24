package IntCode;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		System.out.println("Even nombers:");
		//list.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		list.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}

package StringCode;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestCode {

	public static void main(String[] args) {
	List<String> list=Arrays.asList("usa","japan","france","itely","uk","japan");
	
	//unique String that start with U&G in uppercase
	Set<String> set=list.stream()
			.filter(e->e.startsWith("u") || e.startsWith("g")).map(String::toUpperCase).collect(Collectors.toSet());
	
	//get the first letter of each string
	List<Character> firstLet = list.stream().map(s -> s.charAt(0)).collect(Collectors.toList());
	}
	
}

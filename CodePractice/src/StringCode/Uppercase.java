package StringCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("dilip", "gavande");
		List<String> listUpper = list.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(listUpper);
	}

}

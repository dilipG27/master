package StringCode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class findCountOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "string data to count each character";
		findCountOfChars(s);
	}

	public static void findCountOfChars(String s) {
		Map<String, Long> map = Arrays.stream(s.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));

		 map.entrySet().stream().forEach(e -> System.out.println(e));

		/*
		 * for (Entry<String, Long> entry : map.entrySet()) { if (entry.getValue() > 1)
		 * { System.out.println(entry.getKey() + "/" + entry.getValue()); } }
		 */
	}

}

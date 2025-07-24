package StringCode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListtoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> mixedList = Arrays.asList("apple", 100, "banana", 200, 300, "cherry");

        Map<Object, Object> map = mixedList.stream()
            .collect(Collectors.toMap(
                e -> e,  // key = element
                e -> e  // value = element
            ));

        System.out.println(map);
	}
	
	// To fetch records from an employee table where both name and address are the same for multiple employees, you can use the following SQL query:
   //SELECT name, address FROM employee GROUP BY name, address HAVING COUNT(*) > 1;
}

package StringCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SalaryMorethenName {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
        
		empList.add(new Employee("dilip",40000,"Gavande","It"));
		empList.add(new Employee("sonu",50000,"Gavande","It"));
		empList.add(new Employee("harsh",50000,"konde","It"));
		empList.add(new Employee("rakesh",30000,"b","Testing"));
		empList.add(new Employee("vinod",20000,"p","It"));
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ","[","]"));
        System.out.println("joinedString::"+joinedString);
        
        List<String> list=empList.stream().filter(e->e.getSalary()>30000).map(Employee::getName).collect(Collectors.toList());
		list.forEach(e->System.out.println(e));
		//more 5k salary list of name 
		List<String> list1=empList.stream().filter(e->e.getSalary()>50000).map(Employee::getName).collect(Collectors.toList());
		list.forEach(e->System.out.println(e));
		//2nd highest salary
		//Optional<Integer>  ndValue=empList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		//Dept wise higher salary
		Map<String,Optional<Employee>> map=empList.stream().collect(Collectors.groupingBy(Employee::getDept,
				                                             Collectors.maxBy(Comparator.comparing(Employee::getSalary))));		
		//list to map convertion		
		Map<String,Integer> mapConv=empList.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));		
				
		//sort employee list reverse by employee name
		empList.sort(Comparator.comparing(Employee::getlName).thenComparingDouble(Employee::getSalary).reversed()
				);
		Integer arr[]={1,2,3,4,5,6,7};  // number of occurenece 
		List<Integer> list11= Arrays.asList(arr);
		String s="dilip";
		//String []ss= {"d","i","l","i","p"};
		String []ss=s.split("");
		List<String> listString=Arrays.asList(ss);
		Map<Integer,Long> map23=list11.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<String,Long> mapString=listString.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));  
		mapString.forEach((k,v)->{System.out.println("k-> "+k +" v-> "+v);});
		
		String str="juliasamanthantjulia";
		String str1="ant";
		
		int a=str.indexOf(str1);
		System.out.println("testing="+a);
		
	}

}

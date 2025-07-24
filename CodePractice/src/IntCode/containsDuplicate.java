package IntCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class containsDuplicate {

	public static void main(String[] args) {
		int[] nums= {1,2,3,3};
		boolean result=containsDuplicates(nums);
		System.out.println("Result:"+result);
	}
	public static boolean containsDuplicates(int[] nums) {
		
		List<Integer> list=Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> set=new HashSet<>(list);
		
		if(set.size()==list.size()) {
			return false;
		}else
			return true;
		
	}
}

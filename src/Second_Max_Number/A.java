package Second_Max_Number;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A {  //calculate second last Max number using Stream API
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(45,85,21,53,93,84,55);
		
		Integer num = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(num);
		
		
		
	}

}

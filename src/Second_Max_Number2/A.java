package Second_Max_Number2;

import java.util.Arrays;
import java.util.List;

public class A { //calculate the second First Max number using Stream API
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(45,85,21,53,93,84,55);
		
		Integer num = list.stream().sorted().skip(3).findFirst().get();
		
		System.out.println(num);
		
	}

}

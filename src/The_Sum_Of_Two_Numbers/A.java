package The_Sum_Of_Two_Numbers;

import java.util.Arrays;
import java.util.List;

public class A {  //The sum of two given numbers and add
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(50,80);
		int sum = list.stream().filter(n->n%2==0).peek(n->System.out.println(n+" ")).mapToInt(n->n).sum();
		
		System.out.println("The sum of the given number is"+sum);
		
		
		
		
		
		
	}

}

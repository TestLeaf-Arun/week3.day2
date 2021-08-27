package week3.day2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class FindIntersectionCollections {
	public static void main(String[] args) {
		
		Integer[] arr1 = {3,2,11,4,6,7};
		Integer[] arr2 = {1,2,8,4,9,7};
		
		Set<Integer> test1 = new HashSet<Integer>();
		test1.addAll(Arrays.asList(arr1));
		
		Set<Integer> test2 = new HashSet<Integer>();
		test2.addAll(Arrays.asList(arr2));
		
		test2.retainAll(test1);
		System.out.println("Intersection:" + test2);
	}
}
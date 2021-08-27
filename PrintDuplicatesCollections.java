package week3.day2;
import java.util.LinkedHashSet;
import java.util.Set;
public class PrintDuplicatesCollections {
	public static void main(String[] args) {		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set<Integer> num = new LinkedHashSet<Integer>();
			for (Integer eachData : arr) {
				if (!num.add(eachData)) {
					System.out.println(eachData);
				}
			}
	}
}
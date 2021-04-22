package Set;
import java.util.*;

public class SubArraySumZero {

	public static void main(String[] args) {
		int [] a = {2,1,-3,4,2};
		boolean found = true;
		int sum = 0;
		Set<Integer> set = new HashSet<>();
		for(int element : a) {
			set.add(sum);
			sum+=element;
			if(set.contains(sum)) {
				found = true;
				break;
			}
		}
		System.out.println("found "+found);
	}
}

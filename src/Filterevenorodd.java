import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filterevenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al= Arrays.asList(1,2,4,5,7,9);
		al.stream().filter(n->n%2==0).forEach(System.out::println);
		al.stream().filter(n->n%2 !=0).forEach(System.out::println);
	}

}

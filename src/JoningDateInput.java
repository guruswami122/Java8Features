import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JoningDateInput {
	
	public static void main(String[] args) {


         LocalDate date = LocalDate.parse("2001-06-15");
		// LocalDate date = LocalDate.parse("2022-12-12");

           streamFilter(getUserMap(), date).forEach(System.out::println);
          }

       private static Map<Integer, Customer> getUserMap() {
        
    	Map<Integer, Customer> userMap = new HashMap<Integer, Customer>();
		userMap.put(1, new Customer(101, "Guru", LocalDate.of(2022, 12, 12), "Male", "Graduate", "Manager", 20 ));
		userMap.put(2, new Customer(102, "Swami", LocalDate.of(2021, 2, 22), "Female", "SSLC", "Developer", 15));
		userMap.put(3, new Customer(103, "Raja", LocalDate.of(1994, 3, 3), "Male", "Post Graduate", "Manager", 10));
		userMap.put(4, new Customer(104, "Rajesh", LocalDate.of(2001, 6, 15), "Male", "Graduate", "TechnicalLead", 6));
		userMap.put(5, new Customer(105, "Ragavendra", LocalDate.of(2002, 8, 31), "Male", "Graduate", "Manager", 9));
		userMap.put(6, new Customer(106, "Sai", LocalDate.of(2022, 12, 12), "Male", "Graduate", "TechnicalLead", 5));
		userMap.put(7, new Customer(107, "James", LocalDate.of(2021, 2, 25), "Female", "SSLC", "Developer", 5));
		userMap.put(8, new Customer(108, "Pradeep", LocalDate.of(1994, 3, 5), "Male", "Post Graduate", "TechnicalLead", 4));
		userMap.put(9, new Customer(109, "Suresh", LocalDate.of(2001, 6, 16), "Male", "Graduate", "Developer", 5));
		userMap.put(10, new Customer(110, "Sagar", LocalDate.of(2002, 8, 30), "Male", "Graduate", "TechnicalLead", 8));

          return userMap;
		}

      private static List<Customer> streamFilter(Map<Integer, Customer> userMap, LocalDate date) {
		List<Customer> userList = userMap.values().stream().filter(u -> u.getDateOfJoning().equals(date))
		.collect(Collectors.toList());
		return userList;



		}

}

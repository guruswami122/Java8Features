import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadUserFile {
	
      public void readFileData() {
		String fileName = "D:\\employee_data.txt";

          try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
          List<String> strings = stream.collect(Collectors.toList());
		  strings.forEach(System.out::println);

       } catch (IOException e) {
		e.printStackTrace();
		
		}
	}	
      public static void main(String[] args) {
    	  ReadUserFile a=new ReadUserFile();
    	  a.readFileData();
      }
}

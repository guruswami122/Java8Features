import java.util.Scanner;

public class ReadingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.next();
		char ch=str.charAt(1);
		System.out.println("entered string is" +  "  "+ch);

	}

}

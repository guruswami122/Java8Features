import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Radar",rev="";
		int length=s.length();
		for (int i=length-1;i>=0;i--) {
		rev=rev+s.charAt(i);}
		
		//Reverse String
		//System.out.println("reverse string"   +"  "+rev);
		
		//Palindrome
		
		if (s.toLowerCase().equals(rev.toLowerCase())) {
		      System.out.println(s + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(s + " is not a Palindrome String.");
		    }
		
	}

}

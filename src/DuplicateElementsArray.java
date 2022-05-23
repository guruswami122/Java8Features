
public class DuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 6, 7, 6, 2, 19, 1, 19};
	    for(int i = 0; i < a.length; i++)
	      for(int j = i + 1; j < a.length; j++)
	        if(a[i] == a[j])
	          System.out.println("Duplicate element found " + a[j]);
	        
	      

	    
	}
}



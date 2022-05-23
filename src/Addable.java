
interface Addable1{  
    int add(int a,int b);  
}  
public class Addable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable1 abc=(int a,int b)->(a+b);
		System.out.println(abc.add(10,20));
	
		
		
	}

}

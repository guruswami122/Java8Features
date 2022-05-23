interface Drawble{
	void draw();
}

public class Stringswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=10;
		Drawble d2=( )->{
		          System.out.println("Drawble mthod"+width);
	};
	d2.draw();
	
	}

}

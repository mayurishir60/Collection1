import java.util.ArrayList;

// pgm -2 pgm for design generic arraylist for integer type
public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer>al= new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);
		
		// traversing using for each loop
		
		for(int a :al) {
			System.out.println("        "+a);
		}
		
	}

}

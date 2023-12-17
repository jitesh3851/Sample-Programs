
public class Recursion {

	static int  reps = 1;	
	
	public static void printName(String name) {
		if(reps>5) {
			return;
		}
		System.out.println(name);
		reps ++;
		printName("Jitesh");
	}
	
	public static void main(String[] args) {
		
		printName("Jitesh");

	}

}

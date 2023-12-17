import java.util.Scanner;

public class ReverseTheInteger {

	public static void main(String[] args) {
		reverseInt() ;
	}
	
	public static int reverseInt() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a number");
			int n = sc.nextInt();
			System.out.println("you entered : "+ n);
			int quotient = 0;
			int reverse = 0;
			while (quotient >0 ) {
			int remainder = n%10;
			quotient = n/10;
			reverse = reverse * 10 + remainder;
			}
			System.out.println("reverse is :"+ reverse);
			return reverse;
		}
	}
}
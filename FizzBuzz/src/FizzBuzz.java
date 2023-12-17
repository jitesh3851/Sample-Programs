
public class FizzBuzz {

	public static void main(String[] args) {
		
		
		int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		for(int i=0 ; i<= numbers.length-1; i++) {
			if(numbers[i]%3 == 0 && numbers[i]%5==0) {
				System.out.println(numbers[i]+" "+ "FizzBuzz");
			}else if(numbers[i]%3==0) {
				System.out.println(numbers[i]+" "+ "Fizz");
			}else if(numbers[i]%5==0) {
				System.out.println(numbers[i]+" "+ "Buzz");
			}else {
				System.out.println(numbers[i]);
			}
		}

	}

}


public class FizzBuzz {

	public FizzBuzz() {
		
	}

	public static void main(String[] args) {
		int x = 1;
		
		while(x<101){
			System.out.print(x);
			
			if(x % 3 == 0 && x % 5 == 0)
				System.out.print(" FizzBuzz");
			else if(x % 3 == 0)
				System.out.print(" Fizz");
			else if(x % 5 == 0)
				System.out.print(" Buzz");
			x++;
			System.out.println();
			
		}

	}

}

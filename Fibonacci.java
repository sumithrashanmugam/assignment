package assignment;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c= 2;
		int sum;
		for (int i = 0; i <17; i++) {
			sum = a + b;
			a = b;
			b = c;
			c=sum;
			System.out.println(c+"  ");
		}
			
		
			
		
	}
	

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}

}

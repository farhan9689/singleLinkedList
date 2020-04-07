package recursion;

public class Fibonacci {
	
	int  fib(int n){
		if(n<=2)
			return n-1;
		else {
			return fib(n-2)+fib(n-1);
		}
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		for(int i=1; i<=9; i++)
			System.out.print(f.fib(i)+"  ");
	}

}

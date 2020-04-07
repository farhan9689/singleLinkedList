package recursion;

public class Factorial {
	int result=0;
	int fact(int n){
		if(n<1)
			return 1;
		else{
			return n*fact(n-1);
		}
	}
	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.fact(4));
	}

}

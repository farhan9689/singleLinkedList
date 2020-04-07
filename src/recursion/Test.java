package recursion;

public class Test {

	void foo(int n){
		if(n<1){
			System.out.println("printing of numbers start after this");
		}
		else{
			foo(n-1);
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.foo(3);
		
	}

}

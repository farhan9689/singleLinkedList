package arrays;

public class Test {

	public static void main(String[] args) {
		// observing deleting a cell value in an array.
		
		int[] a = {1,2,3,4,5};
		System.out.println("array before deleting");
		for(int b: a){
			System.out.print(" "+b);
		}
		a[2]=Integer.MIN_VALUE;
		System.out.println("\n array after deleting");
		
		for(int b: a){
			System.out.print(" "+b);
		}

	}

}

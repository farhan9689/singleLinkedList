package arrays;

public class Methods {
	int arr[];
	
	//initialization with default value 
	Methods(int size){
		arr = new int[size];
	}
	
	//printing array
	void print(){
		
		try{
				for(int i=0; i<arr.length; i++){
					System.out.print(arr[i]+ " ");
				}
			
		}
		catch(Exception e){
			System.out.println("Array does not exists");
		}
	}
	
	//adding value 
	void add(int indexValue, int value){
		try{
			if(arr[indexValue]==0){
				arr[indexValue]=value;
				System.out.println(value+" is added at the index "+indexValue);
			}
			else{
				System.out.println("This cell is already occupied ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
	
	
	
}

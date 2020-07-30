package singleLinkedList;

public class Methods {
	Node start, tail;
	int size = 0;
	
	//creating List
	void createSingleLinkedList(int data){
			
		if(start==null){
			Node n = new Node();
			start = n;
			size++;
			n.setData(data);
			tail=n;
		}
		else{
			System.out.println("List Already present");
		}
	
	}//end
	
	//add node at first position 
	 void addFirst(int data){
	
		if(start!=null){
			Node n = new Node();
			n.setNext(start);
			start=n;
			n.setData(data);
			size++;
		}
		else{
			System.out.println("List doesn't exist");
		}
	
	}//end
	 
	 //adding node at last 
	void addLast(int data){
		if(start != null){ 
			Node n = new Node();
			n.setData(data);
			tail.setNext(n);
			tail=n;
			size++;
		}else {
			System.out.println("List doesn't exist");
		}
	 }
	
	//adding element at location 
	void addAtIndex(int index, int data){
		if(start != null){
			if(index==1)
				addFirst(data);
			else if(index == size+1)
				addLast(data);
			else{
				Node n = new Node();
				Node t;
				t=start;
				for(int i=1; i<index-1;i++){
					t = t.getNext();
				}
				n.setNext(t.getNext());
				t.setNext(n);
				n.setData(data);
				size++;
			}
		} else{
			System.out.println("List doesn't Exist");
		}
	}
	
	//Displaying List 
	
	void display(){
		Node t;
		t=start;
		for(int i=1; i<=size; i++){
			System.out.print(t.getData()+" ");
			t=t.getNext();
		}
		System.out.println(size+":size");
	}
}

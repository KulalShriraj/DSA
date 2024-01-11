package placement_preperation;

public class stack {
	int stack[]=new int[8];
	int top=-1;
	
	
	
	
	void push(int item) {
		if(top==stack.length-1) {
			System.out.println("Stack is full");
		}
		else {
			top=top+1;
			stack[top]=item;
			
		}
		
	}
	
	void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			
		}
		else {
			int item=stack[top];
			top=top-1;
			System.out.println("deleted item "+ item );
		}
		
		
		
	}
	
	
	
	void display() {
		System.out.println("items are");
		for(int i=0;i<=top;i++) {
			System.out.println(stack[i]);
		}
	}

	public static void main(String[] args) {
	  stack ob=new stack();
	  ob.push(2);
	  ob.push(4);
	  ob.push(6);
	  ob.push(8);
	  ob.push(10);
	  ob.push(12);
	  ob.push(35);
	  ob.push(90);
	  ob.pop();
	  ob.pop();
	  ob.pop();
	
		 
	 
	  ob.display();

	}

}

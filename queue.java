package placement_preperation;

public class queue {
	int queue[]=new int[10];
	int front=0;
	int rear=-1;
	
	void enqueue(int item) {
		if(rear==queue.length-1) {
			System.out.println("Queue is full");
			
		}
		else {
			rear=rear+1;
			queue[rear]=item;
			
		}
		
	}

	void dequeue() {
		if(front==-1 || front >rear) {
			System.out.println("Queue is empty");
		}
		else
		{
			int item=queue[front];
			front=front+1;
			System.out.println("Deleted item is"+item);
			if (front > rear) {
	            front = -1;
	            rear = -1;
	        }
		}
	}
	
	void display()
	{
		
		
		System.out.println("items are");
		for(int i=front;i<=rear;i++) {
			System.out.println(queue[i]);
		}
	}
	
	

	public static void main(String[] args) {
	queue sb=new queue();
	sb.enqueue(10);
	sb.enqueue(30);
	sb.enqueue(340);
	sb.enqueue(80);
	sb.enqueue(90);
	sb.enqueue(100);
	sb.enqueue(20);
	sb.dequeue();
	sb.display();
	

	}

}

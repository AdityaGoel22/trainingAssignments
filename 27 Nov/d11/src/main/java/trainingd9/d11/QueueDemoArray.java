package trainingd9.d11;

public class QueueDemoArray {

	private static int front = -1;
	private static int rear = -1;
	private static int[] myQueue = new int[10];

	public static boolean isEmpty() {
		return front > rear || front == -1;
	}

	public static boolean isFull() {
		return rear == myQueue.length - 1;
	}

	public static void insert(int ele) {

		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (rear == -1) {
				front = 0;
				myQueue[++rear] = ele;
			} else {
				myQueue[++rear] = ele;
			}
		}

		System.out.println("Inserted " + ele);
	}
	
	public static void delete() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			front=rear=-1;
		}
		else {
			System.out.println("Element deleted: " + myQueue[front++]);
			if(front>rear) {
				front=rear=-1;
			}
		}
	}
	
	public static void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			
			for(int i=0; i<myQueue.length; i++) {
				System.out.println(myQueue[i]);
			}
		}
	}
}

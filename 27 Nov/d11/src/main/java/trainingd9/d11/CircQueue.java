package trainingd9.d11;

public class CircQueue {

	private static int front = -1;
	private static int rear = -1;
	private static int[] myCQueue = new int[10];

	public static boolean isEmpty() {
		return front > rear || front == -1;
	}

	public static boolean isFull() {
		return (rear+1)%10 == front;
	}

	public static void insert(int ele) {

		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (rear == -1) {
				myCQueue[++rear] = ele;
				front = 0;
			} else {
				rear = (rear+1)%10;
				myCQueue[++rear] = ele;
			}
		}

		System.out.println("Inserted " + ele);
	}

	public static void delete() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Element deleted: " + myCQueue[front++]);
			if (front == rear) {
				front = rear = -1;
			}
			else
				front = (front + 1)%10;
		}
	}

	public static void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {

			for (int i = 0; i < myCQueue.length; i++) {
				System.out.println(myCQueue[i]);
			}
		}
	}
}

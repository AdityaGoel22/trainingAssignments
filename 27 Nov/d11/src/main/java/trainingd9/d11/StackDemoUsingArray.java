package trainingd9.d11;

public class StackDemoUsingArray {

	private static int[] numStack = new int[10];
	private static int top = -1;

	public static boolean isEmpty() {

		return top == -1;
	}

	public static boolean isFull() {

		return top == numStack.length;
	}

	public static void push(int ele) {
		if (isFull()) {
			System.out.println("Stack Overflow");
		} else {
			System.out.println("Pushing in the Stack");
			numStack[++top] = ele;
			display();
		}
	}

	public static void pop() {
		if (isEmpty()) {
			System.out.println("Empty Stack");
		} else {
			System.out.println("Popping the Stack");
			System.out.println(numStack[top]);
			top--;
		}
	}

	public static void display() {
		for(int i =0; i<numStack.length;i++) {
			System.out.println(numStack[i]);
		}
	}

	public static void peek() {
		System.out.println("Peeking the Stack");
		System.out.println(numStack[top]);
	}

	public static void main(String[] args) {

		pop();
		push(2);
		push(5);
		pop();
		peek();

	}

}

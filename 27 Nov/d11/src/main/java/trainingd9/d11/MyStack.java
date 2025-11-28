package trainingd9.d11;

import java.util.Scanner;

public class MyStack {

	private static Node top = null;
	
	public static boolean isEmpty() {
		return top == null;
	}
	
	public static Node createNode() {
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter data");
		int data = c.nextInt();
		return new Node(data);
	}
	
	public static void push() {
		
		Node newNode = createNode();
		if(top == null) {
			top = newNode;
		}
		else {
			newNode.setNext(top);
			top = newNode;
		}
		System.out.println("Insertion done");
	}
	
	public static void pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow");
		}
		else {
			System.out.print("Popping ");
			System.out.println(top.getData());
			Node temp = top;
			
			top = top.getNext();
			temp.setNext(null);
		}
	}
	
	public static void display() {
		if(isEmpty()) {
			System.out.println("No stack exists");
		} else {
			Node temp = top;
			
			while(temp != null) {
				System.out.print(temp.getData() + "-->");
				temp = temp.getNext();
			}
		}
		System.out.println("null");
	}
}

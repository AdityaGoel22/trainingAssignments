package trainingd9.d11;

import java.util.Scanner;

public class LinearSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,23,59,47,68,99,05,42,69};
		
		System.out.println("Enter key element to search");
		
		
		Scanner sc =new Scanner(System.in);
		int key = sc.nextInt();
		int i = 0;
		for (; i<arr.length; i++) {
			if(key==arr[i]) {
				System.out.println("Element found at " + (i+1) +" the position");
				break;
			}
		}
		if(i==arr.length) {
			System.out.println("ELement not found");
		}
	}

}

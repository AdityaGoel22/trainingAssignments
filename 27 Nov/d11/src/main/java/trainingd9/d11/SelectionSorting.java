package trainingd9.d11;

public class SelectionSorting {

	public static void main(String[] args) {

		int arr[] = {67,10,23,59,47,68,99,05,42,69};
		int temp, min;
		
		for(int i = 0; i<arr.length;i++) {
			min= i;
			for(int j = i+1; j<arr.length;j++) {
				if (arr[min]>arr[j]) {
					min = j;
				}
			}
			if(i!=min) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min]=temp;
			}
		}
		
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}

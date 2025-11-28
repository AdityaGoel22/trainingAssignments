package trainingd9._Nov;

public class MergeSorting {
	
	public static void merge(int[] arr, int left, int mid, int right) {
		
		int len1 = mid - left + 1;
		int len2 = right - mid;
		int larr[] = new int[len1];
		int rarr[] = new int[len2];
		
		for (int i = 0; i< len1; i++) {
			larr[i] = arr[left+i];
		}	
		for(int i = 0; i < len2; i++) {
			rarr[i] = arr[mid + 1 + i];
		}
		
		int a = 0, b = 0, c = left;
		while (a < len1 && b < len2) {
			if(larr[a] <= rarr[b]) {
				arr[c++] = larr[a++];
			} else {
				arr[c++] = rarr[b++];
			}
		}
		while (a<len1) {
			arr[c++] = larr[a++];
		}
		
		while (b<len2) {
			arr[c++] = rarr[b++];
		}
		
	}

	public static void mergeSort(int[] arr, int left, int right) {
		if(left<right) {
			int mid = (right+left)/2;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
			
		}
		
		System.out.println("\n");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {67,10,23,59,47,68,99,05,42,69};
		
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("\nAfter sorting");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

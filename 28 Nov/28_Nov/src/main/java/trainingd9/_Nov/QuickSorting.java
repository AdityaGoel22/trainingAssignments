package trainingd9._Nov;

public class QuickSorting {
	
	public static void quickSort(int arr[], int low, int high) {
		
		
		if(low<high) {
			int pivot = partition(arr, low, high);
			
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot, high);
		}
	}
	
	private static int partition(int arr[], int begin, int end) {
	    int pivot = arr[end];
	    int i = (begin-1);

	    for (int j = begin; j < end; j++) {
	        if (arr[j] <= pivot) {
	            i++;

	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }

	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[end];
	    arr[end] = swapTemp;

	    return i+1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 67, 10, 23, 59, 47, 68, 99, 05, 42, 69 };

		quickSort(arr, 0, arr.length - 1);

		System.out.println("\nAfter sorting");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

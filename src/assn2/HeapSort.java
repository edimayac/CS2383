package assn2;

public class HeapSort {
    public static void main(String args[]) { 
    	int A[] = {3, 6, 10, 18, 8, 7, 25, 40};
        sort(A); 
        show(A); 
    } 
    
    public static void sort(int[] A) {
    	int n = A.length; 
    	  
        // Build heap (rearrange array) 
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(A, n, i); 
  
        // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = A[0]; 
            A[0] = A[i]; 
            A[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapify(A, i, 0); 
        } 
    } 

	public static void show(int[] A) {
		int n = A.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(A[i] + " "); 
        System.out.println();
	}

	// To heapify a subtree rooted with node i which is 
    // an index in arr[]. n is size of heap 
    private static void heapify(int arr[], int n, int i) 
    { 
        int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
  
        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        // If largest is not root 
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest); 
        } 
    }
}

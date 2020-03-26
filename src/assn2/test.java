//
//package assn2;
//
//public class MergeSort {
//    public static void main(String args[]) { 
//        int[] A = {3, 6, 10, 18, 8, 7, 25, 40};
//        sort(A, 0, A.length);
//        show(A);
//    } 
//    
//    public static void sort(int[] A, int l, int r) {
//    	if (l < r) {
//			return;
//		} else {
//			int m = (l + r)/2;
//			
// 			sort(A, l, m);
//			sort(A, m+1, r);
//			
//			merge(A, l, m, r);
//		}
//    }
//
//	public static void show(int[] A) {
//		for (int i = 0; i < A.length; i++) {
//			System.out.print(A[i] + ", ");
//		}
//	}
//
//	private static void merge(int[] A, int low, int mid, int high) {
//		int[] B = new int[high];
//		for (int i = low; i < high; i++) {
//			B[i] = A[i];
//		}
//		
//		int i = low;
//		int j = mid + 1;
//		int k = low;
//		
//		while (i <= mid && j <= high) {
//			if (B[i] <= B[j]) {
//				A[k] = B[i];
//				i++;
//			} else {
//				A[k] = B[j];
//				j++;
//			}
//			k++;
//		}
//		while (i <= mid) {
//			A[k] = B[i];
//			k++;
//			i++;
//		}
//	}
//}
//
//
//package assn2;
//
//public class MergeSort {
//    public static void main(String args[]) { 
//    	int A[] = {3, 6, 10, 18, 8, 7, 25, 40};
//        sort(A); 
//        show(A); 
//    } 
//    
//    public static void sort(int[] A) {
//    	mergeSort(A, 0, A.length-1);
//    }
//
//	public static void show(int[] A) {
//		int n = A.length; 
//        for (int i=0; i<n; ++i) 
//            System.out.print(A[i] + " "); 
//        System.out.println();
//	}
//	
//	private static void mergeSort(int arr[], int l, int r) {
//		if (l < r) { 
//            // Find the middle point 
//            int m = (l+r)/2; 
//  
//            // Sort first and second halves 
//            mergeSort(arr, l, m); 
//            mergeSort(arr , m+1, r); 
//  
//            // Merge the sorted halves 
//            merge(arr, l, m, r); 
//        } 
//	}
//
//	private static void merge(int arr[], int l, int m, int r) {
//		// Find sizes of two subarrays to be merged 
//        int n1 = m - l + 1; 
//        int n2 = r - m; 
//  
//        /* Create temp arrays */
//        int L[] = new int [n1]; 
//        int R[] = new int [n2]; 
//  
//        /*Copy data to temp arrays*/
//        for (int i=0; i<n1; ++i) 
//            L[i] = arr[l + i]; 
//        for (int j=0; j<n2; ++j) 
//            R[j] = arr[m + 1+ j]; 
//  
//  
//        /* Merge the temp arrays */
//  
//        // Initial indexes of first and second subarrays 
//        int i = 0, j = 0; 
//  
//        // Initial index of merged subarry array 
//        int k = l; 
//        while (i < n1 && j < n2) 
//        { 
//            if (L[i] <= R[j]) 
//            { 
//                arr[k] = L[i]; 
//                i++; 
//            } 
//            else
//            { 
//                arr[k] = R[j]; 
//                j++; 
//            } 
//            k++; 
//        } 
//  
//        /* Copy remaining elements of L[] if any */
//        while (i < n1) 
//        { 
//            arr[k] = L[i]; 
//            i++;
//            k++;
//        } 
//  
//        /* Copy remaining elements of R[] if any */
//        while (j < n2) 
//        { 
//            arr[k] = R[j]; 
//            j++; 
//            k++; 
//        }
//	}
//}
//
//private Node addRecursive(Node current, int value) {
//    if (current == null) {
//        return new Node(value);
//    } 
// 
//    if (value < current.value) {
//        current.left = addRecursive(current.left, value);
//    } else if (value > current.value) {
//        current.right = addRecursive(current.right, value);
//    } else {
//        // value already exists
//        return current;
//    }
// 
//    return current;
//}

package sort;

public class SelectionSort {

	public static void main(String[] args) {
		int [] A = {7, 4, 8 ,2, 5, 3, 9};
		sort(A);
		show(A); 
	}
	
	public static void sort(int[] A) {
		int temp = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i; j < A.length; j++) {
				if (A[j] < A[i]) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
	}
	
	public static void show(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}
	}

}

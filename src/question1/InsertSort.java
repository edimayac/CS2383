package question1;

public class InsertSort {

	public static void main(String[] args) {
		int [] A = {7, 4, 8 ,2, 5, 3, 9};
		sort(A);
		show(A); // display the sorted result A
	}
	
	public static void sort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			// i = 0
			int a = A[i]; //4
			int b = i - 1; //0
			while (b > -1  && a < A[b]) { // 4 < 7 && 0 >= 0 true
				A[b + 1] = A[b]; //A[1] = 7
				b = b - 1; // 0 - 1				
			}
			A[b + 1] = a; // A[1] = 4
		}
	}
	
	public static void show(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}
	}
}

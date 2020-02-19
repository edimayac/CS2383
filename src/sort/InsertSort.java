package sort;

public class InsertSort {

	public static void main(String[] args) {
		int [] A = {7, 4, 8 ,2, 5, 3, 9};
		sort(A);
		show(A);
	}
	
	public static void sort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int a = A[i];
			int b = i - 1;
			while (b > -1  && a < A[b]) {
				A[b + 1] = A[b];
				b = b - 1;			
			}
			A[b + 1] = a;
		}
	}
	
	public static void show(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}
	}
}

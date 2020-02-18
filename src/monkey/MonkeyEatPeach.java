package monkey;

public class MonkeyEatPeach {

	public static void main(String[] args) {
		System.out.print("Monkey picked " + eat(1, 7) + " peaches on that Monday");

	}
	
	private static int eat(int n, int d) {
		if(d == 1) {
			return n;
		} else {
			return eat((n + 1)*2, d - 1);
		}
	}

}

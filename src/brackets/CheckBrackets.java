package brackets;

public class CheckBrackets {

	private static int t;
	private static int[] s;
	
	private static void stack_init() {
		t = -1;
	}

	private static boolean empty() {
		return t == -1;
	}
	
	private static int top() {
		if (empty()) {
			throw EmptyStackException;
		} else {
			return s[t];
		}
	}
	
	private static void push(int val) {
		if (val > 0) {
			s[++t] = val;
		} else if (val == 0) {
			pop();
		} else {
			System.out.println(top());
		}
	}
	
	private static void pop() {
		if (empty()) {
			throw EmptyStackException;
		} else {
			t--;
		}
	}

	public static void main(String[] args) {

	}

}

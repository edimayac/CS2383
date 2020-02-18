package stack;

public class Stack {

	private int t;
	private int[] s;
	
	public Stack() {
		this.t = -1;
		this.s = new int[50];
	}
	private void stack_init() {
		t = -1;
	}

	private boolean empty() {
		return t == -1;
	}
	
	private int top() {
		if (empty()) {
			throw EmptyStackException;
		} else {
			return s[t];
		}
	}
	
	private void push(int val) {
		if (val > 0) {
			s[++t] = val;
		} else if (val == 0) {
			pop();
		} else {
			System.out.println(top());
		}
	}
	
	private void pop() {
		if (empty()) {
			throw EmptyStackException;
		} else {
			t--;
		}
	}
	
	public static void main(String[] args) {
		
	}
}

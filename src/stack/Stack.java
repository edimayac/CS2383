package stack;

public class Stack {

	private int t;
	private int[] s;
	
	public Stack() {
		this.t = -1;
		this.s = new int[50];
	}
	
	public void stack_init() {
		t = -1;
	}

	public boolean empty() {
		return t == -1;
	}
	
	public int top() throws Exception {
		if (empty()) {
			throw new Exception("Empty Stack");
		} else {
			return s[t];
		}
	}
	
	public void push(int val) throws Exception {
		if (val > 0) {
			s[++t] = val;
		} else if (val == 0) {
			pop();
		} else {
			System.out.println(top());
		}
	}
	
	public void pop() throws Exception{
		if (empty()) {
			throw new Exception("Empty Stack");
		} else {
			t--;
		}
	}
}

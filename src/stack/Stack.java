package stack;

public class Stack {

	private Node top;
	
	public Stack() {
		this.top = null;
	}
	
	public void stack_init() {
		top = null;
	}

	public boolean empty() {
		return top == null;
	}
	
	public Node top() {
		return top;
	}
	
	public void push(int val) {
		Node temp = new Node(val);
		temp.data = val;
		temp.next = top;
		top = temp;
	}
	
	public void pop() {
		if (empty()) {
			System.out.println("Stack is Empty");
		} else {
			top = top.next;
		}
	}
}

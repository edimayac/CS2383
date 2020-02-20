package assn1;

public class CheckBrackets {

	public static void main(String[] args) {
		String s = "()()()((()))))()";
		Queue q1 = new Queue();
		Queue q2 = new Queue();
		/*
		 * Check Algorithm using Stack class from Question 2
		 */
		try {
			System.out.println(s + " is " + check(s));
			for (int i = 0; i < s.length(); i++) {
				q2.enqueue(s.charAt(i));
			}
			
		} catch (Exception e) {
			System.out.println(s + " is " + false);
		}
		
	
		/*
		 * Append Algorithm using Queue class from Question 3
		 */
		try {
			append(q1, q2);
		} catch (Exception e) {
			System.out.println("Cannot Append");
			e.printStackTrace();
		}
		
	}
	
	private static void append(Queue q1, Queue q2) throws Exception {
		if (q2.empty()) {
			return;
		} else {
			int x = q2.front();
			q1.enqueue(x);
			q2.dequeue();
			append(q1, q2);
		}
	}
	
	private static boolean check(String A) throws Exception {
		if (A.equals("")) {
			return true;
		} else {
			Stack S = new Stack();
			S.stack_init();
			for (int i = 0; i < A.length(); i++) {
				char c = A.charAt(i);
				if (c == '(') {
					S.push('(');
				} else {
					S.pop();
				}
			}
			return S.empty();
		}
	}
}

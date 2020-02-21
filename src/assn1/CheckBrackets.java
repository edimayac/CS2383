package assn1;

public class CheckBrackets {

	public static void main(String[] args) {
		String s = "()()()(())()";

		/*
		 * Check Algorithm using Stack class from Question 2
		 */
		try {
			System.out.println(s + " is " + check(s));
		} catch (Exception e) {
			System.out.println(s + " is " + false);
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

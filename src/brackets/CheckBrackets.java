package brackets;

public class CheckBrackets {

	private static int t = -1;
	private static char[] s = new char[10];
	
	public static void main(String[] args) {
		String s = "((((((()(())()))";
		try {
			for (int i = 0; i < s.length(); i++) {
				char bracket = s.charAt(i);
				if (bracket == '(') {
					push(bracket);
				} else {
					pop();
				}
			}
			if (empty()) {
				System.out.println("Valid Bracket");
			} else {
				System.out.println("Invalid Bracket");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static boolean empty() {
		return t == -1;
	}
	
	private static void push(char val) {
		t = t + 1;
		s[t] = val;
	}
	
	private static void pop() throws Exception {
		if (empty()) {
			throw new Exception("Invalid Brackets");
		} else {
			t--;
		}
	}
}

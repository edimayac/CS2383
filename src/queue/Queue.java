package queue;

public class Queue {

	private static int r;
	private static int f;
	private static int[] q;
	
	public static void main(String[] args) {
		
	}
	
	private static void queue_init() {
		f = -1;
		r = -1;
	}

	private static boolean empty() {
		return r == -1;
	}
	
	private static int front() {
		if (empty()) {
			throw EmptyStackException;
		} else {
			return q[f];
		}
	}
	
	private static void enqueue(int val) {
		if (val > 0) {
			if (empty()) {
				r = 0;
				f = 0;
			} else {
				r++;
				if (r==q.length) {
					r = 0;
				}
				if (r==f) {
					throw FullQException;
				}
			}
			q[r] = val;
		} else if (val == 0) {
			dequeue();
		} else {
			System.out.println(front());
		}
	}
	
	private static void dequeue() {
		if (empty()) {
			throw EmptyStackException;
		} else {
			if (r == f) {
				r = -1;
				f = -1;
			} else {
				f = f + 1;
				if (f == q.length) {
					f = 0;
				}
			}
		}
	}

}

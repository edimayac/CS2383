package assn1;

public class Queue {

	private int r;
	private int f;
	private int[] q;
	
	public Queue() {
		this.q = new int[50];
	}
	
	public void queue_init() {
		f = -1;
		r = -1;
	}

	public boolean empty() {
		return r == -1;
	}
	
	public int front() throws Exception{
		if (empty()) {
			throw new Exception("Error - Queue is Empty");
		} else {
			return q[f];
		}
	}
	
	public void enqueue(int val) throws Exception{
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
					throw new Exception("Error - Queue is Full");
				}
			}
			q[r] = val;
		} else if (val == 0) {
			dequeue();
		} else {
			System.out.println(front());
		}
	}
	
	public void dequeue() throws Exception{
		if (empty()) {
			throw new Exception("Error - Queue is Empty");
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

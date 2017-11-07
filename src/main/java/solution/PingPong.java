package solution;

public class PingPong {
	public static synchronized void main(String[] a) {
		Thread t = new Thread() {
			public void run() {
				pong();
			}
		};
		
		// problem: run() != start()
		// solution: use start() for parallelism
		t.start();
		System.out.print("Ping");
	}

	static synchronized void pong() {
		System.out.print("Pong");
	}
	
	// what does it print?
	// AFTER  a) PingPong
	// BEFORE b) PongPing
	// c) none of the above
}

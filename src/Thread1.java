public class Thread1 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread1 ThreadId: " + Thread.currentThread().getId());
		// do our thing
		PrintNumbers.printNumbers();
		
	}

	static public void main(String[] args) {
		System.out.println("Main ThreadId: " + Thread.currentThread().getId());
		for(int i=0; i<3; i++) {
			new Thread1().start(); // don't call run! 			// (if you want a separate thread)
		}
		 PrintNumbers.printNumbers();
	}

}
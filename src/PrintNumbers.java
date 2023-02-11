public class PrintNumbers { 
	static public void printNumbers() {
		for(int i=0; i<1000; i++) {
			System.out.println(
				Thread.currentThread().getId() + ": " + i);
		}
	}
}

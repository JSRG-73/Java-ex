package threadspractice;

public class MainClass {

	public static void main(String[] args) {

		Process1 thread1 = new Process1();		
		Thread thread2 = new Thread(new Process2());
		
		thread1.start();
		thread2.start();
		
	}

}

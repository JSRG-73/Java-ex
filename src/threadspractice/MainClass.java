package threadspractice;

public class MainClass {

	public static void main(String[] args) {

		Process1 thread1 = new Process1();
		Process1 thread2 = new Process1();
		Process1 thread3 = new Process1();
		Process1 thread4 = new Process1();

		thread1.stringsetter("t1");
		thread2.stringsetter("t2");
		thread3.stringsetter("t3");
		thread4.stringsetter("t4");

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		thread1.timesetter(1000);
		thread2.timesetter(1000);
		thread3.timesetter(1000);
		thread4.timesetter(1000);

		try {

			thread1.sleep(10);

		} catch (Exception e) {
			System.out.println("thread1 error: " + e);
		}

		try {

			thread2.sleep(20);

		} catch (Exception e) {
			System.out.println("thread2 error: " + e);
		}

		try {

			thread3.sleep(30);

		} catch (Exception e) {
			System.out.println("thread3 error: " + e);
		}

		try {

			thread4.sleep(40);

		} catch (Exception e) {
			System.out.println("thread4 error: " + e);
		}

	}
}

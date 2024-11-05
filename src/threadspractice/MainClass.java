package threadspractice;

public class MainClass {

	public static void main(String[] args) {
		try {
			Process1 thread1 = new Process1();		
			Process1 thread2 = new Process1();
			//Thread thread2 = new Thread(new Process2());
			
			thread1.stringsetter("this is the first thread");
			thread2.stringsetter(thread2.getName());
			thread1.start();
			thread1.sleep(1000);
			thread2.start();
		}catch (Exception e) {
			System.out.println(e);
		}

		
		
	}
}

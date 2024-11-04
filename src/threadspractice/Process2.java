package threadspractice;

public class Process2 implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("process 2");
		}
	}

}

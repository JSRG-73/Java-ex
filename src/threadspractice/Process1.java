package threadspractice;

public class Process1 extends Thread{
	
	private String s;
	private int time;

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(s);
			try {
				Process1.sleep(time);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public void stringsetter(String string) {
		this.s = string;
	}
	
	public void timesetter(int time) {
		this.time = time;
	}
}
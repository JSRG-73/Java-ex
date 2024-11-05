package threadspractice;

public class Process1  extends Thread{
	
	private String s;

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(s);
		}
	}
	
	public void stringsetter(String string) {
		this.s = string;
	}
}

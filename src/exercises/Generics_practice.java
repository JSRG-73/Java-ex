package exercises;

public class Generics_practice <T>{
	
	private T content;
	
	public void setsomething(T content) {
		this.content = content;
	}
	
	public T getSomething() {
		return this.content;
	}

}

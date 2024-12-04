package exercises;

public class AnonymousInnerClass_practice {
	
	
	public void method1() {
		System.out.println("Original method");
	}
	

	public static void main(String[] args) {
		
		AnonymousInnerClass_practice class1 = new AnonymousInnerClass_practice();
		class1.method1();
		
		AnonymousInnerClass_practice class2 = new AnonymousInnerClass_practice(){
			
			@Override
			public void method1() {
				System.out.println("Overrided method");
			}
		};
		class2.method1();
		
		AnonymousInnerClass_practice class3 = new AnonymousInnerClass_practice();
		class3.method1();
	}

}

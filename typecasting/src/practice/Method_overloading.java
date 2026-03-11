package practice;

public class Method_overloading {
	public void sum(int a,int b) {
		System.out.println(a+b);
		
	}
	public void sum(int a,int b,int c) {
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) {
		Method_overloading method_overloading=new Method_overloading();
		method_overloading.sum(45, 45);
		method_overloading.sum(45, 45, 45);
	}

}

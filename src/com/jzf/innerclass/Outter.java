package com.jzf.innerclass;


public class Outter{
	private int i;
	
	static class Inner{
		
		public Inner(){
			
		}
		public void innerMethod(){
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		new Outter.Inner();
	}
}



/*public class Outter {
private static final String TEST = "outter";
public int i = 1;

public Inner getInner() {
	return new Inner();
}

public void outterMethod() {
	getInner().innerMethod();
}

 class Inner {
	private int i = 2;

	public void innerMethod() {
		System.out.println(i);
		System.out.println(Outter.this.i);
	}
}

public static void main(String[] args) {
	// new Outter().outterMethod();
	Outter.Inner inner = new Outter().new Inner();
	Outter.Inner inner2 = new Outter().getInner();
}
}
*/
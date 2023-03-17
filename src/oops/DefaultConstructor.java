package oops;

public class DefaultConstructor {
	
	int i=20;
	String s="kumar";
	
	DefaultConstructor(){
		
		System.out.println("Intialising Global Variables :"+ s);
	}

	public static void main(String[] args) {
	
		DefaultConstructor e = new DefaultConstructor();
	    System.out.println(e.i);
	    System.out.println(e.s);
	    

	}

}

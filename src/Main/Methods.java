package Main;

public class Methods {
	
	static void myMethod() {
		System.out.println("My Method is invoked");
	}
	

	static void strMethod(String fname,int fage)
	{
	    System.out.println("Hi"+ " "+fname+" is "+fage);
		
	}
	
	static void ageChecker(int fage) {
		if(fage >= 18) {
			System.out.println("Right to vote");
		}
		else {
			System.out.println("No Right to vote ");
		}
	}
	
	
	static int sumMethod(int num) {
		return num + 5;
	}
	
	static float floatMethod(float x , float y ) {
		return (int)( x + y );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod();
		strMethod("Vishnu",25);
		ageChecker(12);
		
		System.out.println(sumMethod(3));
		
		System.out.println(floatMethod(3.9f,8.09f));

	}

}

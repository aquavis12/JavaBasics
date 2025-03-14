package Main;

public class ObjectOops {
	int x=10;
	String fname ="Vishnu";
	String lname = "R";

	static void myMethod() {
		System.out.println("Hi Method"); // doesnt need to create the objects
	}
	
	public void myMethodp() {
		System.out.println("Public"); // need to create the objects
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectOops newObject = new ObjectOops();//Object creation
		ObjectOops newObject2 = new ObjectOops();
		
		newObject2.x=22;
		
		System.out.println(newObject.x + newObject2.x)	;
		System.out.println(newObject.fname+" "+newObject2.lname);
		myMethod();
		newObject.myMethodp();
		
	}

}

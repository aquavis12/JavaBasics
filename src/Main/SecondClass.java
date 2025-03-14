package Main;

public class SecondClass {
	int x;
	int y;
	String fname;
	
	public SecondClass(){
		x=5;
		y=6;
		fname="Vishnu";
	}
	
	public SecondClass(int y) {
		x=y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecondClass newObject = new SecondClass();
		SecondClass newObject2 = new SecondClass(10);
		System.out.println(newObject.x*newObject.y+newObject.fname.length());
		System.out.println(newObject2.x);

	}

}

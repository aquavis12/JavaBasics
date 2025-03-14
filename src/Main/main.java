/**
 * 
 */
package Main;

/**
 * 
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Akshaya");
		//This is how we can print out the number
		/**
		 * Multiline comments 
		 */
		System.out.println (3 + 4);
		
       // String Variable
		String strName = "Vishnu";
		System.out.println("hi"+" "+strName.length());
		
		//Integer Variable
		int strValue=2,strValue2=4;
		strValue=3;
		System.out.println(strValue);
		
		
		//Final Keyword / Constant
		final int numValue=15;
		System.out.println(numValue);
		
		
		//Float Va
		float numFloat = 12.9f;
		boolean value = true;
		char numChar = 'b';
		
		char myVar1 = 65, myVar2 = 66, myVar3 = 67;
		System.out.println(myVar1);
		System.out.println(myVar2);
		System.out.println(myVar3);
		
		
	          //Automatic casting
			    int myInt = 9;
			    double myDouble = myInt; // Automatic casting: int to double

			    System.out.println(myInt);      // Outputs 9
			    System.out.println(myDouble);   // Outputs 9.0


			    
                //manual casting
			    double myNewDouble = 9.78d;
			    int myNewInt = (int) myNewDouble; // Manual casting: double to int

			    System.out.println(myNewDouble);   // Outputs 9.78
			    System.out.println(myNewInt);   
			    
			    //Ternary operator
			    int time = 20;
			    String result;
			    result = (time < 18) ? "Good day." : "Good evening.";
			    System.out.println(result);
			    
			    
			    
			    //Switch Case
			    int day = 4;
			    switch (day) {
			      case 6:
			        System.out.println("Today is Saturday");
			        break;
			      case 7:
			        System.out.println("Today is Sunday");
			        break;
			      default:
			        System.out.println("Looking forward to the Weekend");
	}
			    
			    //While loop 
			    int i = 0;
			    while (i < 5) {
			      System.out.println(i);
			      i++;
			    }
	}

}

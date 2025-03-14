package Main;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for loop
		for (int i = 0; i < 5; i++) {
			  System.out.println(i);
			}
		
		
		// Outer loop
		for (int i = 1; i <= 2; i++) {
		  System.out.println("Outer: " + i); // Executes 2 times
		  
		  // Inner loop
		  for (int j = 1; j <= 3; j++) {
		    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
		  }
		} 
		
		
		//Arrays and for each loop
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		
		//Arrays
		
		int [] arrNum = {1,2,3,4,5};
		for (int arr: arrNum) {
			System.out.println(arr);
		}

		//Multi arrays
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		for (int[] row : myNumbers) {
		  for (int i : row) {
		    System.out.println(i);
		  }
		}
	}

}

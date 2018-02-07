package question3;

import java.util.Scanner;

public class stringReverse {

	  public static void main(String args[])
	   {
	      String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reverse it");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	      
	      System.out.println("the reverse string of "+original+" is "+reverse);
	 
	   }
	  
}

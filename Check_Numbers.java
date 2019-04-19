package Numbers;

import java.util.Scanner;
public class Check_Numbers {

	public static void main(String[] args) {
		int length;
				
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of an array : " );
	      length = input.nextInt();
	      int[] array = new int [length];
	      System.out.print("Enter " + length + " numbers : ");
	      for (int i = 0; i < array.length; i++ ) {
	    	  array[i] = input.nextInt();
	      }
	      System.out.println("\nSmallest number : " + Numbers.smallestNumber(length, array));
	      System.out.println("Biggest number : " + Numbers.biggestNumber(length, array));
	      System.out.println("Sum of the numbers : " + Numbers.sum(length, array));
	      System.out.println("Average : " + Numbers.average(length, array));
	      System.out.print("Unique numbers of the array : "); 
	      Numbers.uniqueNumbers(length, array);     
	      Numbers.sorted(length, array);
          input.close();
	}

}

package Numbers;

import java.util.Arrays;
public class Numbers {
	 int number;
     int length;
     int [] array = new int[length]; 
     
     Numbers(int number, int length, int [] array) {
    	 this.length = length;
    	 this.number = number;
    	 
     }
     public static int smallestNumber(int length, int[]array) {
    	 int min = array[0];
    	 for( int i = 0 ; i < array.length; i++) {
    		 if( array[i] < min )
    			 min = array[i];
    	 }
    	 return min;
     }
     public static int biggestNumber(int lenght, int[]array) {
    	 int max = array[0];
    	 for( int i = 0 ; i < array.length; i++) {
    		 if( array[i] > max )
    			 max = array[i];
    	 }
    	 return max;
     }
     public static int sum(int length, int[] array) {
    	 int sum = 0;
    	 for( int i = 0 ; i < array.length; i++) {
          sum += array[i];
    	 }
    	 return sum;
     }
     public static double average(int length, int []array) {
    	 double sum = 0;
    	 for( int i = 0 ; i < array.length; i++) {
          sum += array[i];
         }
    	return sum / length;
     }
     public static void uniqueNumbers(int length, int[] array) {
    	 boolean[] flag = new boolean[array.length];
    	 int i,j,count, x = 0;
    	 
         for( i = 0; i < array.length; i++){
             if(!flag[i]){
                 count  = 1;
                 for( j = i + 1; j < array.length; j++){
                     if(array[j] == array[i])
                     {
                         count++;
                         flag[j] = true;
                     }
                 }
                 if(count == 1){
                     System.out.print(array[i] + ", ");
                     x++;
                 }
             }
         }
         if( x == 0 ){
             System.out.println("None");
         }
     }
    	   
     
     public static void sorted(int length, int[] array) {
    	 Arrays.sort(array);
    	 System.out.printf("\nSorted array : %s", 
                 Arrays.toString(array)); ;
    		 
    	 
     }
}


/* 
   Aakash Pany
   January 28, 2021
   Lab 6. Loops and Arrays Algorithms showing various tasks using loops, array, and methods.
   These include:
      * printing the array
      * summing the array
      * finding the average
      * finding the max
      * finding the index of the min value
      * creating a new array based on the input array
      * multiplying every element by some factor
*/

public class LoopArrayAlgorithms {
   public static void main(String[] args) {
      
      // declare and initialize an array of int.
      int[] nums = { 3, 9, 7, 4, 5, -1, 13, 2 };
      
      // print array.
      printArray(nums);
      
      // print array sum.
      int sum = getSum(nums);
      System.out.println("sum: " + sum);
      
      // print array average.
      double average = getAverage(nums);
      System.out.println("average: " + average);
      
      // print max element in array.
      int max = getMax(nums);
      System.out.println("max: " + max);
      
      //print index of min element in array.
      int indexOfMin = getIndexOfMin(nums);
      System.out.println("index of min: " + indexOfMin);
      
      // print new array that adds 2 elements in orginal array to get array with half the elements.
      int[] combined = combineElements(nums);
      System.out.print("combined array: " );
      printArray(combined);
      
      // print array with each element * 5.
      multiplyArray(nums, 5);
      System.out.print("after multiply by 5: ");
      printArray(nums);
   }
   
   // print out all elements of the array.
   public static void printArray(int[] input) {
      for (int value : input) {
         System.out.print(value + " ");
      }
      
      System.out.println();
   }
   
   // return sum of array.
   public static int getSum(int[] input) {
      int sum = 0;
      for (int value : input) {
         sum += value;
      }
      
      return sum;
   }
   
   // return average of array.
   public static double getAverage(int[] input) {
      double average = 0;    
      average = (double) getSum(input) / input.length;
      
      return average; 
   }  
   
   // return max value in array.
   public static int getMax(int[] input) {
      int max = 0;
      for (int value : input) { 
         if (value > max) {
            max = value; 
         }
      }
        
      return max;
   }
   
   // return min index in array.
   public static int getIndexOfMin(int[] input) {
      int min = 0;
      for (int i = 0; i < input.length; i++) {
         if (input[i] < input[min]) {
            min = i;
         }
      }
      
      return min;
   }
   
   // return new array with helf the elements. Add 2 elements for new index.
   public static int[] combineElements(int[] input) {
      int[] nums1 = new int [input.length/2];
      for (int i = 0; i < nums1.length; i++) {
         nums1[i] = input[2 * i] + input [2 * i + 1];
      }
      
      return nums1;
   }
   
   // multiply each array element by 5.
   public static void multiplyArray(int[] input, int amt){
      for (int i = 0; i < input.length; i++) {
         input[i] = input[i] * amt;
      }
   }
}

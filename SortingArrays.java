import java.util.Random;
import java.util.Arrays;

public class SortingArrays {
   public static void main (String[] args) {
    
      Random rd = new Random();
   
      Sort s = new Sort();
   
      int array[];   
         array = new int[10];         
      
      for (int k = 0; k < array.length; k++) {
         array[k] = rd.nextInt(100);
      }
      
      System.out.println(Arrays.toString(array));
      
      int[] newArray = s.ascendingOrder(array);
      
      System.out.println(Arrays.toString(newArray));
      
      int[] thirdArray = s.descendingOrder(array);
      
      System.out.println(Arrays.toString(thirdArray));
      
   }
}
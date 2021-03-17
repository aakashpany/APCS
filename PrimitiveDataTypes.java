public class PrimitiveDataTypes {
   public static void main(String[] args) {
      char letter; 
      int integer = 35; 
      letter = (char)integer; // line 5
      System.out.println("original number: [" + integer + "]");
      System.out.println("after conversion: [" + letter + "]");
      System.out.println(); // prints a blank line

      letter = 'Z'; 
      integer = letter; // line 11
      System.out.println("second number: [" + letter + "]");
      System.out.println("after conversion: [" + integer + "]");
   }
}
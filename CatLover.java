/*
   Aakash Pany
   2/9/2021
   
   CatLover class will create Cat objects and call their methods.
*/

public class CatLover {
   public static void main(String[] args) {
      // call the static method in the Cat class
      Cat.describeCat();
      
      // declare a couple of Cat objects
      Cat fiona = new Cat("Fiona", 12.5);
      Cat mozzie = new Cat("Mozzie", 11);
      Cat spot = new Cat();

      // call the static method in the Cat class
      Cat.describeCat();
      System.out.println("count: " + Cat.getCount());
      System.out.println();
      
      // won't compile
      // Cat.meow();
            
      // call the mutator to set name
      spot.setName("Tucker");
      
      // call the accessor to print name
      System.out.println(spot.getName());
      
      // print out object
      System.out.println(spot.toString());
      
      // call methods on my Cat objects
      fiona.meow();
      mozzie.meow();
      spot.meow();

      System.out.println(fiona);
      System.out.println(mozzie);
      System.out.println(spot);
      
      System.out.println();
      
      fiona.eat();
      mozzie.eat();
      
      System.out.println(fiona);
      System.out.println(mozzie);
   }
}
/*
   Aakash Pany
   2/25/2021
   
   Lab 7: Pet and AnimalClinic Classes
   
   AnimalClinic will create 3 pet objects, call their accessors and mutator, 
   and print the objects
*/

public class AnimalClinic {
   public static void main(String[] args) {
      // create 3 Pet objects, using both of the constructors
      Pet tim = new Pet("Tim", 4, 60.0, "dog");
      Pet sal = new Pet("Sal", 2, 12.1, "cat"); 
      Pet not = new Pet();
      // call every accessor and mutator
      tim.setName("Time");     
      sal.setAge(50);
      not.setWeight(29.0);
      tim.setType("dog");
      
      System.out.println(sal.getName());
      System.out.println(not.getAge());
      System.out.println(tim.getWeight());
      System.out.println(sal.getType());
      
      System.out.println(tim.makeSound());
      // print out each Pet object
      System.out.println(tim);
      System.out.println(sal);
      System.out.println(not);
   }
}
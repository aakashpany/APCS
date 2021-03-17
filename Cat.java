/*
   Aakash Pany
   2/9/2021
   
   Cat class, showing class features such as:
     * fields (attributes, instance variables): information about the object
     * constructor: special method that creates objects
     * methods: behaviors or actions that an object can perform
*/

public class Cat {
   // declare a static method varible
   private static int count = 0;

   // fields are typically declared with private
   private String name;
   private double weight;
   
   // add a static method that will describe the class and tell how many Cat onjects
   public static void describeCat() {
      System.out.println("This is the cat class, there are  " + count + " Cat objects.");
   }
   
   // add a static accessor method
   public static int getCount() {
      return count;
   }
   
   // constructors: special methods that create objects
   // must have same name as class and no return type
   public Cat(String n, double w) {
      count++;
      name = n;
      weight = w;
   }
   
   // like other methods, constructors can be overloaded
   public Cat() {
      count++;
      name = "(blank)";
      weight = -1;
   }
   
   // add accessor method for name
   public String getName() {
      return name;
   }
   
   // add mutator to set the name
   public void setName(String newName) {
      name = newName;
   }
   
   // methods define the behavior of our objects
   public void meow() {
      System.out.println(name + " says meow!");
   }
   
   public void eat() {
      // call the other eat overload, and pass the value 0.1
      eat(0.1);
   }

   public void eat(double weightGain) {
      weight += weightGain;
      System.out.println(name + " says nom, nom, nom!");
   } 
   // convert print method to toString method
   public String toString() {
      return "My name is " + name + ". I weigh " + weight + " pounds.";
   }
}
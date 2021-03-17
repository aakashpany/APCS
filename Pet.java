/**
    Aakash Pany
    3/5/2020
    Pet Class - uning private variables, constructors, accessors, mutators, 
    and toString methods.

*/
public class Pet {
   // declare private fields for the name, age, weight, and type of animal
   private String name;
   private int age;
   private double weight;
   private String type;
  
   

   // write 2 constructors 
   // Pet constructor without parameters
   public Pet() {
      this.name = "(blank)";
      this.age = -1;
      this.weight = -1;
      this.type = "null";
   }
   
   // Pet constructor with parameters
   public Pet(String name, int age, double weight, String type) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.type = type;
   
   }
   
   // accessor (get) methods
   // getName method
   public String getName(){
      return name;
   }
   
   //getAge method
   public int getAge() {
      return age;
   }
   
   // getWeight method
   public double getWeight() {
      return weight;
   }
   
   // getType method
   public String getType() {
      return type;
   }
   
   // Mutator (set) methods
   // setName method
   public  void setName(String newName) {
      this.name = newName;
   }
   
   // setAge method
   public void setAge(int newAge) {
      this.age = newAge;
   }

   // setWeight method
   public void setWeight (double newWeight) {
      this.weight = newWeight;
   }
   
   //setType method
   public void setType (String newType) {
      this.type = newType;
   }
   
   // Extra Credit Method
   
   public String makeSound() {
      if (this.type == "dog") {
         return "Woof Woof!";
      }
      
      else if (this.type == "cat") {
         return "Meow!";
      }
      
      else if (this.type == "bird") {
         return "Chirp Chirp!";
      }
      
      else if (this.type == "sheep") {
         return "Baaaaaaaah!";
      }
      
      else {
         return "I can't make a sound :(";
      }
   }
   
   // the toString() method.
   public String toString() {
      return name + ", " + age + ", " + weight + ", " + type;
   }

   // we will create Pet instances in the main() method of the AnimalClinic class
}
/* Aakash Pany
 October 30, 2020
 
 This program uses string methods and wrapper classes to output charecteristics about a person
*/

import java.util.Scanner;

public class NameGames {

// creates variabes and prints final output
  
   public static void main(String[] args) {  
         
   // scanner that stores full name and grad. year
    
      System.out.println("Enter full name: ");
      Scanner scan = new Scanner(System.in);
      String fullName = scan.nextLine();
      System.out.println("Enter graduation year: ");
      int graduationYear = scan.nextInt();
      
   // combines first 3 initials      
      
      System.out.println("Greetings, " + getFirstName(fullName) + ", your initials are " + getInitials(fullName) + ".");
      System.out.println("Your last name is " + getLastNameLength(fullName) + " letters long.");
      System.out.println("You will graduate in " + getNumberOfYearsUntilGraduation(graduationYear) + " years.");
      
   // combines first 4 letters of last name, first 3 letters of first name, last 2 digits of grad. year      
      
      System.out.println("Your student ID is \"" + getStudentIdNumberFirstPart(fullName) + getStudentIdNumberSecondPart(fullName) + getGradYear(graduationYear) + "\".");
   }
  
// returns first name
  
   public static String getFirstName(String fullName) {  
      String firstName= fullName.substring(0, fullName.indexOf(" "));
      return firstName;
   }

// return middle name

   public static String getMiddleName(String fullName) {
      String lastPart = fullName.substring(fullName.indexOf(" ") + 1, fullName.length());
      String middleName = lastPart.substring(0, lastPart.indexOf(" "));
      return middleName;
   }
   
// returns Initials   
   
   public static String getInitials(String fullName) {
      String firstInitial = fullName.substring(0,1);
      String middleInitial = fullName.substring(fullName.indexOf(" ") + 1,fullName.indexOf(" ") + 2);
      String lastPart = getLastPart(fullName);
      String lastInitial = lastPart.substring(lastPart.indexOf(" ") + 1,lastPart.indexOf(" ") + 2);
      String initials = firstInitial + middleInitial + lastInitial;
      return initials;
      }
  
 
// returns middle and last name
   
   public static String getLastPart(String fullName) {
      String lastPart= fullName.substring(fullName.indexOf(" ") + 1, fullName.length());
      return lastPart;
   }
      
   
//  returns last name length
   
   public static int getLastNameLength(String fullName) {
      String lastPart = getLastPart(fullName);      
      String lastName = lastPart.substring(lastPart.indexOf(" ") + 1,lastPart.length());
      return lastName.length();
   } 
   
// returns years until graduation
   
   public static int getNumberOfYearsUntilGraduation(int graduationYear) {
      int numberOfYearsUntilGraduation = graduationYear-2020;
      return numberOfYearsUntilGraduation ;
   }
   
// returns first 4 letters of last name
   
   public static String getStudentIdNumberFirstPart(String fullName) {
      String lastPart = fullName.substring(fullName.indexOf(" ") + 1, fullName.length());
      String lastName = lastPart.substring(lastPart.indexOf(" ") + 1,lastPart.length());
      String firstPart = lastName.substring(0,4);
      return firstPart.toLowerCase();
   }
       
// returns first 3 letters of first name
   
   public static String getStudentIdNumberSecondPart(String fullName) {
      String lastPart = getLastPart(fullName);
      String secondPart = lastPart.substring(0,3);
      String firstName = getFirstName(fullName).substring(0,3);
      return firstName.toLowerCase();
   }
   
// returns last 2 digits of grad. year
   
   public static int getGradYear(int graduationYear) {
      int num1;
      if (graduationYear < 2000) {
        num1 = graduationYear%1900; 
      } else {
         num1 = graduationYear%2000;
      }
      
      return num1;
   }
}
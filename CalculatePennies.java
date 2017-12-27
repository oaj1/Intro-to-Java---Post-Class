public class CalculatePennies {
// Returns number of pennies if pennies are doubled numDays times
   public static long doublePennies(long numPennies, int numDays) {
      long totalPennies = 0;

      /* Your solution goes here  */
      int endDays = 1; // last day
      
      //if the user enters only one day for savings, its just the number of pennies times 2
      if (numDays == endDays) {
         totalPennies = numPennies *2;
         }
      

      else {
         totalPennies = doublePennies((numPennies * 2), numDays - 1);
      }
      return totalPennies;
   }

// Program computes pennies if you have 1 penny today,
// 2 pennies after one day, 4 after two days, and so on
   public static void main (String [] args) {
      long startingPennies = 0;
      int userDays = 0;

      startingPennies = 1;
      userDays = 10;
      System.out.println("Number of pennies after " + userDays + " days: "
           + doublePennies(startingPennies, userDays));
      return;
   }
}
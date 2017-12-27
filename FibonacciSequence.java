
public class FibonacciSequence {
   public static int computeFibonacci(int N) {
      
      if (N <= 1) {
         return N;
         }
      else {
         return (computeFibonacci(N-1) + computeFibonacci(N-2));
         }
         

   
   }

   public static void main(String[] args) {
      int N = 4; // F_N, starts at 0
   
      System.out.println("F_" + N + " is " + computeFibonacci(N));

      return;
   }
}

import java.util.Scanner;
/*This program will take in a numerical value from the user and count of to that number using prime numbers.
*WillAY998 2016
*/
class PrimeNumbers {
  public static void main(String[] args) {
    //Below are defined variables required to determine if a number is a prime number.
    
      int UserNumber = 0;
      int Counter = 1;
      int Output = 0;
      int Divisor = 1;
      Scanner scan = new Scanner(System.in);
      System.out.println("Input a number.");
      UserNumber = scan.nextInt();
      TestNumber = UserNumber;

      /*By increasing the divisor by 1 in a loop, we are able to test divisiblity.
      *If the divisiblity test fails in the boolean statement, we move on to the next value.
      *Note: If the boolean expression tied to 'if' statement fails, then we know the number cannot be prime.
      *Ergo, we need to stop the loop, I found that the way to do this is with a 'break statement'
      */

      while (Counter < UserNumber) {
        Counter ++;
        int Prime = 1;
        Divisor = 2;
        while (Divisor < Counter) {
            if ((Counter % Divisor) != 0) {
                Divisor ++;
            } else {
              Prime = 0;
              break;

            }


        }
        if (Prime == 1) {
          System.out.println(Counter);
        }






      }

  }
}

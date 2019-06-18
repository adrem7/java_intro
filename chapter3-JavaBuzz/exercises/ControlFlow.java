// what imports will you need?
import java.util.Scanner;

// import javax.lang.model.util.ElementScanner6;
// can you remember how to set up your main function?
public class ControlFlow {
  public static void main(String[] args) {
// find a way to read in user input
    int inputNumber = 0;
    while (inputNumber != 17) {
      System.out.println("Please provide a number: ");
      Scanner in = new Scanner(System.in);
      inputNumber = in.nextInt();
// write a method that will check if a number is odd or even
// (assume user only ever enters integers)
      boolean isEven = ((inputNumber % 2) == 0);

// print the answer to the console
      if (isEven) {
        System.out.println(inputNumber + " is even");
      }
      else {
        System.out.println(inputNumber + " is odd");
      }
    }
  }
}
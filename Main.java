import java.util.Scanner;
/**
 * This program prints to the screen the alternating text “black” and “white” the number of times that the user inputs. 
 * @author Dafna Khripun 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Create scanner for user input
    Scanner input = new Scanner(System.in);
    
    // ask the user to enter the length of the line
    System.out.println("Please enter the length of the line:");

    // create a variable for user input
    int number = input.nextInt();

    // create a for loop to create a line of "Black" and "White" when the count value is less the the nuber the user inputs
    for(int i = 1; i < number; i++){

      // Determine whether the count number is divisible by two by calculating the remainder
      int evenNum = i % 2;

      // If the remainder is 0, the number is even
      if(evenNum == 0){

        // print "white," to the screen
        System.out.print("White, ");

        // If the remainder is not 0, the number is odd
      }else{

        // print "Black," to the screen
        System.out.print("Black, ");
      }
      
    }
    // create a for loop to type the last word (which means count variable = user's input) depends on whether the user's input is even or odd without a comma at the end
    for(int i = number; i == number; i++){

      // Determine whether the user's inputis divisible by two by calculating the remainder
      int evenNum = i % 2;

      // If the remainder is 0, the number is even
      if(evenNum == 0){

        // print "white" (without a comma) to the screen
        System.out.print("White");

        // If the remainder is not 0, the number is odd
      }else{

        // print "Black" (without a comma) to the screen
        System.out.print("Black");
      }
    }  
  }
}

import java.util.Random;
import java.util.Scanner;

class Main {
  // declare random number
  public static void main(String[] args) {
    Random rand = new Random();
    int num = rand.nextInt(100);
    //welcome statement/prompt
    System.out.println("Welcome! Guess a number 1-100. ");
    int testNum = 0;
    int tally = 0;
    //loop
    while (testNum != num) {
      System.out.println("Enter input.");
      Scanner s1 = new Scanner(System.in);
      String test = s1.nextLine();
      testNum = Integer.parseInt(test);
      tally += 1;
      if (testNum < num) {
        System.out.println("Sorry, too low!");
          } else if (testNum > num) {
              System.out.println("Not quite, too high!");
            } else {
              System.out.println("You got it! Nice job :)");
            }
          }
        }
      }
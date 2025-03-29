//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};

/* Random allows computer to generate a random amount of choices
   Scanner allows user to write inputs
   String shows the possible choices that computer will make
 */
        while (true) {
            System.out.print("\nEnter Rock, Paper, or Scissors (or type 'exit' to quit): ");
            String userChoice = scanner.nextLine().trim().toLowerCase();

/* System.out.print asks the user to enter "Rock", "Paper", or "Scissors".
   scanner.nextLine() reads the user's input.
   trim() removes the empty spaces in the beginning and the end of the input.
   toLowerCase() converts the input to lowercase.
 */
            if (userChoice.equals("exit")) {
                System.out.println("Thanks for playing! 👋");
                break;
            }

            int computerIndex = random.nextInt(3);
            String computerChoice = choices[computerIndex].toLowerCase();

/* random.nextInt(3) Picks a random number 0, 1, or 2. They represent Rock, Paper, or Scissors.
🔹 choices[computerIndex] selects a choice from the choices array.
 */
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Try again!");
                continue;
            }

            /* If user input something other than rock,paper or scissors, then computer will show the error warning
             */

            System.out.println("Computer chose: " + choices[computerIndex]);
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie! 🤝");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win! 🎉");
            } else {
                System.out.println("You lose! 😢");
            }
        }
        /* Shows the result of Users and Computers choices
         */
        scanner.close();
    }
}
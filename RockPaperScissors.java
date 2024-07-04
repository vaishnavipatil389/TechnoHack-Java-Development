import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.println("Choose an option:");
            System.out.println("1) Rock");
            System.out.println("2) Paper");
            System.out.println("3) Scissors");
            System.out.println("4) Quit");
            int userChoice = scanner.nextInt();

            if (userChoice == 4) {
                keepPlaying = false;
                System.out.println("Thanks for playing!");
                continue;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            int computerChoice = random.nextInt(3);
            System.out.println("You chose: " + choices[userChoice - 1]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            if (userChoice - 1 == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice - 1 == 0 && computerChoice == 2) ||
                       (userChoice - 1 == 1 && computerChoice == 0) ||
                       (userChoice - 1 == 2 && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        scanner.close();
    }
}

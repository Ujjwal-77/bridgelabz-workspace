import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = { "Rock", "Paper", "Scissors" };
        return choices[new Random().nextInt(3)];
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer))
            return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
                (user.equals("Paper") && computer.equals("Rock")) ||
                (user.equals("Scissors") && computer.equals("Paper")))
            return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userWins = 0, computerWins = 0, rounds;
        System.out.print("Enter number of games: ");
        rounds = input.nextInt();
        input.nextLine();
        for (int i = 0; i < rounds; i++) {
            System.out.print("Enter Rock, Paper or Scissors: ");
            String userChoice = input.nextLine();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);
            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                computerWins++;
            System.out.println("User: " + userChoice + ", Computer: " + computerChoice);
            System.out.println("Round Winner: " + winner);
        }
        System.out.println("\nTotal Games: " + rounds);
        System.out.println("User Wins: " + userWins + ", Computer Wins: " + computerWins);
        System.out.println("User Win Percentage: " + (userWins * 100.0 / rounds) + "%");
        System.out.println("Computer Win Percentage: " + (computerWins * 100.0 / rounds) + "%");
    }
}

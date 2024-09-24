import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int computersTurn = randomNumber.nextInt(100);

        while (true) {
            System.out.print("Guess a number (1-100): ");
            String  playersTurn = scanner.nextLine();
            int playerNumber ;

            boolean isValidTurn = true;

            for (int i = 0; i < playersTurn.length() ; i++) {
                if (playersTurn.charAt(i) < 48 || 57 < playersTurn.charAt(i)) {
                    isValidTurn = false;
                    break;
                }
            }
            if (isValidTurn){
                playerNumber = Integer.parseInt(playersTurn);
                if (playerNumber == computersTurn){
                    System.out.println("You guessed the number!");
                    break;
                } else if (playerNumber > computersTurn) {
                    System.out.println("Too High!");
                }else {
                    System.out.println("Too Low!");
                }
            }else {
                System.out.println("Invalid Input!");
            }
        }
    }
}

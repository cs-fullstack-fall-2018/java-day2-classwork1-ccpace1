import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        System.out.println("Do you want to play a game?");
        System.out.println("Guess a password: ");
        Scanner scan2 = new Scanner(System.in);
        String pass1 = scan2.nextLine();
        while (!pass1.equals("password1")) {
            System.out.println("That's not correct!");
            pass1 = scan2.nextLine();
        }
        System.out.println("You've finally guessed it.");
    }
    }
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Exercise 8
        System.out.println("Our instructors are Kenn and Kevin.");
        System.out.println("How awesome are they?");
        Scanner scan1 = new Scanner(System.in);
        String user1 = scan1.nextLine();
        while ((!user1.equals("very awesome"))) {
            System.out.println("You know they are better than that.");
            user1 = scan1.nextLine();
        }
    }
}
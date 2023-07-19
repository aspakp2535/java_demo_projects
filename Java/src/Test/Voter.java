package Test;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Voter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("Invalid age: You must be 18 or older to vote");
            }
            System.out.println("Welcome voter");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

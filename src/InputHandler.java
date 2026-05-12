import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public double getNumber(String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Try again.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public int getChoice() {
        System.out.println("\nChoose operation:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.print("Your choice: ");
        return scanner.nextInt();
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputHandler input = new InputHandler();

        try {
            double a = input.getNumber("Enter first number: ");
            double b = input.getNumber("Enter second number: ");
            int choice = input.getChoice();

            Operation op;

            switch (choice) {
                case 1:
                    op = new Addition();
                    break;
                case 2:
                    op = new Subtraction();
                    break;
                case 3:
                    op = new Multiplication();
                    break;
                case 4:
                    op = new Division();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid choice");
            }

            double result = calculator.calculate(op, a, b);
            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operations performed: " + Calculator.getOperationCount());
        }
    }
}
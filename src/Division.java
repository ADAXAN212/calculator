public class Division extends AbstractOperation {

    public Division() {
        super("Division");
    }

    @Override
    public double execute(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}
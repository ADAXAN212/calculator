public class Subtraction extends AbstractOperation {

    public Subtraction() {
        super("Subtraction");
    }

    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
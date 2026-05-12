public class Multiplication extends AbstractOperation {

    public Multiplication() {
        super("Multiplication");
    }

    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}
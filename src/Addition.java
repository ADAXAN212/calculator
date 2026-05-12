public class Addition extends AbstractOperation {

    public Addition() {
        super("Addition");
    }

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
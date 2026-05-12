public class Calculator {
    private static int operationCount = 0;

    public double calculate(Operation op, double a, double b) {
        operationCount++;
        return op.execute(a, b);
    }

    public static int getOperationCount() {
        return operationCount;
    }
}
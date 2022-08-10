public class Program {
    public double divide(double a, double b) {

        if (b == 0) {
            throw new ArithmeticException("Divide by zero is not supported");
        }

        return a / b;
    }

    public String sayMyName(String name, int ages) {

        if (name.isEmpty()) {
            throw new IllegalStateException("Name must not be empty");
        }

        if (ages <= 0) {
            throw new IllegalStateException("Ages must not be negative value");
        }

        return "Name is " + name + " (" + ages + ")";
    }
}
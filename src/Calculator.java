public class Calculator {

    public int plus(int[] mass) {
        int count = 0;
        for (int i : mass) {
            count += i;
        }

        return count;
    }

    public double multiply(double a, double b) {
        return a + b;
    }
}


public class Factorial extends CalculationComponent{
    private int x;

    Factorial(int x) {
        this.x = x;
    }

    public int compute() {
        int result = 1;

        for (int index = x; index >= 1; index--) {
            result = result * index;
        }

        return result;
    }
}
public class Summation extends CalculationComponent{
    private int x;
    private int y;

    Summation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compute() {
        return x + y;
    }
}
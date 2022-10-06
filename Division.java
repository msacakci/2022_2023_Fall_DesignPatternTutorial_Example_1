public class Division extends CalculationComponent{
    private int x;
    private int y;

    Division(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compute() {
        return x / y;
    }
}
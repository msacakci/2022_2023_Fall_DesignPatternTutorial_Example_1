public class Power extends CalculationComponent{
    private int base;
    private int power;

    Power(int base, int power) {
        this.base = base;
        this.power = power;
    }

    public int compute() {
        return (int) Math.pow((double) base, (double) power);
    }
}
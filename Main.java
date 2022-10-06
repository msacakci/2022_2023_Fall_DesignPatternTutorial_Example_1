public class Main {
    public static void main(String[] args) {
        CalculationGroup calculationGroup = new CalculationGroup();
        calculationGroup.addComponent(new Summation(5, 9));
        calculationGroup.addComponent(new Subtraction(7, 3));

        System.out.println(calculationGroup.compute()); // Prints (5 + 9) + (7 - 3) = 18
    }
}
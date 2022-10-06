public class Main {
    public static void main(String[] args) {
        CalculationGroup calculationGroup = new CalculationGroup();
        calculationGroup.addComponent(new Summation(5, 9));
        calculationGroup.addComponent(new Subtraction(7, 3));
        calculationGroup.addComponent(new Multiplication(2, 8));
        calculationGroup.addComponent(new Division(6, 2));

        System.out.println(calculationGroup.compute()); // Prints (5 + 9) + (7 - 3) + (2 * 8) + (6 / 2) = 37
    }
}
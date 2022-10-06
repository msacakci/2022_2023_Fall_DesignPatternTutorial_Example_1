public class Main {
    public static void main(String[] args) {
        Summation sum = new Summation(5, 9);
        System.out.println(sum.compute()); // Prints: 14

        Subtraction sub = new Subtraction(7, 3);
        System.out.println(sub.compute()); // Prints: 4
    }
}
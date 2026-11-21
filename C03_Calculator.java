import java.util.Scanner;

public class C03_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = sc.nextDouble();
        System.out.println("Enter the second number:");
        double b = sc.nextDouble();

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Power: " + Math.pow(a, b));
        sc.close();
    }
}

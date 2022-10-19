package hw_1;//Реализовать простой калькулятор
import java.util.Scanner;

public class hw_1_3 {
    public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Enter the first number");
    int a = iScanner.nextInt();
    System.out.println("Enter the second number");
    int b = iScanner.nextInt();
    System.out.println("Choose an operation. '+', '-', '*' and '/' are available");
    String o = iScanner.next();
    iScanner.close();
    switch (o) {
        case "+":
            System.out.printf("%d + %d = %d", a, b, a+b);
            break;
        case "=":
            System.out.printf("%d - %d = %d", a, b, a-b);
            break;
        case "*":
            System.out.printf("%d * %d = %d", a, b, a*b);
            break;
        case "/":
            double new_b = b;
            double res = a/new_b;
            System.out.printf("%d / %d = %f", a, b, res);
            break;
        default:
            System.out.println("Try again");
            break;
    }
    }
}

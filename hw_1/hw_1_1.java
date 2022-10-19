package hw_1;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class hw_1_1 {
    public static void main(String[] args) {
        int n = 5;
        int triangle = 0;
        for (int i = 1; i <= n; i++) {
            triangle += i;
        }
        System.out.printf("Triangle number of %d is %d\n", n, triangle);
        n = 5;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        System.out.printf("Product of numbers from 1 to %d is %d", n, product);
    }
}
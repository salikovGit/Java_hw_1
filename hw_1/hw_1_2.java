package hw_1;//Вывести все простые числа от 1 до 1000

public class hw_1_2 {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 1; i <= n; i++) {
            boolean to_print = true;
            for (int devider = 2; devider <= Math.floor(Math.sqrt(i)); devider++) {
                if ((i % devider) == 0) {
                    to_print = false;
                    break;
                }
            }
            if (to_print) {
                System.out.println(i);
            }
        }
    }
}
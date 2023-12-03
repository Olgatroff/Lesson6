import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();
        int m = 1;
        for (int i = 1; i <= n; i++) {
            m = m * i;
            System.out.println(m);
            }

    }
}
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();
        String result = n % 2 == 0 ? "Число четное" : "Число нечетное";
        System.out.println(result);
    }
}

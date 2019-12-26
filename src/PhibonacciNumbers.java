import java.io.IOException;
import java.util.*;
public class PhibonacciNumbers {
    public static void main(String[] args) throws IOException {
try {
    System.out.println("Введите свое имя");
    Scanner scanner = new Scanner(System.in);
    String name;
    name = scanner.next();
    System.out.println("Привет," + name + ".");
    try {
        System.out.println("Сейчас мы рассмотрим как работают числа Фибоначчи в действии!");
        Thread.sleep(2000);
    } catch (Exception e) {
        System.err.println("Что-то пошло не так.");
    }
    System.out.println("Количество необходимых чисел для рассчета чисел Фибоначчи.Первые два числа начинаются с 0 и 1 соответственно");

    Scanner scanner1 = new Scanner(System.in);
    int n = scanner1.nextInt();
    int[] f = new int[n];
    f[0] = 0;
    f[1] = 1;

    for (int i = 2; i < n; ++i) {
        f[i] = f[i - 1] + f[i - 2];
    }
    for (int i = 0; i < n; ++i) {

        System.out.print(f[i]);
    }

    System.exit(1);
} catch (ArrayIndexOutOfBoundsException e){
    System.err.println("Введите 2 числа!");
}
        }
    }





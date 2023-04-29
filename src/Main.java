
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, total = 0, number = 0;
        double average;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                total += i;
                number++;
            }
        }
        average = total / number;
        System.out.println("Sayıların toplamı: " + total);
        System.out.println("Sayı adedi: " + number);
        System.out.print("\n");
        System.out.println("Ortalama: " + average);
    }
}
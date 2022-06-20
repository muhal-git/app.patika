import java.util.*;

public class mukemmelSayi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz >>  ");
        int sayi = Integer.parseInt(scanner.next());
        int dummy = sayi / 2;
        int total = 0;

        for (int i = 1; i <= dummy; i++) {
            if (sayi % i == 0) {
                total += i;
            }
        }

        if (sayi == total) {
            System.out.println(sayi + " mükemmel sayidir!");
        } else {
            System.out.println(sayi+" mükemmel sayi degildir!");
        }

    }
}

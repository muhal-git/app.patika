import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.lang.*;



public class rakamlarToplam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sayi, total=0;

        System.out.print("Sayi giriniz: ");
        sayi = Integer.parseInt(scanner.next());
        int dummy = sayi;
        do {
            if (sayi<0) {
                System.out.println("Lutfen pozitif deger giriniz!");
                break;
            }
            total += sayi%10;
            sayi /= 10;
        } while ( sayi != 0 );

        System.out.println(dummy+" sayisinin rakamlari toplami: "+total);
    }
}

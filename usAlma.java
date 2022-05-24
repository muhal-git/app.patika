import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.lang.*;



public class usAlma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a^b seklinde hesaplama yapabilmek icin a&b degerleri giriniz...");
        System.out.print("a: ");
        long a = Long.parseLong(scanner.next());
        System.out.print("b: ");
        long b = Long.parseLong(scanner.next());

        long sonuc = 1;

        for (long i = 1; i <= b; i++) {
            sonuc *= a;
        }

        System.out.println(a+" ^ "+b+" = "+sonuc);
    }
}

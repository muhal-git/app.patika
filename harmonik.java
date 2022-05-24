import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.lang.*;



public class harmonik {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sayi,total=0;
        System.out.print("Sayi giriniz: ");
        sayi = Double.parseDouble(scanner.next());
        for (double i = 1; i <= sayi; i++) {
            total += 1/i;
            //System.out.print(total+", ");
        }
        System.out.print(total);
    }
}

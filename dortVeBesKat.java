import java.io.IOException;
import java.util.*;
import java.lang.*;


public class dortVeBesKat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = Integer.parseInt(scanner.next());

        for (int i = 0; i < sayi; i++) {
            System.out.println("| 4 ^ "+i+": "+Math.pow(4,i)+" | "+"| 5 ^ "+i+": "+Math.pow(5,i)+" | ");
        }
        
    }
}

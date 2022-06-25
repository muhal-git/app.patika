import java.util.*;

public class fibonacciSerisi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisi olusturmak icin eleman sayisi giriniz: ");
        long elemanSayisi = Integer.parseInt(scanner.next());

        long eleman_n = 0, eleman_nPlusOne = 1;
        System.out.print("| "+eleman_n+" | "+eleman_nPlusOne);

        for (long i = 1; i < elemanSayisi-1; i++) {

            long eleman_nPlusTwo = eleman_n + eleman_nPlusOne;
            System.out.print(" | "+eleman_nPlusTwo);
            eleman_n = eleman_nPlusOne;
            eleman_nPlusOne = eleman_nPlusTwo;

            if ( i%10 == 0 ) {
                System.out.print("\n");
            }
        }
        System.out.print(" |");
    }
}

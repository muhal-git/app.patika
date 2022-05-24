import java.util.*;
import java.lang.*;

public class kombinasyon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("C(n,r) kombinasyon hesabı yapabilmek icin n ve r degeri giriniz!");
        System.out.print("n: ");
        long n = Long.parseLong(scanner.next());
        System.out.print("r: ");
        long r = Long.parseLong(scanner.next());
        

        double kombinasyon = ( factorial(n) ) / ( factorial(r) * ( factorial(n-r) ) );

        System.out.println(factorial(n));

        System.out.println(factorial(r));

        System.out.println(factorial(n-r));
        System.out.println("C("+n+","+r+") = "+kombinasyon);

    }

    static long factorial(long n) {
        long tot = 1;
        for (long i = 1; i <= n; i++) {
            tot *= i;
        }
        return tot;
    }
}

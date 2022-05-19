import java.util.*;

public class siralama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayi: ");
        int a = scanner.nextInt();
        System.out.print("2. Sayi: ");
        int b = scanner.nextInt();
        System.out.print("3. Sayi: ");
        int c = scanner.nextInt();

        if ( a<=b && a<=c ) {
            if (b <= c) {
                System.out.print(a + " <= " + b + " <= " + c);
            } else {
                System.out.print(a+" <= "+c+" <= "+b);
            }
        } else if ( b<=a && b<=c ) {
            if (a <= c) {
                System.out.print(b + " <= " + a + " <= " + c);
            } else {
                System.out.print(b+" <= "+c+" <= "+a);
            }
        }else {
            if (b <= a) {
                System.out.print(c + " <= " + b + " <= " + a);
            } else {
                System.out.print(c+" <= "+a+" <= "+b);
            }
        }

    }
}

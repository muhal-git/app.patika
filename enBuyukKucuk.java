import java.util.*;

public class enBuyukKucuk {
    public static void main(String[] args) {

        System.out.print("Kac tane sayi gireceksiniz >> ");
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.next());
        System.out.print("1. sayiyi giriniz: ");
        int dummy = Integer.parseInt(scanner.next());
        int enBuyuk = dummy, enKucuk = dummy;
        for ( int i = 1 ; i < counter ; i++ ) {
            System.out.print((i+1)+". sayiyi giriniz: ");
            dummy = Integer.parseInt(scanner.next());
            if ( dummy > enBuyuk ) {
                enBuyuk = dummy;
            } else if ( dummy < enKucuk ) {
                enKucuk = dummy;
            }

        }

        System.out.println("En buyuk sayi: "+enBuyuk);
        System.out.println("En kucuk sayi: "+enKucuk);

    }
}

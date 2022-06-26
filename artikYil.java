import java.util.*;


public class artikYil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int yil = Integer.parseInt(scanner.next());

        if ( yil % 100 == 0 && yil % 400 == 0 ) {
            System.out.println(yil+" bir artık yıldır !");
        } else if ( yil % 100 == 0 ) {
            System.out.println(yil+" bir artık yıl değildir !");
        } else if (yil % 4 == 0) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil+" bir artık yıl değildir !");
        }
    }
}

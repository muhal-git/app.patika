import java.io.IOException;
import java.util.*;


public class bolunebilme {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        int sinirDeger = Integer.parseInt(scanner.next());
        System.out.println("0'dan "+sinirDeger+"'e kadar cift sayilar:");
        for (int i = 0; i < sinirDeger; i++) {
            if ( i%2 == 0 ) {
                System.out.print(i+", ");
            }
            if (i%20==0) {
                System.out.print("\n");
            }
        }

        System.out.println("\n3 ve 4  ile bolunebilen sayilar:");
        int total=0,counter=0;
        for (int i = 0; i < sinirDeger; i++) {
            if ( i%3==0 && i%4==0 ) {
                System.out.print(i+", ");
                total += i;
                counter++;
            }
        }
        System.out.println("\nBu sayilarin ortalamasi: "+total/counter);
        
    }
}

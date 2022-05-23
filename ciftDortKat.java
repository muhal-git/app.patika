import java.io.IOException;
import java.util.*;


public class ciftDortKat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz !");
        int total=0, dummy;
        while ( true ){
            System.out.print(">> ");
            dummy = Integer.parseInt(scanner.next());

            if (dummy % 2 == 1) {
                break;
            } else {
                if (dummy%4==0) {
                    total += dummy;
                }
            }
        }
        System.out.println("Girilen degerlerden 4'un kati olanlarin toplami: "+total);
        
    }
}

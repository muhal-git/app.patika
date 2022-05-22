import java.io.IOException;
import java.util.*;


public class biletFiyati {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mesafe = 0;
        int yas = 0;
        int yolculukTipi = 0;


        while(true) {
            try {
                System.out.print("Mesafeyi km turundan giriniz: ");
                mesafe = Integer.parseInt(scanner.next());

                System.out.print("Yasinizi giriniz: ");
                yas = Integer.parseInt(scanner.next());

                System.out.print("Yolculuk tipini giriniz (1: Tek Yon , 2: Gidis-Donus): ");
                yolculukTipi = Integer.parseInt(scanner.next());

                if ( !(yolculukTipi==1) && !(yolculukTipi==2) ) {
                    System.out.println("| Yolculuk tipi yanlis girildi! |");
                    System.out.println(1/0);
                }

                break;
            }
            catch (Exception hataliYolculukTipi) {
                System.out.println("| Hatali veri girdiniz... |\n");
            }
        }

        double normalTutar = mesafe * 0.1;
        double totalAmount = 0;
        
        if ( yas < 12 ) {
            totalAmount = normalTutar * 0.5;
            if ( yolculukTipi==2 ) {
                totalAmount *= 2*0.8;
            }
        } else if ( yas>=12 && yas<24 ) {
            totalAmount = normalTutar * 0.9;
            if ( yolculukTipi==2 ) {
                totalAmount *= 2*0.8;
            }
        }else if ( yas>=24 && yas<65 ) {
            totalAmount = normalTutar;
            if ( yolculukTipi==2 ) {
                totalAmount *= 2*0.8;
            }
        }else if ( yas>=65 ) {
            totalAmount = normalTutar * 0.7;
            if ( yolculukTipi==2 ) {
                totalAmount *= 2*0.8;
            }
        }

        System.out.println("Toplam Tutar = "+totalAmount+" TL");



        /*

        String regex = "\\d+";
        String data = "d";
        System.out.println(data.matches(regex));
         */

    }
}

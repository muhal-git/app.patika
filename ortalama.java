import java.util.*;

public class ortalama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mat, fiz, tur, kim, muz;

        while (true){
            System.out.print("Matematik notunuz: ");
            mat = scanner.nextInt();
            if (mat < 0 || mat > 100) {
                System.out.println("Lutfen 0 dan 100'e kadar bir deger giriniz!");
            } else {
                break;
            }
        }

        while (true){
            System.out.print("Fizik notunuz: ");
            fiz = scanner.nextInt();
            if (fiz < 0 || fiz > 100) {
                System.out.println("Lutfen 0 dan 100'e kadar bir deger giriniz!");
            } else {
                break;
            }
        }

        while (true){
            System.out.print("Turkce notunuz: ");
            tur = scanner.nextInt();
            if (tur < 0 || tur > 100) {
                System.out.println("Lutfen 0 dan 100'e kadar bir deger giriniz!");
            } else {
                break;
            }
        }
        while (true){
            System.out.print("Kimya notunuz: ");
            kim = scanner.nextInt();
            if (kim < 0 || kim > 100) {
                System.out.println("Lutfen 0 dan 100'e kadar bir deger giriniz!");
            } else {
                break;
            }
        }
        while (true){
            System.out.print("Muzik notunuz: ");
            muz = scanner.nextInt();
            if (muz < 0 || muz > 100) {
                System.out.println("Lutfen 0 dan 100'e kadar bir deger giriniz!");
            } else {
                break;
            }
        }

        int total = mat + fiz + tur + kim + muz;
        double ortalama = total / 5 ;
        String durum;

        if (ortalama >= 55) {
            durum = "SINIFI GECTINIZ !";
        } else {
            durum = "SINIFTA KALDINIZ !";
        }

        System.out.println("Ortalamaniz: "+ortalama+" |"+durum+"|");


    }
}

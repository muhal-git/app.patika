import java.util.ArrayList;
import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Sirasiyla Armut, Elma, Domates, Muz, Patlıcan fiyat
        double[] fiyat = {2.14, 3.67, 1.11, 0.95, 5.00};
        String[] urunler={"Armut","Elma","Domates","Muz","Patlıcan"};
        double kilo, tutar, toplamTutar=0;
        int pivot=0;
        for (String urun : urunler ) {
            System.out.print(urun + " kac kilo? >> ");
            kilo = input.nextDouble();
            tutar = fiyat[pivot++]*kilo;
            toplamTutar += tutar;
        }
        System.out.print("Toplam Tutar: "+String.format("%.2f",toplamTutar)+" TL");

    }
}

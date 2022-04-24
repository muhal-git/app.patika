import java.util.Scanner;
public class kdv
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("KDV'siz Fiyat = ");
        double taxFreeAmount = input.nextDouble();
        if (taxFreeAmount<0){
            System.out.println("Tutar sıfırdan küçük olamaz!\nSıfırdan büyük bir tutar giriniz...");
        }
        else {
            double taxPlusPrice;
            if (taxFreeAmount<=1000){
                taxPlusPrice=taxFreeAmount*1.18;
            }
            else{
                taxPlusPrice=taxFreeAmount*1.08;
            }
            System.out.println("KDV'li Fiyat = "+String.format("%.2f",taxPlusPrice));
            System.out.println("KDV Tutari = "+String.format("%.2f",taxPlusPrice-taxFreeAmount));
            }
    }
}

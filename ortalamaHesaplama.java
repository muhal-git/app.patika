import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Not ortalamanizi hesaplamak icin ders notlarinizi giriniz.");
    System.out.print("Ders sayinizi giriniz: ");
    int totalDersSayisi = input.nextInt();
    float totalPuan = 0;
    for (int i=1 ; i <= totalDersSayisi ; i++ ){
        System.out.print(i+". Ders Puan: ");
        totalPuan += input.nextInt();
    }
    System.out.println("-----------------------------------");
    float ortalama = totalPuan/totalDersSayisi;
    System.out.println("Not Ortalamaniz: "+String.format("%.2f",ortalama));
    System.out.println("-----------------------------------");
    System.out.println("| "+(ortalama > 60 ? "Sinifi Gecti" : "Sinifta Kaldi")+" |");
    
    }
}

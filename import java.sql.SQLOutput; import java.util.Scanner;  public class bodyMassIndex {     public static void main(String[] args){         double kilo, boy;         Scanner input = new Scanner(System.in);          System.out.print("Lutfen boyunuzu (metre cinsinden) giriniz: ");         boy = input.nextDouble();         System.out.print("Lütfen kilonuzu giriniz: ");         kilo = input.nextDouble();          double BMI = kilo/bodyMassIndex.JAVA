import java.sql.SQLOutput;
import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args){
        double kilo, boy;
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        double BMI = kilo / (boy*boy);
        System.out.println("Vucut kitle indeksiniz: " + String.format("%.2f",BMI));
    }
}

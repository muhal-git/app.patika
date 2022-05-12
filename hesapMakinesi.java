import java.util.*;

public class hesapMakinesi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        int operation;

        System.out.println("--- Hesap Makinesi ---");
        System.out.print("İlk sayiyi giriniz: ");
        num1 = scanner.nextDouble();

        System.out.print("İkinci sayiyi giriniz: ");
        num2 = scanner.nextDouble();

        System.out.print("Yapmak istediğiniz işlemi seçiniz --> | \"1\" TOPLAMA | \"2\" ÇIKARMA | \"3\" ÇARPMA | \"4\" BÖLME |\nSECİM: ");
        operation = scanner.nextInt();

        switch (operation){
            case 1: System.out.println("SONUC: "+num1+" + "+num2+" = "+(num1+num2));
                    break;
            case 2: System.out.println("SONUC: "+num1+" - "+num2+" = "+(num1-num2));
                break;
            case 3: System.out.println("SONUC: "+num1+" x "+num2+" = "+(num1*num2));
                break;
            case 4: System.out.println("SONUC: "+num1+" / "+num2+" = "+(num1/num2));
                break;
            default: System.out.println("Bilinmeyen bir işlem seçildi. Lütfen 1-4 arasında bir rakam seçiniz!");
        }
    }
}

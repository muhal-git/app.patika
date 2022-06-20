import java.util.*;

public class ebobEkok {
    public static void main(String[] args) {

        System.out.println("Pozitif iki adet sayi giriniz...");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayi >> ");
        int num1 = Integer.parseInt(scanner.next());
        System.out.print("Ikinci sayi >> ");
        int num2 = Integer.parseInt(scanner.next());

        int dummy = 0;
        if (num1 == 0 && num2 == 0) {
            System.out.println("Degerlerden bir tanesi sifirdan buyuk olmalidir!");
        } else if (num1 == 0) {
            System.out.println("EBOB(" + num1 + "," + num2 + ") = " + num2);
        } else if (num2 == 0) {
            System.out.println("EBOB(" + num1 + "," + num2 + ") = " + num1);
        } else {
            if (num1 < num2) {
                dummy = num1;
            } else {
                dummy = num2;
            }

            while (dummy > 1) {
                if (((num1 % dummy) == 0) && ((num2 % dummy) == 0)) {
                    break;
                }
                dummy--;
            }

            System.out.println("EBOB(" + num1 + "," + num2 + ") = " + dummy);
        }

        int ekok = (num1 * num2) / dummy;

        System.out.println("EKOK(" + num1 + "," + num2 + ") = " + ekok);

    }
}

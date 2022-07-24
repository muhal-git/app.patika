import java.util.Arrays;
import java.util.Scanner;

public class listeAlSirala {

    public static  void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu: ");
        int numOfElements = Integer.parseInt(scanner.next());

        int[] list = new int[numOfElements];

        System.out.println("Dizinin elemanlarini giriniz:");
        for (int i = 0; i < numOfElements; i++) {
            System.out.print((i+1) + ". Elemani : "  );
            list[i] = Integer.parseInt(scanner.next());
        }

        System.out.println("Liste:        " + Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sirali liste: " + Arrays.toString(list));
    }
}

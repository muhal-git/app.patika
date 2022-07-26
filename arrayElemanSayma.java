import java.util.Arrays;
import java.util.Scanner;

public class arrayElemanSayma {

    static void countElementsOf(int[] arr){
        Arrays.sort(arr);
        System.out.println("Liste:" + Arrays.toString(arr));
        System.out.println("Tekrar sayilari");
        int count = 1;
        int pivot = 0;
        for ( int i: arr ){
            if ( ( pivot < arr.length -1 ) && (i == arr[pivot+1]) ) {
                count++;
            }
            else {
                System.out.println(i + " sayisi " + count + " kere tekrar edildi.");
                count = 1;
            }
            pivot++;
            //System.out.println("sayi:" + count);
        }
    }

    public static  void main(String[] args){

        /*
        int[] lister = {1,1,1,1,1,1,1,1,1};
        [1, 1, 1, 1, 1, 1, 1, 1, 1]
        Tekrar sayilari
        1 sayisi 9 kere tekrar edildi.
         */
        int[] lister = {10, 20, 20, 10, 10, 20, 5, 20};
        
        countElementsOf(lister);

    }
}

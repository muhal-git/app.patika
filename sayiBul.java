import java.util.Arrays;

public class sayiBul {

    static void buyukVeKucuk(int[] arr, int sayi){
        System.out.println("Liste: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sirali:"+Arrays.toString(arr));
        int min = arr[0], max=arr[arr.length-1], pivot =0;
        for (int i: arr){
            if ( i < sayi ){
                min = i;
            }
            if ( i > sayi ){
                max = i;
                break;
            }
            pivot++;
        }

        System.out.println("Listede "+sayi+" dan kucuk en buyuk sayi: "+min);
        System.out.println("Listede "+sayi+" dan buyuk en kucuk sayi: "+max);
    }

    public static  void main(String[] args){
        int[] list = {15,12,788,1,-1,-778,2,0};
        int sayi1 = 5;
        buyukVeKucuk(list,5);
    }
}

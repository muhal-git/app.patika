import java.util.Arrays;

public class tekrarEdenCiftSayilar {

    static int[][] countElements(int[] arr){
        int[][] numOfOccurences = new int[2][arr.length];

        for (int i = 0; i < arr.length; i++) {
            numOfOccurences[0][i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if ( (i != j) && (arr[i] == arr[j]) ) {
                    count++;
                }
            }
            numOfOccurences[1][i]=count;
        }

        return numOfOccurences;
    }
    public static  void main(String[] args){
        int[] newlist = new int[10];
        for (int i = 0; i < newlist.length; i++) {
            newlist[i] = (int) (Math.random()*10);
        }
        System.out.println(Arrays.toString(newlist));

        int[][] counter = countElements(newlist);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < newlist.length; j++) {
                System.out.print(counter[i][j]+" ");
            }
            System.out.println("");
        }

        int pivot = 0;
        System.out.println("Tekrar eden cift sayilar: ");
        for ( int i: counter[1] ){
            if ( (i > 1) && (newlist[pivot]%2 == 0) ) {
                System.out.print(" "+newlist[pivot]+" | ");
            }
            pivot++;
        }
    }
}

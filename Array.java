import java.util.Arrays;

public class Array {

    static int[] initializeArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    static void printArray(int[] arr){
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("}");
    }

    //reverseArray();
    static int[] reverseArray(int[] arr){
        int reversed[] = new int[arr.length];
        for (int i = 0, j = arr.length-1; i < arr.length ; i++, j--) {
            reversed[i] = arr[j];
        }
        return  reversed;
    }

    public static  void main(String[] args){
        int[] list = new int[11];
        printArray(list);
        initializeArray(list);
        printArray(list);

        int[] list2 = {10,20,30,40,50,60,70};
        printArray(list2);
        initializeArray(list2);
        printArray(list2);
        list2 = reverseArray(list2);
        printArray(list2);


        String[] weekdays = {"Monday","Tuesday","Wednesday"};
        String[] weekendDays = new String[]{"Saturday","Sunday"};

        System.out.println(weekdays[0]);
        System.out.println(weekendDays[0]);
        weekendDays[0] = "Cumartesi";
        System.out.println(weekendDays[0]);


        String  colors[] = new String[10];
        colors[0] = "Black";

        int cars[];
        int count=3;
        cars = new int[count];
        for(int i=0; i<cars.length; i++)
            cars[i] = (i+1)*2;
        for(int j=0; j<cars.length; j++)
            System.out.print(cars[j] + ",");

        System.out.println("\n------------------------------------");

        // foreach for loop
        for (int i:cars){
            System.out.print(i+" ");
        }

        int[][] Matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("\n");
        for (int[] row: Matrix){
            System.out.print("[");
            for (int col: row){
                System.out.print(col+" ");
            }
            System.out.println("]");
        }


        int dizi[] = {0,1,2,3,-4,-5,-6,7,-8,9};
        System.out.println(Arrays.toString(dizi));


        int[] dizi2 = new int[10];

        Arrays.fill(dizi2,9);
        System.out.println(Arrays.toString(dizi2));

        Arrays.fill(dizi,1,5,9);
        System.out.println(Arrays.toString(dizi));

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

        int dummy[] = {0,1,2,3,-4,-5,-6,7,-8,9};
        Arrays.sort(dummy,4,9);
        System.out.println(Arrays.toString(dummy));

        //Arrays.sort(dummy);
        System.out.println("Index of 9: "+Arrays.binarySearch(dummy,9));
        System.out.println("--------------------------------------------------------------");

        int dummy12[] = {-123,4,-40,1,3,-5,7};
        System.out.println(Arrays.toString(dummy12));
        System.out.println("Index of -40: "+Arrays.binarySearch(dummy12,-40));
        Arrays.sort(dummy12);
        System.out.println(Arrays.toString(dummy12));
        System.out.println("Index of -40: "+Arrays.binarySearch(dummy12,-40));
        //Arrays.binarySearch();
        System.out.println("--------------------------------------------------------------");

        int[] dummy45 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        System.out.println("Array: "+Arrays.toString(dummy45));
        int[] copyOfdummy45 = Arrays.copyOf(dummy45,2);
        System.out.println(Arrays.toString(copyOfdummy45));
        copyOfdummy45 = Arrays.copyOf(dummy45,25);
        System.out.println(Arrays.toString(copyOfdummy45));
        int[] copyOfRangeArray = Arrays.copyOfRange(dummy45,1,4);
        System.out.println(Arrays.toString(copyOfRangeArray));
        System.out.println("--------------------------------------------------------------");

        int clist1[] = {1,2,3};
        int clist2[] = {1,2,3};
        int clist3[] = {1,2,4};
        System.out.println(Arrays.toString(clist1)+" == "+Arrays.toString(clist2)+" : "+Arrays.equals(clist1,clist2));
        System.out.println(Arrays.toString(clist2)+" == "+Arrays.toString(clist3)+" : "+Arrays.equals(clist2,clist3));

    }
}

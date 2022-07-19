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
    }
}

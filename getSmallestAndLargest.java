import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";  
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int first = 0;
        int last = 0;
        
        for (int i = 0; i < s.length()-k+1; i++) {
            int pivot = s.charAt(i);
            if ( pivot <= s.charAt(first) ) {
                first = i;
            }
            if ( pivot > s.charAt(last) ) {
                last = i;
            }
             
           // System.out.println("ASCII vale of "+s.charAt(i)+": "+pivot);
        }
        /*
        System.out.println("First: "+first+". char: "+s.charAt(first));
        
        System.out.println("Last: "+last+". char: "+s.charAt(last));
        */
        int dummy=k;
        while (dummy-->0) {
            smallest += s.charAt(first++);
            //System.out.println(smallest);
        }    
        dummy=k;
        while (dummy-->0) {
            largest += s.charAt(last++);
            //System.out.println(largest);
        }    
        
    
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

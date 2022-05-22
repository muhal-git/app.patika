import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        String backwardStr = "";
        int pivot = A.length()-1;
        
        for (int i = 0; i < A.length(); i++) {
            backwardStr += A.charAt(pivot--);
            //System.out.println(backwardStr);
        }
        
        if ( A.equals(backwardStr) ){
            System.out.print(A+" is a palindrome");
        }
        else{
            System.out.print(A+" is not a palindrome");
        }
    }
}




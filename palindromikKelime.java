import java.io.*;
import java.util.*;

public class palindromikKelime {

    public static void main(String[] args) {

        System.out.print("Kelime giriniz: ");
        Scanner sc=new Scanner(System.in);
        String A=sc.next();


        String backwardStr = "";
        int pivot = A.length()-1;

        for (int i = 0; i < A.length(); i++) {
            backwardStr += A.charAt(pivot--);
            //System.out.println(backwardStr);
        }

        if ( A.equals(backwardStr) ){
            System.out.print(A+" Palindromik kelimedir.");
        }
        else{
            System.out.print(A+" Palindromik kelime degildir!");
        }
    }
}

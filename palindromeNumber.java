import java.util.*;

public class palindromeNumber{  
    public static void main(String[] args) {
       isPalindrome(2022);
    }

    static void isPalindrome(int num) {
      String numara = String.valueOf(num);
      
      String backwardStr = "";
      int pivot = numara.length()-1;
        
      for (int i = 0; i < numara.length(); i++) {
            backwardStr += numara.charAt(pivot--);
        }
        
      if ( numara.equals(backwardStr) ){
            System.out.print(num + " is a Palindrome number.");
        }
      else{
            System.out.print(num + " is not a Palindrome number.");
        }
}
}

import java.util.*;

/*

INPUT: 8
OUTPUT: 8 3 -2 3 8

INPUT: 5
OUTPUT: 5 0 5

*/

public class desenKural {
    static void desen(int n,Character c,int stop){
      Character minus = new Character('-');
      System.out.print(n+" ");
      if (n>0 && c=='-'){
        Character ch = new Character('-');
        desen(n-5,ch,stop);
      }
      else{
        Character ch = new Character('+');
        if(n==stop){
          return;
        }
        desen(n+5,ch,stop);
      }
    }
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Pozitif N sayisi: ");
      int n = scanner.nextInt();
      if(n<=0){
        System.out.print("Lutfen pozitif sayi giriniz.");
      }else{
        int stop = n;
        Character ch = new Character('-');
        desen(n,ch,stop);
      }
  }
}



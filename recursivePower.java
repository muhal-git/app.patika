import java.util.*;


public class recursivePower {
  
  static int pow(int base, int power){
  if ( power==1 ){
    return base;
  }else{
    return base * pow(base,power-1);
  }
}
    public static void main(String[] args) {
      System.out.println(pow(5,3));
  }
}

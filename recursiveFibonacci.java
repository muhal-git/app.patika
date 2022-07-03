import java.util.*;



public class recursiveFibonacci {
  
  static int fibonacci(int num){
    if( num==0 ){
      return 0;
    }
    if ( num==1 | num==2 ){
      return 1;
    }
    else{
      return fibonacci(num-2)+fibonacci(num-1);
    }
}

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("How many fibonacci number do you want to print: ");
      int last = Integer.parseInt(scanner.next());
      for ( int i=0; i < last ; i++){
        System.out.println(fibonacci(i));
      } 
  }
}



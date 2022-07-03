import java.util.*;


public class recursivePrimality {
  
  static boolean isPrime(long primeCandidate, long divisor){
    if ( primeCandidate < 2 ){
      return false;
    }
    else if ( primeCandidate == 2 ){
      return true;
    }
    // divisor*divisor <= primeCandidate --> sqare root primality test
    else if(divisor*divisor <= primeCandidate){
      if(primeCandidate%divisor==0){
        return false;
      }
      return isPrime(primeCandidate,divisor+1);
      }
    else{
      return true;
    }
  }
  
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("How many prime numbers: \n");
      long num = scanner.nextLong();
      long i = 2;
      while(num>0){
        if(isPrime(i,2)){
          System.out.print(i+" | ");
          num--;
          if (num%5==0){
          System.out.print("\n");
        }
        }
        
        i++;
      }
    
  }
 }

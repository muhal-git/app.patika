    import java.util.*;

    public class asalSayilar {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("0-100 arasi asal sayilar:\n| 2 | ");

            for ( int i = 3 ; i < 100 ; i++ ) {
                int dummy = 1;
                for ( int j=2 ; j*j <= i ; j++ ) {
                    //System.out.println("---"+i%j+"----");
                    if ( i%j == 0 ) {
                        //System.out.println("---"+i%j+"----");
                        dummy = 0;
                    }

                }
                if ( dummy == 1 ) {
                    System.out.print(i+" | ");
                }
            }

        }
    }

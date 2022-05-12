import java.io.*;
import java.util.*;
import java.text.*;

public class currencySymbol {

    public static void main(String[] args) {
        
        double payment = 1250345.2;
        

        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n.format(payment);
        NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = n1.format(payment);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n2.format(payment);
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n3.format(payment);

        NumberFormat n4 = NumberFormat.getCurrencyInstance(new Locale("tr","TR"));
        String turkey = n4.format(payment);
        System.out.println("Turkey: " + turkey);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);




    }
}

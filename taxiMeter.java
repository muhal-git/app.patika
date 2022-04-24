import java.util.*;
public class taxiMeter {
    public static void main(String[] args){
        double price = 10,distance;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance(KM): ");
        distance = input.nextDouble();
        price = distance * 2.20;
        System.out.println("Amount of the trip: "+ (price<20 ? 20 : String.format("%.2f",price)));

    }
}

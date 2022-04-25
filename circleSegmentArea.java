import java.util.Scanner;

public class circleSegmentArea {
    public static void main(String[] args){
        double radius, angle, pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        System.out.print("Enter angle: ");
        angle = input.nextDouble();

        double areaOfCircleSegment = (pi * radius * radius)*(angle/360);
        System.out.println("Area of circle segment is: " + String.format("%.2f",areaOfCircleSegment));
    }
}

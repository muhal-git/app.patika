import java.util.*;
public class triangleArea {
    public static void main(String[] args) {
        double perimeter,edge1,edge2,edge3;
        double halfOfPerimeter;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of edge 1: ");
        edge1 = input.nextInt();
        System.out.print("Enter the length of edge 2: ");
        edge2 = input.nextInt();
        System.out.print("Enter the length of edge 3: ");
        edge3 = input.nextInt();
        perimeter = edge1 + edge2 + edge3;

        halfOfPerimeter = perimeter / 2;
        double areaOfTriangle = Math.sqrt(halfOfPerimeter*(halfOfPerimeter-edge1)*(halfOfPerimeter-edge2)*(halfOfPerimeter-edge3));
        System.out.print("Area of triangle with edges "+edge1+", "+edge2+", "+edge3+" unit is: "+String.format("%.2f",areaOfTriangle)+" unit squares.");
    }
}

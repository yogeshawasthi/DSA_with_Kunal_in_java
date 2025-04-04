package yogesh.assignment.Conditionals;
import java.util.Scanner;
import java.lang.Math;
//Calculate Distance Between Two Points

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Coordinates of Frist Point");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Enter the coordinate of Second Point");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        double c = ((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
        double dis = Math.sqrt(c);
        System.out.println("Distance is : "+dis+"Units");

    }
}

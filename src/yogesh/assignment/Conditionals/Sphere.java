package yogesh.assignment.Conditionals;
import java.util.Scanner;
// Volume of Sphere

public class Sphere {
    public static void main(String[] args) {
        System.out.println("Ente r radius of sphere");
        Scanner in = new Scanner(System.in);
        int rad = in.nextInt();
        int Area = (4/3)*(22/7)*rad*rad*rad;
        System.out.println("Volume of Sphere : " +Area);
    }

}

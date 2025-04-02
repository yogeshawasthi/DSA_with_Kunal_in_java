// Volume Of Cylinder
package yogesh.assignment.Conditionals;
import java.util.Scanner;

public class Area1 {
    public static void main(String[] args) {
        System.out.println("Enter Length,breadth,height of clinder");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int breadth = in.nextInt();
        int height = in.nextInt();
        System.out.println("Volume of clyinder is : " + length*breadth*height);
    }

}

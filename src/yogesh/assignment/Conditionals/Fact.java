package yogesh.assignment.Conditionals;
import javax.xml.stream.events.EndDocument;
import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Enter a num for finding factorial Of : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int fact = 1;
        if (num == 0) {
            System.out.println("Factorial of " + num + " is = 1");

        }
        if (num > 0) {
            while (num >= 1) {
                fact *= num;
                num--;

            }
            System.out.println("Factorial is :  " + fact);
        }
    }
}
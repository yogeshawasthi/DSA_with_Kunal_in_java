package yogesh.assignment.Conditionals;
import java.util.Scanner;

public class Elec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the units of Electricity : ");
        int c =in.nextInt();
        int d = c * 5;
        System.out.println("Electricity bill is : "+d);
    }
}

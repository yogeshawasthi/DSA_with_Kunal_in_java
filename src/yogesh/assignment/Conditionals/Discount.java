package yogesh.assignment.Conditionals;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The amount ");
        float principal = in.nextFloat();
        System.out.println("Enter the Discount rate");
        float discount = in.nextFloat();
        float amt;
        amt = principal *(discount/100);
        System.out.println("The discount Amount is : " + amt);
        System.out.println("The Amount after discount is : "+ (principal-amt));
            }
}

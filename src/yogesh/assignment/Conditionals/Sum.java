package yogesh.assignment.Conditionals;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        System.out.println("Enter two numbers: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a+b;
        System.out.println("Sum of two Number is : "+ c);
    }
}

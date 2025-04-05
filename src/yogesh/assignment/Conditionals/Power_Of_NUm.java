package yogesh.assignment.Conditionals;
import  java.util.Scanner;

public class Power_Of_NUm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of Number : ");
        int num = in.nextInt();
        System.out.println("Enter power of The number : ");
        int pow = in.nextInt();
        int count = 1;
        for( int i=pow;i>=1;i--){
            count*=num;

        }
        System.out.println("Result is : "+count);
    }
}

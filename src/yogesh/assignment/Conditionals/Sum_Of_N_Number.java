package yogesh.assignment.Conditionals;
import java.util.Scanner;

public class Sum_Of_N_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many Number you want to add");
        int num = in.nextInt();
        int sum = 0;
        while(num!=0){
            System.out.println("Enter The number: ");
            int as = in.nextInt();
            sum+=as;
            num--;

        }
        System.out.println("Sum is : "+sum);

    }
}

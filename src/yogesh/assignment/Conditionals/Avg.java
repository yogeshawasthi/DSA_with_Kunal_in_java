package yogesh.assignment.Conditionals;
import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How ma ny number you want to enter TO find avereage");
        int num= input.nextInt();
        int count=0;
        for(int i=num;i>=1;i--){
            System.out.println("Enter The numbers");
            int in = input.nextInt();
            count+=in;

        }
        float avg = (float) count/num;
        System.out.println("Average is : "+avg);
    }
}

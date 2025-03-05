package yogesh.lecture.fristjava_program;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a  number");
        int num = in.nextInt();
        int copy = num;
         int  count = 1;
        while(num>=1)
        {
            count = count * num;
            num = num-1;
//            System.out.println(count);  -->give value of count each time

        }
        System.out.println("factorial of "+ copy + " is " + count);

    }
}

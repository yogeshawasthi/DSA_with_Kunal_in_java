package yogesh.assignment.Conditionals;
import java.util.Scanner;

public class Leetcode {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number   for eg: xy");
        System.out.println("I will find x*y - x+y ");
        int num = in.nextInt();

//        int count = 0;
//        int mod = num/10;
//        System.out.println("mod is working or not check "+ mod);

        int sum = 0;
        long mul;
        mul = 1;
        while (num>0) {
            sum = sum + num % 10;
            mul = mul * num % 10;
            num = num / 10;
        }
        System.out.println(mul);
        System.out.println("Multiplied = " + mul);
        System.out.println("Sum of digits = " + sum);
        long result = mul - sum;
        System.out.println(" Result is : "+ result);

    }


}

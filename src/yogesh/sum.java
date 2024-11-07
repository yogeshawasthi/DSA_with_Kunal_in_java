package yogesh;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("Enter Two numbers: ");
        Scanner num= new Scanner(System.in);
        float a = num.nextFloat();
        float b = num.nextFloat();
        float sum = a+ b;
        System.out.println("sum of two numbers: "+sum);
    }
}

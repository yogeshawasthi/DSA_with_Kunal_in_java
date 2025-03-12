package yogesh.assignment.fristjava;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Amount of money in simple words( principal) ");
        int principal = in.nextInt();

        System.out.println("Enter Time in Years");
        int time = in.nextInt();

        System.out.println("Enter Rate ");
        float rate = in.nextFloat();

        float i = (principal * time * rate )/ 100;
        System.out.println("Simple Interest is " + i);
    }
}

package yogesh.assignment;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = in.nextInt();

        System.out.print("Fibonacci series : ");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print( i + " ");
            count++;
            if (count == n) {
                break;
            }
        }



    }
}

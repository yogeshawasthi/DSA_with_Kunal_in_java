package yogesh.assignment;

import java.util.Scanner;

public class even_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        if(n==0){
            System.out.println("neither odd nor even");
            return;
        }

        int c = n % 2;
        if(c==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }
}

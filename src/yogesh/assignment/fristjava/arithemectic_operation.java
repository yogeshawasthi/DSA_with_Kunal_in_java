package yogesh.assignment.fristjava;

import java.util.Scanner;

public class arithemectic_operation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        if(a>b){
            System.out.println("Subtraction : ");
            System.out.println(a-b);
        }
        else if(b>a){
            System.out.println("Addition : ");
            System.out.println(a+b);
        }
        else if (a==b) {
            System.out.println("Sorry you entered same number twice : ");
            System.out.println( "but i can do division operation on it " + a/b);
        }
        else{
        System.out.println("Multiplication : ");
        System.out.println(a*b);
        }

    }
}

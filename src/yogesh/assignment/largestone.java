package yogesh.assignment;

import java.util.Scanner;

public class largestone {
    public static  void  main(String [] args){

        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter first number : ");
        int a = in.nextInt();

        System.out.println("Enter second number : ");
        int b = in.nextInt();

        if(a>b){
            System.out.println("A is the greatest number which is : " +a);
        }

        else{
            System.out.println("B is the greatest number which is : " + b);
        }


   }
 }


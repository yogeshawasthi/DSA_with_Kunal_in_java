package yogesh.assignment.fristjava;

import java.util.Scanner;

public class currency_converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the currenny in ruppes , I will convert it currency you want ");
        float npr = in.nextFloat();

        System.out.println("Enter the exchange rates of the 1 $ = ? npr ");
        float rate = in.nextFloat();

        float dlr =   (npr / rate);

        System.out.println("Here is the exchange rates, you can have : ");
        System.out.println( npr + " ruppes " +" = " + dlr + " dollars"  );
    }
}

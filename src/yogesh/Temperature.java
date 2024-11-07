package yogesh;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the temperature in Celcius: ");
        float Tempc = Input.nextFloat();
        float Tempf =  (Tempc * 9/5 )+ 32;

        System.out.println("Temperature in Fahrenheit: "+Tempf);
    }
}

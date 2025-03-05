package yogesh.lecture.fristjava_program;
import java.util.Scanner;

public class practice{
    public static void main(String[] args){
        System.out.println("This is Practice code for no reason");
        // for input we need to make object of scanner class
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String Name = input.nextLine();//input.next->> takes input before space
        // input.nextLine-->> this takes input whole including commas as well
        System.out.println("Hey " + Name + ", How are You.");
        String fine  = input.nextLine();
        System.out.println("Enter any Two numbers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println( "Sum of two numbers is : "+ a+b);
        long lo = 1212L;
        System.out.println(lo);


    }
}

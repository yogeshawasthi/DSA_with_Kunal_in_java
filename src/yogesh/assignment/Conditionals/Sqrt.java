package yogesh.assignment.Conditionals;
import java.lang.Math;
import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args){
//        System.out.println("Hellow");
//        double a= Math.sqrt(4);
//        System.out.println(a);
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Three Sides of trianlge as a,b,c : ");
        float a = in.nextFloat();//2
        float b = in.nextFloat();//3
        float c = in.nextFloat();//7

        double  s =  ((a + b + c) * 0.5);// type casting to float //6

        System.out.println(s);
        double Iso_triangle ;
        Iso_triangle=Math.sqrt((s*(s-a)*(s-b)*(s-c)));//
        System.out.println(Iso_triangle);

    }
}

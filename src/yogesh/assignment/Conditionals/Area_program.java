package yogesh.assignment.Conditionals;
import java.lang.Math;

import java.util.Scanner;

public class Area_program {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Let`s Find Out the Area of the Circle: ");
        System.out.println("Enter The Radius of circle");
        float rad = in.nextFloat();
        int Area = (int) (3.14 * rad * rad);

        // converitng the float answer to interger by typecasting

        System.out.println("Calculating the Area of Circle .....");
        System.out.println("Ok, calculation done. ");
        System.out.println("Area of Circle = " + Area );


        // Area of Traingle

        System.out.println("Enter  base and  height of the triangle : ");
        int base = in.nextInt();
        int height = in.nextInt();
        System.out.println("Area of Traingle is : "+ 0.5* base *height);

        //Area of Rectangle
        System.out.println("Enter the length and breadth of Rectangle : ");
        int len = in.nextInt();
        int bre = in.nextInt();
        System.out.println("Area of Rectangle is : "+ len * bre);

        //Area of Iscoceles Trainle

        System.out.println("Enter Three Sides of trianlge as a,b,c : ");
        float a = in.nextInt();//2
        float b = in.nextInt();//3
        float c = in.nextInt();//7

         double  s = (double) ((a + b + c) * 0.5);// type casting to float //6

        System.out.println(s);
         double Iso_triangle ;
         Iso_triangle=Math.sqrt((s*(s-a)*(s-b)*(s-c)));//


     System.out.println("Area of Isoceles Triangle is : " + Iso_triangle);

        // Area of Parralleogram

        System.out.println("Enter the lenght of the sides of traigle");
         int leng = in.nextInt();
         int bread = in.nextInt();
        System.out.println("Area of parrallelogram is :  " + leng * bread);

        System.out.println("Square root of 4 is : "+ Math.sqrt(4.00));



    }
}

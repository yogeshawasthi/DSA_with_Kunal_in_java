package yogesh.assignment.Conditionals;
import java.util.Scanner;
import java.lang.Math;

public class Area_Equi {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of a side of triangle");
        float side = in.nextFloat();
        double roti =Math.sqrt(3);
        Double Area =(roti*side*side)/4;
        System.out.println("Area is : "+ Area);




    }
}

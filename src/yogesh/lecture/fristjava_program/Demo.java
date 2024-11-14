package yogesh.lecture.fristjava_program;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        System.out.println("Enter the Length of rectangle");
        Scanner data = new Scanner(System.in);
        int length = data.nextInt();
        System.out.println("Enter the breath of rectangle");
        int breadth = data.nextInt();
        System.out.println("Length  of rectangle is = " + length );
        System.out.println(  "breadth  of rectangle is = " + breadth );
        System.out.println( "Area is = " + length*breadth );


    }
}

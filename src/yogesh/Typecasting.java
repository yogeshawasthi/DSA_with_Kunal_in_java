package yogesh;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        //Typecasting

        int num = (int)(67.73f);// float 67.73f will be changed to int just 67 will be printed out
        System.out.println(num);

        //automatic type promotion in expressions
//        int a = 257;
//        byte b =  (byte) (a); // 257 % 256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 80;
//        byte c = 100;
//        int d = a * b/ c; // the bytes a and b are promoted to int during operation automatically by the java
//        System.out.println(d);


//        byte b=30;
//        b= b*60;// it will show error cause is now converted to int and b cannot be assigned to byte
        // solution is  b = (byte) (b*60)
//        System.out.println(b);
        int number = 'a';
        System.out.println(number);
//
//        // java allows unicode
        System.out.println("जभिियध");

//        rules of promotion in experession
        // int * float = promoted to float
        // greater value will be promoted
//
        System.out.println(5*5.6);
        System.out.println(5*5.878787897876f);

        byte b = 42;
        char c = 'c';
        short s = 120;
        int i = 50000;
        float f = 5.564f;
        double d = 0.56204;
        double result = (f * b) + (i / c ) - (d * s);
        // output = float + integer - double = converted to double
        System.out.println((f * b) + " " + (i / c )+  " " +  (d * s));
        System.out.println(result);

    }
}

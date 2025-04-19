package yogesh.lecture.fristjava_program;
import java.util.Scanner;

public class loop {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the table you want to print");
        int num = in.nextInt();
        int count = 1;
        while(count<=10)
        {
            System.out.println( num + "  *  " + count + "  = " + num * count);
            count+=1;// count = count + 1

        }

    }
}

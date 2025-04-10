package yogesh.assignment.Conditionals;
import java.util.Scanner;

public class Gpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many subject you have : ");
        int num = in.nextInt();
        int loop = num;
        float count = 0;
        while (loop>=1){
            System.out.println("Enter The Marks: ");
            int mark = in.nextInt();

            count+=mark;
            System.out.println(count);
            loop--;

        }

        float gpa = (float) ((count/(num*100))*4);
        System.out.println(gpa);
        System.out.println("Gpa is : " +gpa);

    }
}

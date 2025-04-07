package yogesh.assignment.Conditionals;
import java.util.Scanner;

public class Gpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many subject you have : ");
        int num = in.nextInt();
        int count = 0;
        while (num>=1){
            System.out.println("Enter The Marks: ");
            int mark = in.nextInt();
            count+=mark;
            num--;

        }
        float gpa =(float) (count/num)*4;
        System.out.println("Gpa is : "+gpa);

    }
}

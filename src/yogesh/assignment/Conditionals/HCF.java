package yogesh.assignment.Conditionals;
import  java.util.Scanner;
//Euclidean Algorithm

public class HCF {
    public static void main(String[] args) {
        System.out.println("Enter Two number  For Finding HCF : ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int rem;
        int count;

        System.out.println("Let`s Find Out HCF: ");
        if (num1>num2){
            count= num1/num2;
            rem = num1 % num2;
        }else {
            count = num2/num1;
            rem = num2%num1;
        }

    }
}

package yogesh.assignment.Conditionals;
import  java.util.Scanner;
//Euclidean Algorithm

public class HCF {
    public static void main(String[] args) {
        System.out.println("Enter Two number  For Finding HCF : ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int rem=num1;
        int count;

        System.out.println("Let`s Find Out HCF: ");
        if (num1>num2)
        {
            while (rem==0) {


                count = num1 / num2;
                System.out.println(count);
                rem = num1 % num2;
                System.out.println(rem);
                if (rem == 0) {
                    System.out.println("The Hcf is " + num2);
                } else {
                    num1 = num2;
                    num2 = rem;

                    count = num1 / num2;
                    rem = num1 % num2;



                }
            }



        }else {
            while (rem==0) {
                count = num1 / num2;
                rem = num1 % num2;
                if (rem == 0) {
                    System.out.println("The Hcf is " + num2);
                } else {
                    num1 = num2;
                    num2 = rem;

                    count = num1 / num2;
                    rem = num1 % num2;
                }
            }

        }



    }
}

//lets do it tommorrow sorry not today day after tommorow
import java.util.Scanner;

public class HCF{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int hcf = calculateHCF(num1, num2);

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }

    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
        //iam ver  but i promi
        // //se i will be there for you tommorow for sure
    }// i have to project to complete forntedn bofere 21st of this month os i will not be here anny more
}
//again we need to stop this coz we will do it lateron e

// Problem
//Take integer inputs till the user enters 0 and print the sum of all numbers

package yogesh.assignment.Conditionals;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is Game, oh. It won`t stop Until  You enter a magical number ");
        int count = 0;
        while (count>=0) {
            System.out.println(" Enter a number that comes to your mind : ");
            int num = in.nextInt();
            count+= num;
            if (num==0){
                break;
            }
        }

        System.out.println("You entered 0 so it is exiting.......");
        System.out.println("The total sum is : "+count);

    }
}

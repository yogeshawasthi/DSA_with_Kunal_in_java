package yogesh.assignment.Conditionals;
import java.util.Scanner;

public class Gamme {
    public static void main(String[] args) {
        System.out.println("Lets start game");
        Scanner in = new Scanner(System.in);
        int count = 0;
        while (count>=0){

            System.out.println("Enter a num");
            int num = in.nextInt();
            if(num>count){
                count=num;
            }
            if(num==0){
                break;
            }

        }
        System.out.println("Greastest number entered is  : "+count);

    }
}

// 2.26
package chapterTwo;
import java.util.Scanner;
public class Multiple {
    public static void main (String [] args){
        int num1;
        int num2;
        int multiple;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();

        multiple = num1 % num2;

        if (multiple == 0) {
            System.out.println(num1 + "is a multiple +num2");
        }
        else {
            System.out.println(num1 + "is not a multiple of +num2");
        }







    }
}

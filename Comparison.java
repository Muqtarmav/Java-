// 2.16
package chapterTwo;
import java.util.Scanner;
public class Comparison {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter first integer: ");
        number1 = input.nextInt();
        System.out.println("Enter second integer: ");
        number2 = input.nextInt();

        if(number1 > number2){
            System.out.println(number1 + "is larger than " +number2);
        }
        else if  (number1 == number2) {
            System.out.println(number1 + "is equal to " +number2);
        }
    }
}

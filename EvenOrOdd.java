// 2.25
package chapterTwo;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String [] args){
        int num1;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
       num1 = input.nextInt();

       double even = num1 % 2;

       if ( even == 0 ) {
           System.out.println("The number is an even");
       }
       else {
           System.out.println("The number is an odd");
       }












    }
}

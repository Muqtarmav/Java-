// 2.24

package chapterTwo;
import java.util.Scanner;
public class LargestSmallest {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1;
    int num2;
    int  num3;
    int num4;
    int num5;
    int largest;
    int smallest;

    System.out.println("Enter first number");
    num1 = input.nextInt();
    System.out.println("Enter second number");
    num2 = input.nextInt();
    System.out.println("Enter third number");
    num3 = input.nextInt();
    System.out.println("Enter fourth number");
    num4 = input.nextInt();
    System.out.println("Enter fifth number");
    num5 = input.nextInt();

    largest = num1;
    smallest = num1;



    if(num2 > largest) {
        largest = num2;
    }
    if(num3 > largest) {
        largest = num3;
    }
    if(num4  > largest) {
        largest = num4;
    }
    if(num5 > largest ) {
        largest = num5;
    }


    if (num2 < smallest);
    smallest = num2;
    if (num3 < smallest);
    smallest = num3;
    if (num4 < smallest);
    smallest = num4;
    if (num5 < smallest);
    smallest = num5;


    System.out.println("this is the largest number" +largest);
    System.out.println("this is the smallest number" +smallest);


}
}

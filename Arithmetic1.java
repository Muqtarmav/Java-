// 2.15
package chapterTwo;
import java.util.Scanner;
public class Arithmetic1 {
    public static void main(String[] args) {

    int num1;
    int num2;
    int sum;
    int multiple;
    int sub;
    double division;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first number");
    num1 =input.nextInt();

    System.out.println("Enter second number");
    num2 =input.nextInt();

    sum =num1 +num2;
    System.out.println("this is the sum " +sum);

    multiple =num1 *num2;
    System.out.println("this is the product" +multiple);

    sub = num1 - num2;
    System.out.println("this is the difference " +sub);

    division =num1 /num2;
    System.out.println("this is the quotient" +division);





    }
}


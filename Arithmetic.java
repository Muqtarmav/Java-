package chapterTwo;
import java.util.Scanner;
public class Arithmetic {
    public static void main (String [] args ) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int sum;
        int Avg;
        int multiply;
        int largest;
        int smallest;

        System.out.println("Enter first number");
        num1 = input.nextInt();
        System.out.println("Enter second number");
        num2 = input.nextInt();
        System.out.println("Enter third number");
        num3 = input.nextInt();
        sum = num1 + num2 + num3;
        System.out.print("this is the sum" + sum);
        Avg = num1 / num2 / num3;
        System.out.println("this is the average" + Avg);
        multiply = num1 * num2 * num3;
        System.out.println("this isn the product " + multiply);

        largest = num1;
        smallest = num1;

        if (num2 > largest)
            largest = num2;
        if (num3 > largest)
            largest = num3;
        if (num2 < smallest)
            smallest = num2;
        if (num3 < smallest)
            smallest = num3;


        System.out.println("this is the largest " +largest);
        System.out.println("this is the smallest" +smallest);

    }


    }






























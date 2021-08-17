// 2.32

package chapterTwo;
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int positive = 0;
        int negative = 0;
        int zero = 0;


        Scanner input = new Scanner(System.in);

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

        if ( num1 < 0){
            negative = negative + 1;
        }
        if (num2 < 0) {
            negative = negative + 1;
        }
        if (num3 < 0) {
            negative = negative + 1;
        }
        if (num4 < 0) {
            negative = negative + 1;
        }
        if (num5 < 0){
            negative = negative + 1;
        }

        if ( num1 > 0){
            positive = positive + 1;
        }
        if (num2 > 0) {
            positive = positive + 1;
        }
        if (num3 > 0) {
            positive = positive + 1;
        }
        if (num4 > 0) {
            positive = positive + 1;
        }
        if (num5 > 0){
            positive = positive + 1;
        }

        if ( num1 == 0){
            zero = zero + 1;
        }
        if (num2 == 0) {
            zero = zero + 1;
        }
        if (num3 == 0) {
            zero = zero + 1;
        }
        if (num4 == 0) {
            zero = zero + 1;
        }
        if (num5 == 0){
            zero = zero + 1;
        }

        System.out.println("this is the total negatives" +negative);
        System.out.println("this is the total positives" +positive);
        System.out.println("this is the total zeros " +zero);




    }



    }





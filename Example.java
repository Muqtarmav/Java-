package chapterTwo;
import java.util.Scanner;
public class Example {
    public static void main (String [] args){
int grade;
int total = 0;
int average = 0;


        Scanner input = new Scanner(System.in);


        for ( int count = 0; count <10; count ++) {
            System.out.println("Enter the grade");
            grade = input.nextInt();
            total = total + grade;
            average = average + 1;

            double getAverage = (double)total / average;
        }
        System.out.println("this is the total" +total);
        System.out.println("this is the average" +average);
    }
}

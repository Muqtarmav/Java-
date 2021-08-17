package chapterTwo;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius;
        double diameter;
        double circumference;
        double area;
        System.out.println("Enter a radius");
        radius = input.nextInt();

        diameter = 2*radius;
        circumference = 2*Math.PI*radius;
        area = Math.PI*radius*radius;

        System.out.println(diameter);
        System.out.println(circumference);
        System.out.println(area);

    }
}
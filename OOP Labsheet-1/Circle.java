/**
 * Write a description of Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.lang.Math;
public class Circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int diameter = 2 * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = Math.PI * diameter;
        System.out.printf("Diameter is %.1f", (double)diameter);
        System.out.println();
        System.out.printf("Area is %.2f", area);
        System.out.println();
        System.out.printf("Perimeter is %.2f", perimeter);
    }
}
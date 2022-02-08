
/**
 * Write a description of Temperature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Temperature {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = ((f - 32) * 5) / 9;
        System.out.println("The temperature " + f + " degrees Fahrenheit is " + c + " in degree Celcius");
    }
}
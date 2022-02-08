
/**
 * Write a description of UserInputEx1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class UserInputEx1 {
    public static void main(String args[]){
        int a, b;
        String s;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        s = sc.next();
        System.out.println("Values are: " + a + " " + b + " " + s);
    }
}

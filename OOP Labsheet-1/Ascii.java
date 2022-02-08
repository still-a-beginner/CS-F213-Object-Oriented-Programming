
/**
 * Write a description of Ascii here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Ascii {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        System.out.println("The ascii of " + input + " is " + (int)input);
    }
}

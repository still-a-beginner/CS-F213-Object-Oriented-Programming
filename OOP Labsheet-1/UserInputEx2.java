
/**
 * Write a description of UserInputEx2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class UserInputEx2 {
    public static void main(String args[]){
        int[] item = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            item[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++){
            System.out.println("Element at index " + i + " is " + item[i]);
        }
    }
}

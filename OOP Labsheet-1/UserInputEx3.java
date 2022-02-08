
/**
 * Write a description of UserInputEx3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class UserInputEx3 {
    public static void main(String args[]){
        int[] items = new int[5];
        for (int i = 0; i < 5; i++){
            items[i] = 10 * i;
        }
        Scanner sc = new Scanner(System.in);
        while (true){
            int input = sc.nextInt();
            if (input != -1){
            System.out.println("Number at index " + input + " is " + items[input]);}
            else{
            System.out.println("Bye");break;}
        }
    }
}

/**
 * Write a description of ClassMarks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ClassMarks {
    public static void main(String args[]){
        int marks[][] = new int[2][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 2; j++){
                marks[j][i] = j + i + 10;
            }
        }
        for (int j = 0; j < 2; j++)
        {
            if (j == 0){
            System.out.print("ID No ");
            }
            if (j == 1){
            System.out.print("Marks ");
            }
            for (int i = 0; i < 5; i++){
                System.out.print(marks[j][i] + " ");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        while (true){
            int input = sc.nextInt();
            if (input != -1){
                for (int i = 0; i < 5; i++){
                    if (marks[0][i] == input){
                        System.out.println("The marks of id no " + input + " is " + marks[1][i]);}
                }
            }
            else{
                System.out.println("Bye");
                break;
            }
        }
    }
}

/**
 * Write a description of TwoDArrayDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwoDArrayDemo {
    public static void main(String args[]){
        int id_marks[][] = new int[2][3];
        id_marks[0][0] = 101;
        id_marks[0][1] = 103;
        id_marks[0][2] = 107;
        id_marks[1][0] = 34;
        id_marks[1][1] = 67;
        id_marks[1][2] = 90;
        System.out.println("Printing 2D Array");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Element at [" + i + "][" + j + "] is " + id_marks[i][j]);
            }
        }
    }
}

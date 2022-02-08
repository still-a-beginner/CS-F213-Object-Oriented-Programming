
/**
 * Write a description of Example1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Example1 {
    public static void main(String argss[]){
        int a, first;
        float f;
        boolean b;
        int marks[] = new int[5];
        a = 5;
        b = true;
        f = 30.75f;
        first = 50;
        System.out.println("Assigning values to array locations");
        for (int x = 0; x < 5; x++){
            marks[x] = first;
            first = first + 5;
        }
        System.out.println("Values of integer a: " + a);
        System.out.println("Values of float f: " + f);
        System.out.println("Values of boolean b:" + b);
        System.out.println("Printing array elements");
        for (int x = 0; x < 5; x++){
            System.out.println("Values tored at index x: " + x + " is " + marks[x]);
        }
    }
}

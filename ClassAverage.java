/*
 * Name: Kennedy Keyes
 * Date: March 22, 2021
 * Name of Program: ClassAverage.java
 * Description: This program will solve the class average problem using 
counter-controlled iteration. 
 */
package classaverage;
import java.util.Scanner; // program uses class Scanner 

/**
 *
 * @author codingken
 */
public class ClassAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        
        // intialization phase 
        int total = 0; // initialize # of grade to be entered by the user
        int gradeCounter = 1; // initialize # of grade to be entered next
        
        // processing phase uses counter-controlled iteration
        while (gradeCounter <= 10) { // loop 10 times
            System.out.print("Please enter grade: "); // prompt
            int grade = input.nextInt(); // input next grade
            total = total + grade; // add grade to total 
            gradeCounter = gradeCounter + 1; // increment counter by 1
        }
        
        // termination phase 
        int average = total / 10; // integer division yields integer result
        
        // display total and average of grades
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }
}

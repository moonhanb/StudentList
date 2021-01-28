/*
 * Han Byul Moon
 * Student ID: 991 624 436
 */
package studentlist;

import java.util.Scanner; 
import content.Student; 

public class Main {

    
    public static void main(String[] args) {
        
        //changed array to 5
        Student[] studentList = new Student[5]; 
        
        Scanner input = new Scanner(System.in); 
        
        for (int i = 0; i < studentList.length; i++) {
            
            System.out.print("Enter the student's name: ");
            String name = input.nextLine(); 
            Student student = new Student(name); 
            
            studentList[i] = student; 
            //Han, Bill, Kris, Dino
        }
        
        System.out.println("\nPrinting the students:");
        
        String format = "The student's name is %s\n"; 
        
        for (Student student : studentList) {
            System.out.printf(format, student.getName()); 
        }
        
    }
    
}

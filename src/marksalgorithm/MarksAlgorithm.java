/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marksalgorithm;
import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dennis
 */
public class MarksAlgorithm {

    /**
     * @param args the command line arguments
     */
    
    public static List<Integer> finalMarksArray = new ArrayList<Integer>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        enterSubject();
        

    }
    
    public static void enterSubject(){
        Scanner input = new Scanner(System.in);
        String subjectMessage = "Enter Subject:";
        System.out.println(subjectMessage);
        List<String> subjects = new ArrayList<String>();
        subjects.add(subjectMessage);
        String subject = input.next();
        
       // System.out.println(subjects);
        marks();
      
    }
    
    public static void displayMarks(){
        
        System.out.println(finalMarksArray);
            
        
    }
    
    public static void marks(){
        Scanner input = new Scanner(System.in);
        String studentNumberMessage = "Enter the number of student:";
        System.out.println(studentNumberMessage);
        int studentNumber = input.nextInt();
        System.out.println("Student number is :"+studentNumber);

        
        List<Integer> marksArray = new ArrayList<Integer>();
        
       
        
        int i = 1;
        while (i<=studentNumber){
         String marksMessage = "Enter the marks of the Students:";
         System.out.println(marksMessage);
         int marks = input.nextInt();
         marksArray.add(marks);
         finalMarksArray.add(marks);
         i++;
        }
        System.out.println("Marks are:"+marksArray);
        Scanner params = new Scanner(System.in);
        String proceedMessage = "Do you want to proceed to another subject?";
        System.out.println(proceedMessage);
        String optionMessage = "Select Y for Yes and N for No";
        System.out.println(optionMessage);
        String choise = params.next();
        
       // Boolean next = true;
        if(choise.contains("Y")){
            String meso = "You are about to enter another subject";
            System.out.println(meso);
            enterSubject();
        }
        else{
            displayMarks();
        }
 
    }

    
}

package CODSOFT;
import java.util.*;
public class StudentGradeCalculator {
    
    public static void CalcMarks(){
        int sub1,sub2,sub3,sub4,sub5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in subject 1(out of 100): ");
         sub1 = sc.nextInt();
        if(sub1>100){
            System.out.println("invalid input");
        }
        
        System.out.println("Enter marks in subject 2(out of 100): ");
        sub2 = sc.nextInt();
        if(sub2>100){
            System.out.println("invalid input");
        }
        System.out.println("Enter marks in subject 3(out of 100): ");
         sub3 = sc.nextInt();
        if(sub3>100){
            System.out.println("invalid input");
        }
        System.out.println("Enter marks in subject 4(out of 100): ");
         sub4 = sc.nextInt();
        if(sub4>100){
            System.out.println("invalid input");
        }
        System.out.println("Enter marks in subject 5(out of 100): ");
         sub5 = sc.nextInt();
        if(sub5>100){
            System.out.println("invalid input");
        }
        int total_marks = sub1+sub2+sub3+sub4+sub5;
        System.out.println("Your total marks are: "+total_marks);
        int total_per = ((total_marks)/5);
        System.out.println("Your average percentage is: "+total_per);
        
    }
    public static void main(String[] args) {
        CalcMarks();
    }
}   

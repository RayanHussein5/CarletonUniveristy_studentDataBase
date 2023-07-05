package CarletonStudentDataBase;

import java.util.Scanner;

public class StudentDataBase {

    public static void main(String[] args){

        //Ask how many new Carleton students one wants to enroll
        System.out.print("Enter the number of new students to enroll in Carleton Univeristy\n");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] carletonStudents = new Student[numOfStudents];

        //create n number of new Carleton students
        for(int n=0; n<numOfStudents;n++){
            System.out.println("Student number " + (n+1));
            carletonStudents[n] = new Student();
            carletonStudents[n].enroll();
            carletonStudents[n].payTuition();
            System.out.println(carletonStudents[n].toString());
            
        } 
    }


}

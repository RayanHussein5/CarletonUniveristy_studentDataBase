package CarletonStudentDataBase;

import java.util.Scanner;


public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses="";
    private int tuitionBalance = 0;
    //a course equals 600 Canadian Dollars 
    private static int costOfCourse = 600; 
    private static int id= 10000; 
    
    //Constructor: prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please Enter your student first name");
        this.firstName = in.nextLine();

        System.out.println("Please Enter your student last name");
        this.lastName = in.nextLine();

        System.out.println("Enter your Carleton University year standing" + 
                            "\n1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior");
        this.gradeYear = in.nextInt();

        CarletonStudentId();
    }
    //Generate Student ID
    private void CarletonStudentId(){
        id++;
        this.studentID =  " " + id;
    }      
    //Enroll in courses
    public void enroll(){
        String course =null;
        while (course!="Q"){
            
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the course you want to Enroll in (Q to 'Quit'): ");
            course = in.nextLine();
            if(course.equals("Q")){
                break;
                }
            else if(course!=null){
            courses = courses + "\n  " + course;
            tuitionBalance = tuitionBalance + costOfCourse;}
            
        }
    }
    //View balance
    public String viewBalance(){
        return("Your tution Balance is: $" + tuitionBalance);
    }
    //Pay tuiton 
    public void payTuition(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your Payment: ");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment.\n"+  viewBalance());
       
        
    }
    //Show status 
    public String toString(){
        return "Name: " +firstName + " " + lastName + 
                "\nYear Standing: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }
}


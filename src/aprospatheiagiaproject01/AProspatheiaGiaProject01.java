/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprospatheiagiaproject01;

import classes.Assignment;
import classes.Course;
import classes.Crudable;
import classes.Human;
import classes.Student;
import classes.Trainer;
import java.awt.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Pan
 */
public class AProspatheiaGiaProject01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Human human = new Human("Kwstas Kwstakis");

        Student student = new Student("Vaggelis Vaggelakis");
        Student student1 = new Student("Giannis Giannakis");
        Student student2 = new Student("Giorgos Giorgakis");

        Trainer trainer = new Trainer("Iraklis Iraklakis");
        Trainer trainer1 = new Trainer("Petros Petrakis");
        Trainer trainer2 = new Trainer("Panos Panagiotakis");

        //Inheritance grouping μέσω του Person που είναι η superclass
        System.out.println("\nInheritance grouping");
        ArrayList<Human> inheritanceList = new ArrayList<>();

        inheritanceList.add(human);
        inheritanceList.add(student);
        inheritanceList.add(student1);
        inheritanceList.add(student2);
        inheritanceList.add(trainer);
        inheritanceList.add(trainer1);
        inheritanceList.add(trainer2);

        for (Human p : inheritanceList) {
            System.out.println(p);
        }

        //Interface grouping
        System.out.println("\nInterface grouping");
        Course course1 = new Course();
        Course course2 = new Course();
        course1.setFullname("My First Course");
        course2.setFullname("My Second Course");

        System.out.println("\nInterface grouping");
        Assignment assignment1 = new Assignment();
        Assignment assignment2 = new Assignment();
        assignment1.setAssignmentname(" First assignment");
        assignment2.setAssignmentname(" Second assignment");

//
//        //Εφόσον έχουν κοινό το Interface τα Person,Student,Instructor και Product
//        //φτιάχνω arraylist της interface
        ArrayList<Crudable> interfacesGrouping = new ArrayList<>();
        interfacesGrouping.add(human);
        interfacesGrouping.add(student);
        interfacesGrouping.add(student1);
        interfacesGrouping.add(student2);
        interfacesGrouping.add(trainer);
        interfacesGrouping.add(trainer1);
        interfacesGrouping.add(trainer2);
        interfacesGrouping.add(course1);
        interfacesGrouping.add(course2);
        interfacesGrouping.add(assignment1);
        interfacesGrouping.add(assignment2);

        for (Crudable c : interfacesGrouping) {
            System.out.println(c);
        }

//        //Association Example = Βάζω ότι σχέση θέλω στο sout
//        System.out.println("----------Association----------");
        System.out.println(trainer.getFullname() + " has as students: " + student.getFullname() + ", " + student1.getFullname());
        System.out.println(student2.getFullname() + " has as instructors: " + trainer2.getFullname() + " ," + trainer1.getFullname());

        System.out.println(student1.getFullname() + " has as instructor : " + trainer1.getFullname() + " ,Course : " + course1.getFullname() + " and assignment : " + assignment1.getAssignmentname());

//        //Aggregation Example -Έφτιαξα μια λίστα μέσα στον instructor που παίρνει μαθητές 
//        //και μέσω της getter και add προσθέτω τους μαθητές στον κάθε καθηγητή
//        System.out.println("----------Aggregation----------");
        trainer1.getStudents().add(student);
        trainer1.getStudents().add(student1);
        System.out.println("Trainer with name: " + trainer1.getFullname() + " has the following students: ");

        for (Student s : trainer1.getStudents()) {
            System.out.println(s.getFullname());
        }

    }

}

//        Scanner sc = new Scanner(System.in);
//        List<Student> myStudents= new ArrayList<Student>();
//        System.out.println("if you press 1 you will create student,If you press number 2 you ll print aaal students");
//        int menuChoise = sc.nextInt();
//        switch (menuChoise) {
//            case 1:
//                System.out.println("Please insert the name of student : ");
//                String name = sc.next();
//                System.out.println("give me the surname  of student : ");
//                String surName = sc.next();
//               Student st01 = new Student(fullname);
//                System.out.println(st01);
//                    myStudents.add(st01);
//                List<Student> Students = new ArrayList<Student>();         
//                        break;
//            case 2:
//                System.out.println("the students are : "+ myStudents);
//        }

////}

//}
//     String date = "14/07/1986";
//     String year = date.substring(6, 10);  int result = Integer.parseInt(year);
//     System.out.println(result);

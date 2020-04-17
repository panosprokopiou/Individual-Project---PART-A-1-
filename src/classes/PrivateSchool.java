/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Pan
 */
public class PrivateSchool {
    
    
    private String fullname;
    private List<Student> students;
    private List<Trainer> Trainers;
    
    
     public String getFullname() {
        return fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    
    public List<Student> getStudents() {
        return students;
    }
    
     public List<Trainer> getTrainers() {
        return Trainers;
    }
    
     
        private Student studentFromCmd (){
        System.out.println("You want to add your own student ok");
        System.out.println("Give student's name");
        Scanner sc = new Scanner(System.in);
        String studentName = sc.nextLine();
        return new Student(studentName);
    } 
     
     private Trainer trainerFromCmd (){
        System.out.println("You want to add your own trainer ok");
        System.out.println("Give trainer's name");
        Scanner sc = new Scanner(System.in);
        String trainerName = sc.nextLine();
        return new Trainer(trainerName);
    }
    
        
    public PrivateSchool() {
        this.students = new ArrayList<>();
        this.Trainers = new ArrayList<>();
        this.students.add(studentFromCmd());
        this.students.add(new Student("Batman Batmanakis"));
        this.Trainers.add(trainerFromCmd());
        this.Trainers.add(new Trainer("Robin Robakis"));
    }
}

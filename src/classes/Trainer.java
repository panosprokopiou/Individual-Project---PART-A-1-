/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.List;
import java.util.*;

/**
 *
 * @author Pan
 */
public class Trainer extends Human {

    
  private java.util.List<Student> students = new ArrayList<>();  
 //   private List<Student> students = new ArrayList<>();

   public java.util.List<Student> getStudents() { 
   // public List<Student> getStudents() {
        return students;
    }
    
public void setStudents(java.util.List<Student> students) {
   // public void setStudents(List<Student> students) {
        this.students = students;
    
    
}

    public Trainer(String fullname) {
        super(fullname);
    }

 
    
    
    
    @Override
    public String toString() {
        return "Trainer: " + getFullname();
    }

    @Override
    public void delete() {
        System.out.println("The trainer with the name " + getFullname() + "has been deleted.");
    }

    @Override
    public void update() {
        System.out.println("The trainer with the name " + getFullname() + "has been updated.");
    }

    @Override
    public void read() {
        System.out.println("The trainer's details are: " + getFullname());
    }

    @Override
    public void create() {
        System.out.println("The trainer with the name " + getFullname() + "has been created.");
    }

}
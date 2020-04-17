/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Pan
 */
public class Student extends Human {

    public Student(String fullname) {
        super(fullname);
    }

    @Override
    public String toString() {
        return "Student: " + getFullname();
    }

    @Override
    public void create() {
        System.out.println("The student with the name " + getFullname() + "has been created.");
    }

    @Override
    public void read() {
        System.out.println("The student's details are: " + getFullname());
    }

    @Override
    public void update() {
        System.out.println("The student with the name " + getFullname() + "has been updated.");
    }

    @Override
    public void delete() {
        System.out.println("The student with the name " + getFullname() + "has been deleted.");
    }

}

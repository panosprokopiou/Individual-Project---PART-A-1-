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
public class Course implements Crudable {

    private String fullname;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public void create() {
        System.out.println("The course with the name " + getFullname() + "has been created.");
    }

    @Override
    public void read() {
        System.out.println("The course's details are: " + getFullname());
    }

    @Override
    public void update() {
        System.out.println("The course with the name " + getFullname() + "has been updated.");
    }

    @Override
    public void delete() {
        System.out.println("The course with the name " + getFullname() + "has been deleted.");
    }

    @Override
    public String toString() {
        return "Course: " + this.fullname;
    }

}

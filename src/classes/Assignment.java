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
public class Assignment implements Crudable {

    private String Assignmentname;

    public String getAssignmentname() {
        return Assignmentname;
    }

    public void setAssignmentname(String Assignmentname) {
        this.Assignmentname = Assignmentname;
    }

    @Override
    public void create() {
        System.out.println("The product with the name " + getAssignmentname() + "has been created.");
    }

    @Override
    public void read() {
        System.out.println("The product's details are: " + getAssignmentname());
    }

    @Override
    public void update() {
        System.out.println("The product with the name " + getAssignmentname() + "has been updated.");
    }

    @Override
    public void delete() {
        System.out.println("The product with the name " + getAssignmentname() + "has been deleted.");
    }

    @Override
    public String toString() {
        return "Assignment: " + this.Assignmentname;
    }

}

//
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void create() {
//        System.out.println("The product with the name " + getName() + "has been created.");
//    }
//
//    @Override
//    public void read() {
//        System.out.println("The product's details are: " + getName());
//    }
//
//    @Override
//    public void update() {
//        System.out.println("The product with the name " + getName() + "has been updated.");
//    }
//
//    @Override
//    public void delete() {
//        System.out.println("The product with the name " + getName() + "has been deleted.");
//    }
//
//    @Override
//    public String toString() {
//        return "Product: " + this.name;
//    }
//
//}

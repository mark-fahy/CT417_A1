/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CT417_Assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mark Fahy
 */
public class Student {    
    
    private String name;
    private int age;
    private String course;
    private String dateOfBirth;
    private int id;
    private String userName;
    private List modules;

    /**
     * @param args the command line arguments
     */
    public Student(String name, int age, String course, String dateOfBirth, int id, List modules) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        modules = new ArrayList();
    }
    
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getCourse() {
        return this.course;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public String getDOB() {
        return this.dateOfBirth;
    }
    public void setDOB(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
     public int getId() {
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setUsername(String name, String dateOfBirth){
        this.userName = name+dateOfBirth; //generate the student’s username by concanteating their name and age
    }
    public String getUsername(){
        return this.userName;    
    }
    
    public static void main (String[] args){
        
    }
}

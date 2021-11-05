/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CT417_Assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mark Fahy
 */
public class CourseProgramme {
    
    private String courseName;
    private List modules;
    private List studentsEnrolled;
    //private LocalDate startDate; Couldn't get this to work despite adding the dependency to the gradle build file
    //private LocalDate endDate;
    public CourseProgramme(String courseName, List modules, List studentsEnrolled){
        this.courseName=courseName;
        modules=new ArrayList();
        studentsEnrolled=new ArrayList();
    
    }
    public String getCourseName() {
        return this.courseName;
    }
     public void setCourseName(String courseName){
        this.courseName=courseName;
    }
}

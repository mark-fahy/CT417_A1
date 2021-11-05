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
public class Module {
    
    private String moduleName;
    private String moduleId;
    private List students;
    private List associatedCourses;
    
    public Module(String moduleName, String moduleId, List students, List associatedCourses) {
        this.moduleName=moduleName;
        this.moduleId=moduleId;
        students = new ArrayList();
        associatedCourses = new ArrayList();    
    }
     public String getModuleName() {
        return this.moduleName;
    }
     public void setModuleName(String moduleName){
        this.moduleName=moduleName;
    }
      public String getModuleId() {
        return this.moduleId;
    }
     public void setModuleId(String moduleId){
        this.moduleId=moduleId;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Student;

/**
 *
 * @author Mayur
 */
public class ShelterAllocateWorkRequest extends WorkRequest{
    private Student student;
    //private String testResult;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
   
    
   
   @Override
    public String toString() {
        return getStudent()!=null? getStudent().getName(): "No name";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Student;

/**
 *
 * @author kharc
 */
public class BackgroundCheckWorkRequest extends WorkRequest{
    private Student student;
    private ShelterAllocateWorkRequest shelterAllocWorkReq;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ShelterAllocateWorkRequest getShelterAllocWorkReq() {
        return shelterAllocWorkReq;
    }

    public void setShelterAllocWorkReq(ShelterAllocateWorkRequest shelterAllocWorkReq) {
        this.shelterAllocWorkReq = shelterAllocWorkReq;
    }
    
    @Override
    public String toString() {
        return getStudent()!=null? getStudent().getName(): "No name";
    }
 
}

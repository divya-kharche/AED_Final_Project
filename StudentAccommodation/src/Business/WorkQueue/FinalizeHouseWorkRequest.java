/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Student;
import java.util.List;

/**
 *
 * @author raunak
 */
public class FinalizeHouseWorkRequest extends WorkRequest{
    
    private Student student;
    private ShelterAllocateWorkRequest shelterAllocWorkReq;
    private List<List<String>> addressesForStudent;
    private List<String> schemes;

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

    public List<List<String>> getAddressesForStudent() {
        return addressesForStudent;
    }

    public void setAddressesForStudent(List<List<String>> addressesForStudent) {
        this.addressesForStudent = addressesForStudent;
    }

    public List<String> getSchemes() {
        return schemes;
    }

    public void setSchemes(List<String> schemes) {
        this.schemes = schemes;
    }
    
    @Override
    public String toString() {
        return getStudent()!=null? getStudent().getName(): "No name";
    }
    
}

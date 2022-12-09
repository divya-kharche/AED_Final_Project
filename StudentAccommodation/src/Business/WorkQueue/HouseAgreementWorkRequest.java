/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Student;
import java.util.List;

/**
 *
 * @author kharc
 */
public class HouseAgreementWorkRequest extends WorkRequest {

    private Student student;
    private ShelterAllocateWorkRequest shelterAllocWorkReq;
    private List<String> addressForStudent;
    private String scheme;

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

    public List<String> getAddressForStudent() {
        return addressForStudent;
    }

    public void setAddressForStudent(List<String> addressForStudent) {
        this.addressForStudent = addressForStudent;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    @Override
    public String toString() {
        return getStudent() != null ? getStudent().getName() : "No name";
    }

}

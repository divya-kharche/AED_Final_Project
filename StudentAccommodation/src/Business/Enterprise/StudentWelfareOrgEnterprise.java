/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kharc
 */
public class StudentWelfareOrgEnterprise extends Enterprise {
    
    public StudentWelfareOrgEnterprise(String name){
        super(name,EnterpriseType.StudentWelfareOrg);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public ArrayList<Type> getSupportedOrganizationType() {
        
         ArrayList<Type> types = new ArrayList<>();
         types.add(Type.Volunteer);
         
         return types;
    }
    
}

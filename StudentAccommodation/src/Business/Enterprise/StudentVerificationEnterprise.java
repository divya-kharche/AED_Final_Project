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
public class StudentVerificationEnterprise extends Enterprise {
    
    public StudentVerificationEnterprise(String name){
        super(name,EnterpriseType.StudentVerification);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public ArrayList<Type> getSupportedOrganizationType() {
        
         ArrayList<Type> types = new ArrayList<>();
         types.add(Type.BackgroundCheck);
         types.add(Type.FinancialCheck);
         return types;
    }
    
}

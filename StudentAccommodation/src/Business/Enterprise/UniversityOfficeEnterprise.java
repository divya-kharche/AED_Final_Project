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
public class UniversityOfficeEnterprise extends Enterprise {
    
    public UniversityOfficeEnterprise(String name){
        super(name,EnterpriseType.UniversityOffice);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public ArrayList<Type> getSupportedOrganizationType() {
        
         ArrayList<Type> types = new ArrayList<>();
         types.add(Type.FinalizeHousing);
         types.add(Type.AccomodationAgreement);
         return types;
    }
}

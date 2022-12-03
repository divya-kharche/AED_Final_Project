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
 * @author Mayur
 */
public class HostelEnterprise extends Enterprise {
    
    public HostelEnterprise(String name){
        super(name,EnterpriseType.Hostel);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public ArrayList<Type> getSupportedOrganizationType() {
        
         ArrayList<Type> types = new ArrayList<>();
         types.add(Type.HostelAllocation);
         types.add(Type.HostelFacilitation);
         return types;
    }
    
}

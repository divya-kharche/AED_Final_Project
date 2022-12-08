/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BackgroundChecker;
import Business.Role.Role;
import Business.Role.HostelAllocater;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public class HostelAllocationOrg extends Organization{

    public HostelAllocationOrg() {
        super(Organization.Type.HostelAllocation.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HostelAllocater());
        return roles;
    }
     
}
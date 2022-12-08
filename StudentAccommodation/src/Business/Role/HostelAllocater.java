/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.HostelAllocationOrg;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HostelAllocatorRole.HostelAllocatorWorkArea;

/**
 *
 * @author kharc
 */
public class HostelAllocater extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HostelAllocatorWorkArea(userProcessContainer, account, (HostelAllocationOrg)organization, enterprise, business);
    }
    
    public String toString() {
        return "Shelter Allocator";
    }
    
    
}

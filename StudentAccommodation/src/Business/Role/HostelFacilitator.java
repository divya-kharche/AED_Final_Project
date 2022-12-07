/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.HostelFacilitationOrg;
import Business.Organization.VolunteerOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HostelFacilitatorRole.HostelFacilitatorWorkArea;

/**
 *
 * @author kharc
 */
public class HostelFacilitator extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HostelFacilitatorWorkArea(userProcessContainer, account, (HostelFacilitationOrg)organization, enterprise, business);
    }
    
    public String toString() {
        return "Shelter Facilitator";
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.BackgroundCheckOrg;
import Business.Organization.Organization;
import Business.Organization.VolunteerOrganization;
import Business.UserAccount.UserAccount;
import userinterface.Verification.BackgroundCheckWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.VolunteerRole.VolunteerWorkArea;

/**
 *
 * @author kharc
 */
public class Volunteer extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VolunteerWorkArea(userProcessContainer, account, (VolunteerOrganization)organization, enterprise, business);
    }
    
    public String toString() {
        return "Volunteer";
    }
    
}

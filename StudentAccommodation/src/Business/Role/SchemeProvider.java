/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.*;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SchemeProvision.SchemeProvisionWorkAreaJPanel;

/**
 *
 * @author kharc
 */
public class SchemeProvider extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new SchemeProvisionWorkAreaJPanel(userProcessContainer, account, (SchemeProvisionOrg) organization, business, enterprise);
    }
    
    public String toString() {
        return "Scheme Provider";
    }
    
}

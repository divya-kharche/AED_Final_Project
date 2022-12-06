/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FinancialCheckOrg;
import Business.Organization.AccomodationOptionsOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AccomodationOptions.AccomodationOptionsWorkArea;

/**
 *
 * @author kharc
 */
public class AccomodationOptionsProvider extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AccomodationOptionsWorkArea(userProcessContainer, account, (AccomodationOptionsOrg) organization, business, enterprise);
    }
    
    public String toString() {
        return "Housing Options Provider";
    }
    
}

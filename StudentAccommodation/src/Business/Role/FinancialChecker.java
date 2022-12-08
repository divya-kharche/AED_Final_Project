/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FinancialCheckOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.FinancialCheckerRole.FinancialCheckWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author kharc
 */
public class FinancialChecker extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FinancialCheckWorkAreaJPanel(userProcessContainer, account, (FinancialCheckOrg) organization, business, enterprise);
    }
    
    public String toString() {
        return "Financial Checker";
    }
    
}

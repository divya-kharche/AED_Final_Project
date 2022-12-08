/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FinancialChecker;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public class FinancialCheckOrg extends Organization{

    public FinancialCheckOrg() {
        super(Organization.Type.FinancialCheck.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FinancialChecker());
        return roles;
    }
     
   
    
    
}

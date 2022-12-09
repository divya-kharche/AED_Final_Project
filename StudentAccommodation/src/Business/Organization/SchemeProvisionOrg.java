/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.*;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public class SchemeProvisionOrg extends Organization{

    public SchemeProvisionOrg() {
        super(Organization.Type.SchemeProvision.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SchemeProvider());
        return roles;
    }
}

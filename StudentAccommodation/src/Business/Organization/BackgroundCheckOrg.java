/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BackgroundChecker;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public class BackgroundCheckOrg extends Organization{

    public BackgroundCheckOrg() {
        super(Organization.Type.BackgroundCheck.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BackgroundChecker());
        return roles;
    }
     
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FinancialChecker;
import Business.Role.AccomodationOptionsProvider;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public class AccomodationOptionsOrg extends Organization{

    public AccomodationOptionsOrg() {
        super(Organization.Type.RoomOptions.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AccomodationOptionsProvider());
        return roles;
    }
}

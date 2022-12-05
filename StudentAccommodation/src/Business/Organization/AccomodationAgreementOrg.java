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
public class AccomodationAgreementOrg extends Organization{

    public AccomodationAgreementOrg() {
        super(Organization.Type.AccomodationAgreement.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AccomodationAgreementCreator());
        return roles;
    }
}

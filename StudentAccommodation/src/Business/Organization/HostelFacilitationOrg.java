/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.HostelFacilitator;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public class HostelFacilitationOrg extends Organization{

    public HostelFacilitationOrg() {
        super(Organization.Type.HostelFacilitation.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HostelFacilitator());
        return roles;
    }
     
}
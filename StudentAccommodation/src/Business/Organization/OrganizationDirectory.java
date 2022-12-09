/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Mayur
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.BackgroundCheck.getValue())) {
            organization = new BackgroundCheckOrg();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.FinancialCheck.getValue())) {
            organization = new FinancialCheckOrg();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Volunteer.getValue())) {
            organization = new VolunteerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HostelAllocation.getValue())) {
            organization = new HostelAllocationOrg();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HostelFacilitation.getValue())) {
            organization = new HostelFacilitationOrg();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.RoomOptions.getValue())) {
            organization = new AccomodationOptionsOrg();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.SchemeProvision.getValue())) {
            organization = new SchemeProvisionOrg();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.FinalizeHousing.getValue())) {
            organization = new FinalizeRoomOrg();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.AccomodationAgreement.getValue())) {
            organization = new AccomodationAgreementOrg();
            organizationList.add(organization);
        }
        return organization;
    }
}

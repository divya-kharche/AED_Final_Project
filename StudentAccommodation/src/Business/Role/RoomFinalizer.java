/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FinalizeRoomOrg;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FinalizeRoom.FinalizeRoomWorkArea;

/**
 *
 * @author kharc
 */
public class RoomFinalizer extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FinalizeRoomWorkArea(userProcessContainer, account, (FinalizeRoomOrg) organization, business, enterprise);
    }
    
    public String toString() {
        return "Housing Finalizer";
    }
    
}

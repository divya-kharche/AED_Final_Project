package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdmin;
import Business.UserAccount.UserAccount;

/**
 *
 * @author kharc
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdmin());
        
        return system;
    }
    
}

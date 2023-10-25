/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Dell
 */
public class Users {
   private String userID;
   private String userName;
   private String userEmail;
   private boolean userStatus;
   private String roleID;
   private String password;
   private String roleName;
   private String statusText;

    public Users() {
    }

    public Users(String userID, String userName, String userEmail, boolean userStatus, String roleID, String password, String roleName, String statusText) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userStatus = userStatus;
        this.roleID = roleID;
        this.password = password;
        this.roleName = roleName;
        this.statusText = statusText;
    }
    
    

    public Users(String userID, String userName, String userEmail, boolean userStatus, String roleID, String password) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userStatus = userStatus;
        this.roleID = roleID;
        this.password = password;
    }

    public Users(String userID, String userName, String userEmail, boolean userStatus, String roleID, String password, String roleName) {
        this.userID = userID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userStatus = userStatus;
        this.roleID = roleID;
        this.password = password;
        this.roleName = roleName;
    }

    public Users(String userName, String userEmail, boolean userStatus, String roleID, String password) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userStatus = userStatus;
        this.roleID = roleID;
        this.password = password;
    }
    
    
    
    

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public boolean isUserStatus() {
        return userStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }

    public String getRoleID() {
        return roleID;
    }

    public void setRoleID(String roleID) {
        this.roleID = roleID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }
    
    
   
   
}

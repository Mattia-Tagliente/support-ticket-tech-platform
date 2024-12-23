package com.example.SupportTicketTechPlatform.dto;

import java.sql.Timestamp;

public class NewUserDto {

    private String username;
    private String userName;
    private String userSurname;
    private String userEmail;
    private String fiscalCode;
    private String userPassword;
    private String phoneNumber;
    private Timestamp registrationDate;
    private String customerVat;
    private int adminRole;
    
    public NewUserDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setCodiceFiscale(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }


    public String getCustomerVat() {
        return customerVat;
    }

    public void setCustomerId(String customerVat) {
        this.customerVat = customerVat;
    }

    public int getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(int adminRole) {
        this.adminRole = adminRole;
    }

    

}

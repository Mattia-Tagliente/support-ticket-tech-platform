package com.example.SupportTicketTechPlatform.dto;

public class StatusTypeDto {

    int statusId;
    String statusName;
    

    public StatusTypeDto() {
    }
    

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }


    public int getStatusId() {
        return statusId;
    }


    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
    

}

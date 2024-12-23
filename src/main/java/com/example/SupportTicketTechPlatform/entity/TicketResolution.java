package com.example.SupportTicketTechPlatform.entity;


import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ticket_resolution")
public class TicketResolution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="resolution_id")
    private int resolutionId;

    @ManyToOne
    @JoinColumn(name = "ticket_id", nullable = false)
    private Ticket ticket;

    @Column(name = "resolution_note", nullable = false)
    private String resolutionNote;

    @Column(name = "note_date", nullable = false)
    private Timestamp noteDate;

    @ManyToOne
    @JoinColumn(name = "note_author", nullable = false)
    private User admin;

    public TicketResolution() {
    }

    public int getResolutionId() {
        return resolutionId;
    }

    public void setResolutionId(int resolutionId) {
        this.resolutionId = resolutionId;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getResolutionNote() {
        return resolutionNote;
    }

    public void setResolutionNote(String resolutionNote) {
        this.resolutionNote = resolutionNote;
    }

    public Timestamp getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(Timestamp noteDate) {
        this.noteDate = noteDate;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    

}

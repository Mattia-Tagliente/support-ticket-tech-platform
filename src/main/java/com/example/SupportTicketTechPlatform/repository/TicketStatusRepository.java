package com.example.SupportTicketTechPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SupportTicketTechPlatform.entity.TicketStatusId;

public interface TicketStatusRepository extends JpaRepository<TicketStatusId, Integer>{

}

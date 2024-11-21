package com.portfolio.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.model.ContactMessage;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}

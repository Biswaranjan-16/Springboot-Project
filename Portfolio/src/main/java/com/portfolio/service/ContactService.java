package com.portfolio.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.model.ContactMessage;
import com.portfolio.repo.ContactMessageRepository;

@Service
public class ContactService {
    @Autowired
    private ContactMessageRepository contactMessageRepository;

    public void saveMessage(ContactMessage message) {
        contactMessageRepository.save(message);
    }
}


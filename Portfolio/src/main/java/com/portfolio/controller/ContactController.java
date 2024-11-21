package com.portfolio.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.portfolio.model.ContactMessage;
import com.portfolio.service.ContactService;

@Controller
public class ContactController {
    @Autowired
    private ContactService contactService;

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @PostMapping("/contact")
    public String submitContact(ContactMessage message) {
        contactService.saveMessage(message);
        return "redirect:/contact";
    }
}

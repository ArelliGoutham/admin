package com.hospital.admin.controller;

import com.hospital.admin.entity.Admin;
import com.hospital.admin.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    private AdminService service;

    @PostMapping(value = "/admin/{id}")
    public ResponseEntity<Admin> validateAdmin(@PathVariable int id) {
        if (service.validateAdmin(id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}

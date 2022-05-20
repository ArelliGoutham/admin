package com.hospital.admin.service;

import com.hospital.admin.entity.Admin;
import com.hospital.admin.repository.AdminRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepo repo;

    public boolean validateAdmin(int id) {
        Admin admin = new Admin();
        try {
            admin = repo.getById(id);
            System.out.println(admin.getId());
            System.out.println(admin.getName());

            return true;
        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }

    }
}

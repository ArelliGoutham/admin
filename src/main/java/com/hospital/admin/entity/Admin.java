package com.hospital.admin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NonNull;

@Entity
public class Admin {

    @Id
    @GeneratedValue
    private int id;
    @NonNull
    private String name;

    public Admin() {
    }

    public Admin(@NonNull String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Admin [id=" + id + ", name=" + name + "]";
    }

}

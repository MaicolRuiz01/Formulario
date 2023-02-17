package com.example.formulario;

public class User {

    private String name;
    private String fech;
    private String phone;
    private String email;
    private String description;

    
    public User(String name, String fech, String phone, String email, String description) {
        this.name = name;
        this.fech = fech;
        this.phone = phone;
        this.email = email;
        this.description = description;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFech() {
        return fech;
    }

    public void setFech(String fech) {
        this.fech = fech;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

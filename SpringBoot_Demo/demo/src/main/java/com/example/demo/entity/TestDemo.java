package com.example.demo.entity;

public class TestDemo {
    private Integer id;

    private String magicId;

    private String firstName;

    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMagicId() {
        return magicId;
    }

    public void setMagicId(String magicId) {
        this.magicId = magicId == null ? null : magicId.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }
}
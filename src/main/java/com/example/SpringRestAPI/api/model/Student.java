package com.example.SpringRestAPI.api.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    public long getStudentId() {
        return this.studentId;
    }
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

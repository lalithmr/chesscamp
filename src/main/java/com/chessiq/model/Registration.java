package com.chessiq.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "registration")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Student name is required")
    @Column(name = "student_name")
    private String studentName;

    @Min(value = 6, message = "Age must be at least 6")
    @Max(value = 20, message = "Age must be 20 or below")
    private int age;

    @NotBlank(message = "Parent name is required")
    @Column(name = "parent_name")
    private String parentName;

    @NotBlank(message = "Phone is required")
    @Pattern(regexp = "\\d{10}", message = "Phone must be 10 digits")
    private String phone;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email")
    private String email;

    @NotBlank(message = "Level is required")
    private String level;

    @NotBlank(message = "Batch is required")
    private String batch;

    @NotBlank(message = "Please specify whether the student has a chess set")
    @Column(name = "has_chess_set")
    private String hasChessSet;

    @Column(name = "needs_premium_chess_set")
    private String needsPremiumChessSet;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getHasChessSet() {
        return hasChessSet;
    }

    public void setHasChessSet(String hasChessSet) {
        this.hasChessSet = hasChessSet;
    }

    public String getNeedsPremiumChessSet() {
        return needsPremiumChessSet;
    }

    public void setNeedsPremiumChessSet(String needsPremiumChessSet) {
        this.needsPremiumChessSet = needsPremiumChessSet;
    }
}

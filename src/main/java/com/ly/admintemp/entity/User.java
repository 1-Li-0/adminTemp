package com.ly.admintemp.entity;

import java.util.Objects;

public class User {
    Integer id;
    String username;
    String password;
    Integer sex;
    String email;
    String phone;
    Integer member;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(sex, user.sex) && Objects.equals(email, user.email) && Objects.equals(phone, user.phone) && Objects.equals(member, user.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, sex, email, phone, member);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", member=" + member +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }
}

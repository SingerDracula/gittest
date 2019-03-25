package com.itheima.entity;

public class User {
    private int id;
    private String name;
    private String sex;
    private int number;
    private String address;

    public User(int id, String name, String sex, int number, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.number = number;
        this.address = address;
    }

    public User() {

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

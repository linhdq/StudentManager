package com.example.mrbom.studentmanager;

/**
 * Created by 1918 on 11-Jul-16.
 */
public class PersonInfo {

    private String name;
    private String age;
    private String phone;
    private String address;
    private String gender;

    public PersonInfo(String name, String age, String phone, String address, String gender) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
}

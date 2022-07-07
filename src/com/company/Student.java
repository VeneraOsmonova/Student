package com.company;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String vName){
        name = vName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 90 || age < 0) {
            System.err.println("tuura jash beriniz");
        } else {
            this.age = age;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}





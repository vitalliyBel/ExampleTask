package com.company;

public class Human {
    private String name;
    private Integer age;
    private String id;
    private String surname;

    public Human(){}

    public Human (String name, Integer age, String id, String surname){

        this.name = name;
        this.age = age;
        this.id = id;
        this.surname = surname;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public  String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

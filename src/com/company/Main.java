package com.company;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Jhon1", 15, "1", "Smith1"));
        humans.add(new Human("Jhon2", 17, "2", "Smith2"));
        humans.add(new Human("Jhon3", 25, "3", "Smith3"));
        humans.add(new Human("Jhon4", 31, "4", "Smith4"));
        humans.add(new Human("Jhon5", 18, "5", "Smith5"));
        humans.add(new Human("Jhon6", 14, "6", "Smith6"));
        humans.add(new Human("Jhon7", 49, "7", "Smith7"));


        Map<String, List<String>> mapOne = humans.stream()
                .peek(human -> human.setAge(human.getAge() + 1))
                .filter(human -> human.getAge() >= 18)
                .collect(Collectors.toMap(Human::getId, human -> Arrays.asList(human.getName(),human.getSurname())));

        System.out.println(mapOne);


        Map<String, String> mapTwo = humans.stream()
                .peek(human -> human.setAge(human.getAge() + 1))
                .filter(human -> human.getAge() >= 18)
                .collect(Collectors.toMap(Human::getId, human -> human.getName()+human.getSurname()));

        System.out.println(mapTwo);



        }
    }




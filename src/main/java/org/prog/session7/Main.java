package org.prog.session7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.*;

//TODO: Write collection where each unique phone may have any number of non-unique contact names

public class Main {

    public static void main(String[] args) {
        //One person may own any number of unique cars
        Map<String, Set<Car>> carOwners = new HashMap<>();
        carOwners.put("John", new HashSet<>());
        carOwners.put("Bob", new HashSet<>());

        carOwners.get("John").add(generateCar("red", "00001"));
        carOwners.get("John").add(generateCar("blue", "00002"));

        carOwners.get("Bob").add(generateCar("green", "00003"));
        carOwners.get("Bob").add(generateCar("yellow", "00004"));

        Map<Phone, List<String>> phoneBook = new HashMap<>();

        Phone phone1 = generatePhone("111111");
        Phone phone2 = generatePhone("222222");

        phoneBook.put(phone1, new ArrayList<>());
        phoneBook.put(phone2, new ArrayList<>());

        phoneBook.get(phone1).add("John");
        phoneBook.get(phone1).add("Bob");
        phoneBook.get(phone1).add("John");

        phoneBook.get(phone2).add("Alice");
        phoneBook.get(phone2).add("Mike");

        System.out.println(phoneBook);
    }

    public static Car generateCar(String color, String plateNumber) {
        Car car = new Car();
        car.color = color;
        car.plateNumber = plateNumber;
        return car;
    }
        public static Phone generatePhone(String number) {

            Phone phone = new Phone();
            phone.number = number;

            return phone;
        }
    }


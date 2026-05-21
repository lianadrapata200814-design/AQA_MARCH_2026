package org.prog.session4;

public class PhoneShop {


    public static Phone buyPhone(String brand, String color) {

        if (brand.equalsIgnoreCase("iphone")) {
            System.out.println("iPhone is not available");
            return null;
        }

        if (color.equalsIgnoreCase("black")) {
            System.out.println("Black phones are not available");
            return null;
        }

        Phone phone = new Phone();
        phone.brand = brand;
        phone.color = color;

        return phone;
    }
}
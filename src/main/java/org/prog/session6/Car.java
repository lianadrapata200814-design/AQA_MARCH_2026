package org.prog.session6;

import java.util.Objects;

public class Car {

    public String color;
    public String brand;
    public String plateNumber;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
//            if (color == null) {
//                return car.color == null;
//            } else {
//                return color.equals(car.color);
//            }
            if (brand == null || color == null) {
                throw new RuntimeException("oops, phone has no brand or color!");
            }

            return Objects.equals(car.color, this.color) &&
                    Objects.equals(car.brand, this.brand);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color + plateNumber);
    }

    @Override
    public String toString() {
        return "Car{" + "color=" + color + ", plateNumber=" + plateNumber + '}';
    }
}

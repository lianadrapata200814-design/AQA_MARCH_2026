package org.prog.session7;

import java.util.Objects;

public class Phone {

    public String number;

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Phone) {

            Phone phone = (Phone) obj;

            return Objects.equals(phone.number, this.number);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                '}';
    }
}

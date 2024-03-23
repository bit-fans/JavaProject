package com.manba.www;

import java.util.Objects;

public class Person {
    public String neme;

    public Person() {

    }

    public Person(String neme) {
        this.neme = neme;
    }

    @Override
    public boolean equals(Object obj) {
       return this.neme.equals(((Person)obj).neme);

    }

    @Override
    public int hashCode() {
        return Objects.hash(neme);
    }

    @Override
    public String toString() {
        return "Person{" +
                "neme='" + neme + '\'' +
                '}';
    }
}

package ru.maxvagan.course1.lesson1_10;

import java.util.Objects;

public class clsAuthor {
    private String firstName;
    private String secondName;

    public clsAuthor(String inp1Name, String inp2Name) {
        firstName = inp1Name;
        secondName = inp2Name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setFirstName(String inpName) {
        firstName = inpName;
    }

    public void setSecondName(String inpSurName) {
        secondName = inpSurName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof clsAuthor)) return false;
        clsAuthor author = (clsAuthor) o;
        return getFirstName().equals(author.getFirstName()) && getSecondName().equals(author.getSecondName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getSecondName());
    }

    @Override
    public String toString() {
        return "clsAuthor{" +
                "firstName=\"" + firstName + "\"" +
                ", secondName=\"" + secondName + "\"" +
                "}";
    }
}

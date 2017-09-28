package model;

import Enums.AvailabilityStatus;

public abstract class Human
{
    private String firstName;
    private String lastName;

    public Human(String firstName, String lname) {
        this.firstName = firstName;
        lastName = lname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public abstract void doActivity();


}

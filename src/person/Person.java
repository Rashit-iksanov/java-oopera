package person;

import java.util.Objects;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(Gender gender, String name, String surname) {
        this.name = name;
        this.gender = gender;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


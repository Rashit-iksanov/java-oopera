public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    public Person(Gender gender, String name, String surname) {
        this.name = name;
        this.gender = gender;
        this.surname = surname;
    }

    public String getName() { return getName(); }
    public String getSurname() { return getSurname(); }
    public String getGender() { return getGender(); }
}


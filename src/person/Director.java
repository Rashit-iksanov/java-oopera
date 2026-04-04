package person;

public class Director extends Person {

    protected int numberOfShows;

    public Director(Gender gender, String name, String surname, int numberOfShows) {
        super(gender, name, surname);
        this.numberOfShows = numberOfShows;
    }


    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

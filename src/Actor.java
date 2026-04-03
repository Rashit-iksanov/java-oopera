import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(Gender gender, String name, String surname, int height) {
        super(gender, name, surname);
        this.height = height;
    }

    public int getHeight() { return height; }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return height == actor.height &&
                Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + "(" + height + ")" +
                '}';
    }
}



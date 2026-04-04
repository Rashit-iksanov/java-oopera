package show;

import person.Director;
import person.Person;

public class Opera extends MusicalShow {
    protected int choirSize;

    public Opera(Director director, String title, int duration, Person musicAuthor, String librettoText, int choirSize) {
        super(director, title, duration, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}

import java.util.ArrayList;

class Ballet extends MusicalShow {
    public Person choreographer;

    public Ballet(Director director, String title, int duration, Person musicAuthor, String librettoText, Person choreographer) {
        super(director, title, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}

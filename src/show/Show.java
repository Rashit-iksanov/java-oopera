package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;


public class Show {
    protected String title;
    protected int duration;
    private Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(Director director, String title, int duration) {
        this.director = director;
        this.title = title;
        this.duration = duration;
        this.listOfActors = new ArrayList<>();
    }

    public void printActors() {
        System.out.println("Список актеров: ");
        for (Actor actor : listOfActors) {
            System.out.println(" *** " + actor);
        }
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Внимание: такой актёр уже участвует в спектакле.");
        } else {
            listOfActors.add(newActor);
        }
    }

    public void replaceActor(String surnameToReplace, Actor newActor) {
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            listOfActors.set(index, newActor);
        } else {
            System.out.println("Внимание: актёр с фамилией " + surnameToReplace + " не найден в спектакле.");
        }
    }

    public void printDirector() {
        System.out.println("Режиссёр: " + director);
    }
}

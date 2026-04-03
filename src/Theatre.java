public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor (Gender.MALE, "Риколай", "Басков", 180);
        Actor actor2 = new Actor (Gender.FEMALE, "Анастасия", "Волочкова", 185);
        Actor actor3 = new Actor (Gender.MALE, "Виктор", "Иванов", 170);

        Director director1 = new Director(Gender.FEMALE, "Виктория", "Сергеева", 12);
        Director director2 = new Director(Gender.FEMALE, "Лариса", "Нехочуева", 12);

        Person musicAuthor = new Person(Gender.MALE, "Ален", "Делон");
        Person choreographer = new Person(Gender.FEMALE, "Кристина", "Асмус");

        Show regularShow = new Show(director1, "Шоу - так себе!", 110);
        Ballet balletShow = new Ballet(director2, "Лебединое болото", 60,
                musicAuthor,"\"Каждый кулик хвалит свое болото )))\"", choreographer);
        Opera operaShow = new Opera(director1, "Игра престолов", 90,
                musicAuthor,"\"Давным давно...   .. и все было у них хорошо!\"", 66);

        regularShow.addActor(actor1);
        regularShow.addActor(actor3);

        balletShow.addActor(actor2);
        balletShow.addActor(actor1);
        balletShow.addActor(actor3);

        operaShow.addActor(actor3);
        operaShow.addActor(actor2);

        System.out.println(" --- Обычное представление --- ");
        regularShow.printActors();
        System.out.print("");

        System.out.println(" --- Балет --- ");
        balletShow.printActors();
        System.out.print("");

        System.out.println(" --- Опера --- ");
        operaShow.printActors();
        System.out.println("");

        System.out.println("***********************");
        System.out.println("Замена актера из обычного на актера из другого спектакля: ");
        regularShow.replaceActor("Иванов", actor1);
        System.out.println("");

        System.out.println("Состав актеров после замены: ");
        regularShow.printActors();
        System.out.println();

        System.out.println("Попытка заменить актера балета на несуществующего актера: ");
        balletShow.replaceActor("Козлодоев", actor2);
        System.out.println("");

        System.out.println("***********************");
        System.out.println("Либретто для оперы:");
        operaShow.printLibrettoText();
        System.out.println("");
        System.out.println("Либретто для балета:");
        balletShow.printLibrettoText();
    }
}

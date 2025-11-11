public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("actor1", "actor1", Gender.MALE, 100);
        Actor actor2 = new Actor("actor2", "actor2", Gender.MALE, 200);
        Actor actor3 = new Actor("actor3", "actor3", Gender.MALE, 300);
        Director director1 = new Director("director1", "director1", Gender.FEMALE, 10);
        Director director2 = new Director("director2", "director2", Gender.FEMALE, 20);

        Person musician = new Person("musician", "musician", Gender.MALE);
        Person choreographer = new Person("choreographer", "choreographer", Gender.MALE);

        Show show = new Show ("Show", 100, director1);
        show.addActor(actor1);
        show.addActor(actor2);
        show.printActors();

        Ballet showBallet = new Ballet ("Ballet", 100, director2, musician, "showBallet librettoText", choreographer);
        showBallet.addActor(actor2);
        showBallet.addActor(actor3);
        showBallet.printActors();

        Opera showOpera = new Opera ("Opera", 100, director2, musician, "showOpera librettoText", 10);
        showOpera.addActor(actor3);
        showOpera.addActor(actor1);
        showOpera.printActors();

        show.changeActor(actor3, "actor2");
        show.printActors();
        showOpera.changeActor(actor2, "actor2");
        showBallet.printLibretto();
        showOpera.printLibretto();

    }
}

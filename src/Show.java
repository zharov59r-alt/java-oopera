import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printActors() {
        for (var actor: listOfActors)
            System.out.println(actor);
    }

    public void addActor(Actor actor) {

        if (listOfActors == null)
            listOfActors = new ArrayList<>();
        else
            for (var tmp: listOfActors)
                if (tmp.equals(actor)) {
                    System.out.println("Такой актер уже есть");
                    return;
                }

        listOfActors.add(actor);

    }

    public void changeActor(Actor actor, String surname) {

        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("Список актеров пуст");
            return;
        } else
            for (int i = 0; i < listOfActors.size(); i++) {
                if (listOfActors.get(i).surname.equals(surname)) {
                    listOfActors.set(i, actor);
                    return;
                }
            }

        System.out.println("Актер не найден");

    }

}
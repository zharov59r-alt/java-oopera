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
        this.listOfActors = new ArrayList();
    }

    public void printActors() {
        for (var actor: listOfActors)
            System.out.println(actor);
    }

    public void addActor(Actor actor) {

        for (var tmp: listOfActors)
            if (tmp.equals(actor)) {
                System.out.println("Такой актер уже есть");
                return;
            }

        listOfActors.add(actor);

    }

    public void changeActor(Actor actor, String surname) {

        if (listOfActors.isEmpty()) {
            System.out.println("Список актеров пуст");
            return;
        } else {
            int actorIndex = -1;
            for (int i = 0; i < listOfActors.size(); i++)
                if (listOfActors.get(i).surname.equals(surname))
                    if (actorIndex == -1) {
                        actorIndex = i;
                    } else {
                        System.out.println("Найдено несколько актеров с указанной фамилией");
                        return;
                    }

            System.out.println(actorIndex);

            if (actorIndex != -1)
                listOfActors.set(actorIndex, actor);
            else
                System.out.println("Актер не найден");
        }
    }
}
public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gende, int numberOfShows) {
        super(name, surname, gende);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

}

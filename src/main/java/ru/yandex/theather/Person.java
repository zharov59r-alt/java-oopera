public class Person {
    protected String name;
    protected String surname;
    protected Gender gende;

    public Person(String name, String surname, Gender gende) {
        this.name = name;
        this.surname = surname;
        this.gende = gende;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

}

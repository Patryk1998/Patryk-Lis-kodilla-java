package stream.world;

public final class Politician {
    private final String name;
    private final String surname;
    private final int age;

    public Politician(final String name, final String surname, final int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}

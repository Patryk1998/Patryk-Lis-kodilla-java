package com.kodilla.good.patterns.Flights;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Flight {
    private final String from;
    private final String to;

    public Flight(final String from, final String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(from, flight.from) &&
                Objects.equals(to, flight.to);
    }

    @Override
    public int hashCode() {

        return Objects.hash(from, to);
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public static Set<Flight> dataBase = new HashSet<>();
        static {
            dataBase.add(new Flight("Warszawa", "Krakow"));
            dataBase.add(new Flight("Warszawa", "Bydgoszcz"));
            dataBase.add(new Flight("Warszawa", "Wroclaw"));
            dataBase.add(new Flight("Warszawa", "Gdansk"));
            dataBase.add(new Flight("Krakow", "Warszawa"));
            dataBase.add(new Flight("Krakow", "Bydgoszcz"));
            dataBase.add(new Flight("Krakow", "Wroclaw"));
            dataBase.add(new Flight("Krakow", "Rzeszow"));
            dataBase.add(new Flight("Poznan", "Warszawa"));
            dataBase.add(new Flight("Poznan", "Bydgoszcz"));
            dataBase.add(new Flight("Poznan", "Wroclaw"));
            dataBase.add(new Flight("Poznan", "Rzeszow"));
            dataBase.add(new Flight("Bydgoszcz", "Warszawa"));
            dataBase.add(new Flight("Bydgoszcz", "Krakow"));
            dataBase.add(new Flight("Bydgoszcz", "Poznan"));
            dataBase.add(new Flight("Bydgoszcz", "Gdansk"));
            dataBase.add(new Flight("Wroclaw", "Warszawa"));
            dataBase.add(new Flight("Wroclaw", "Bydgoszcz"));
            dataBase.add(new Flight("Wroclaw", "Gdansk"));
            dataBase.add(new Flight("Wroclaw", "Rzeszow"));
            dataBase.add(new Flight("Gdansk", "Warszawa"));
            dataBase.add(new Flight("Gdansk", "Krakow"));
            dataBase.add(new Flight("Gdansk", "Poznan"));
            dataBase.add(new Flight("Gdansk", "Bydgoszcz"));
            dataBase.add(new Flight("Rzeszow", "Warszawa"));
            dataBase.add(new Flight("Rzeszow", "Poznan"));
            dataBase.add(new Flight("Rzeszow", "Bydgoszcz"));
            dataBase.add(new Flight("Rzeszow", "Gdansk"));





    }
}

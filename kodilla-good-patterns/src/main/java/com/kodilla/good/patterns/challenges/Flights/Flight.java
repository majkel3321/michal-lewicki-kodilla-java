package com.kodilla.good.patterns.challenges.Flights;

import java.util.Objects;

public class Flight {

    private String from;
    private String through;
    private String to;

    public Flight(String from, String through, String to) {
        this.from = from;
        this.through = through;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(from, flight.from) &&
                Objects.equals(through, flight.through) &&
                Objects.equals(to, flight.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, through, to);
    }

    public String getFrom() {
        return from;
    }

    public String getThrough() {
        return through;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Flight " +
                "from '" + from + '\'' +
                " through '" + through + '\'' +
                " to '" + to + '\'';
    }
}

package samples.collections.generics.epam;

/**
 * Created by Денис on 14.04.2016.
 */
public class Room implements Comparable<Room> {
    String number;
    int seats;
    double square;
    boolean wiFi;

    public Room(String number, int seats, double square, boolean wiFi) {
        this.number = number;
        this.seats = seats;
        this.square = square;
        this.wiFi = wiFi;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number='" + number + '\'' +
                ", seats=" + seats +
                ", square=" + square +
                ", wiFi=" + wiFi +
                '}';
    }

    @Override
    public int compareTo(Room o) {
        return seats - o.seats;
    }
}


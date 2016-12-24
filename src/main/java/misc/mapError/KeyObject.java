package misc.mapError;


/**
 * Created by MORA on 11.11.2016.
 */
public class KeyObject implements Comparable<KeyObject> {
    int i;

    public KeyObject(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KeyObject keyObject = (KeyObject) o;

        return i == keyObject.i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public int compareTo(KeyObject o) {
        return i - o.i;
    }
}

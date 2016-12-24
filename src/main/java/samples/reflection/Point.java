package samples.reflection;

/**
 * Created by Денис on 04.11.2016.
 */
public /*final*/ class Point {
    private /*final*/ int x;
    private /*final*/ int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    public int getY() {
        return y;
    }
    @MyCoolAnnotation(enabled = false)
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @MyCoolAnnotation(enabled = true)
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}

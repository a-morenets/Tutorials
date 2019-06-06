package samples.immutableObjects.pointLine;

/**
 * Created by Денис on 04.11.2016.
 */
public final class Line {
    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = new Point(start.getX() , start.getY() );
        this.end = end;
    }

    public Point getStart() {
        return new Point(start.getX() , start.getY() );
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

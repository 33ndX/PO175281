package zad8;

public class Point {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint){
        int dx = this.x - otherPoint.x;
        int dy = this.y - otherPoint.y;
        return Math.sqrt((dx * dx + dy * dy));
    }
}

import java.util.Arrays;
import java.util.Comparator;
class Point {
     int x;
     int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}

public class overrideExample {

	public static void main(String[] args) {
		Point[] points = {
	            new Point(3, 4),
	            new Point(1, 2),
	            new Point(5, 6)
	        };

	        Arrays.sort(points, new Comparator<Point>() {
	            public int compare(Point p1, Point p2) {
	                return Integer.compare(p1.x, p2.x);
	            }
	        });

	        System.out.println(Arrays.deepToString(points));

	}

}

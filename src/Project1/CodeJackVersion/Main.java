package Project1.CodeJackVersion;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(1, 2);
        Point[] pointsActual = new LineSegment(new Point(0,0),new Point(3,3)).subDivide(3);
        for(int i = 0; i< pointsActual.length; i++) {
            System.out.println(pointsActual[i]);
        }
    }
}

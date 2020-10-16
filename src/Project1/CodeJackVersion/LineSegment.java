package Project1.CodeJackVersion;

public class LineSegment {
    private Point point1;
    private Point point2;

    public LineSegment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point[] subDivide(int subSegments) {
        Point[] pointsExpected = new Point[subSegments - 1];
        double point1x = this.point1.getX();
        double point1y = this.point1.getY();
        double point2x = this.point2.getX();
        double point2y = this.point2.getY();
        double counter = 1.0;
        double xDist = point2x - point1x;
        double yDist = point2y - point1y;

        for(int i = 0; i < subSegments - 1; ++i) {
            double xpoint = point1x + counter / (double)subSegments * xDist;
            double ypoint = point1y + counter / (double)subSegments * yDist;
            pointsExpected[i] = new Point(xpoint, ypoint);
            counter++;
        }

        return pointsExpected;
    }
}

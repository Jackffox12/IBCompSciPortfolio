package Project1.Tests;

import Project1.CodeJackVersion.Point;
import Project1.CodeJackVersion.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void returnArea() {
        Triangle ls = new Triangle(new Point(1,1), new Point(4,5), new Point (10,19));
        assertEquals(9, ls.getArea(), 0.001);

    }

    @Test
    void returnPerimeter() {
        Triangle ls = new Triangle(new Point(5,9), new Point(4,7), new Point (10,-3));
        assertEquals(26.898, ls.getPerimeter(),0.001);
    }
}
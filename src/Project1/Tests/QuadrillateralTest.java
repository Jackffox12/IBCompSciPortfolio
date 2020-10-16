package Project1.Tests;

import Project1.CodeJackVersion.Point;
import Project1.CodeJackVersion.Quadrillateral;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadrillateralTest {

    @Test
    void getArea() {
        Quadrillateral ls = new Quadrillateral(new Point(1,8), new Point(-9,1), new Point (-5,-4), new Point (2,2));
        assertEquals(64.9, ls.getArea(), 0.1);
    }

    @Test
    void getPerimeter() {
        Quadrillateral ls = new Quadrillateral(new Point(1,8), new Point(-9,1), new Point (-5,-4), new Point (2,2));
        assertEquals(33.911986, ls.getPerimeter(), 0.001);

    }
}
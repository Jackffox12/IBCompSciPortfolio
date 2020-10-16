package Project1.CodeJackVersion;

import javax.sound.sampled.Line;

public class Triangle implements ShapeInterface {
    private Point a; private Point b; private Point c;
    private String type; private double distA; private double distB; private double distC;
    private double greatestDist;
    private boolean rightTriangle;


    public Triangle(Point a, Point c, Point b){
        this.a = a;
        this.b = b;
        this.c = c;


        distC = totalDist(a,b);
        distB = totalDist(c,a);
        distA = totalDist(b,c);
        greatestDist = greatestLength(distA,distB,distC);

        isRightTriangle(distA,distB, distC, greatestDist);

        isType(distA, distB, distC);

    }
    public double totalDist(Point a, Point b) {
        return Math.sqrt((Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)));
    }
    public double greatestLength(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public void isRightTriangle(double distA, double distB, double distC, double greatestDist){
        if(distA == greatestDist){
            if (Math.pow(distB, 2) + Math.pow(distC, 2) == Math.pow(distA,2)){
                rightTriangle = true;
            }
        }
        else if(distB == greatestDist){
            if (Math.pow(distA, 2) + Math.pow(distC, 2) == Math.pow(distB,2)){
                rightTriangle = true;
            }
        }

        else if(distC == greatestDist){
            if (Math.pow(distB, 2) + Math.pow(distA, 2) == Math.pow(distC,2)){
                rightTriangle = true;
            }
        }
        else {
            rightTriangle = false;
        }

    }

    public void isType(double distA, double distB, double distC) {
        if (distA == distB && distA == distC && distB != distC) {
            type = "isosceles";
        } else if (distB == distC && distB == distA && distC != distA) {
            type = "isosceles";
        } else if (distC == distB && distC == distA && distB != distC) {
            type = "isosceles";
        } else if (distA == distB && distA == distC && distB == distC) {
            type = "equilateral";
        } else {
            type = "scalene";
        }

        }
    public double getArea() {
        double p = (distA + distB + distC) / 2;
        return (Math.sqrt(p * (p - distA) * (p - distB) * (p - distC)));


    }
    public double getPerimeter(){
        return (distA+distB+distC);
    }

    }












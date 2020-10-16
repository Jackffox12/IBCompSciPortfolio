package Project1.CodeJackVersion;

public class Quadrillateral implements ShapeInterface{
    private Point finalA; private Point finalB; private Point finalC; private Point finalD;
    private double distD; private double distC; private double distB; private double distA;
    private String type;
    public Quadrillateral(Point a, Point b, Point c, Point d) {
        this.finalA = a;
        this.finalB = b;
        this.finalC = c;
        this.finalD = d;


        distA = totalDist(finalA,finalB);
        distB = totalDist(finalB,finalC);
        distC = totalDist(finalC,finalD);
        distD = totalDist(finalD,finalA);

    }
    public double totalDist(Point a, Point b){
        return Math.sqrt((Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2)));

    }
    private void isShape(double a, double b, double c, double d){
        if(a==b && a==c && a==d){
            if(slope(finalA,finalB) == (-1/slope(finalC,finalD)) && slope(finalB,finalC) == (-1/slope(finalA,finalD))){
                type = "rhombus";
            }
            else {
                type = "square";
            }
        }
        else if(slope(finalA, finalB) == slope(finalD, finalC) && slope(finalA, finalD) == slope(finalB, finalC)){
            type = "trapezoid";
        }
        else if((distA==distB && distD == distC) && (distA == distD && distB ==distC)){
            type = "rectangle";
        }
        else if(distA == distB && distD == distC && slope(finalB,finalD) == (-1/slope(finalC,finalA)) || distD == distA && distB == distC && slope(finalB,finalD) == (-1/slope(finalC,finalA))){
            type = "kite";
        }
        else{
            type = "none";
        }

    }

    private double slope(Point a, Point b){
        return ((a.getY()-b.getY())/(a.getX()-b.getX()));


    }

    public double getArea(){

        double oppAngle1 = Math.tan((slope(finalB, finalA) - slope(finalB, finalC))/(1+slope(finalB, finalA) * slope(finalB, finalC)));
        double oppAngle2 = Math.tan((slope(finalD, finalA) - slope(finalD, finalC))/(1+slope(finalD, finalA) * slope(finalD, finalC)));

        double theda = Math.pow(Math.cos(oppAngle1+oppAngle2)/2,2);

        double s = (distA+distB+distC+distD)/2;




        return (Math.sqrt((s-distA)*(s-distB)*(s - distC)*(s - distD) -s*theda));


    }
    public double getPerimeter(){
        return (distA + distB + distC + distD);
    }



}

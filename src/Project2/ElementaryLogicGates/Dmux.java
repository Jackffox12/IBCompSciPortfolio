package Project2.ElementaryLogicGates;

public class Dmux {

    public boolean a;
    public boolean b;
    Not not = new Not();
    And and1 = new And();
    And and2 = new And();

    public void compute(boolean in, boolean sel){
        not.compute(sel);
        and1.compute(not.out, in);
        a = and1.out;
        and2.compute(sel,in);
        b = and2.out;



    }
}

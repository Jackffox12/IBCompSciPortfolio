package Project2.ElementaryLogicGates;

public class Mux {

    public boolean out;
    private Not not = new Not();
    private And and1 = new And();
    private And and2 = new And();
    private Or or = new Or();

    public void compute(boolean a, boolean b, boolean sel){
        not.compute(sel);
        and1.compute(a, not.out);
        and2.compute(sel,b);
        or.compute(and1.out,and2.out);
        out = or.out;
    }
}

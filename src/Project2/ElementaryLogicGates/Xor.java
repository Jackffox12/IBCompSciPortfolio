package Project2.ElementaryLogicGates;

public class Xor {
    public boolean out;
    private Nand nand = new Nand();
    private And and = new And();
    private Or or = new Or();

    public void compute(boolean a, boolean b){
       nand.compute(a,b);
       or.compute(b,a);
       and.compute(nand.out,or.out);
       out=and.out;
    }
}

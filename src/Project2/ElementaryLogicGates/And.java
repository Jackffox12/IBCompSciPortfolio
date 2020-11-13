package Project2.ElementaryLogicGates;

public class And {

    public boolean out;
    private Not not = new Not();
    private Nand nand = new Nand();

    public void compute(boolean a, boolean b){
        nand.compute(a,b);
        not.compute(nand.out);
        out = not.out;

    }
}

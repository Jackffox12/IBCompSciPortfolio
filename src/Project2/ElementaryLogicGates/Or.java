package Project2.ElementaryLogicGates;

public class Or {

    public boolean out;
    private Nand nand = new Nand();
    private Not notA = new Not();
    private Not notb = new Not();

    public void compute(boolean a, boolean b){
        notA.compute(a);
        notb.compute(b);
        nand.compute(notA.out,notb.out);
        out = nand.out;

    }

}

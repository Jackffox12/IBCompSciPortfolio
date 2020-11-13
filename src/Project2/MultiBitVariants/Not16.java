package Project2.MultiBitVariants;


import Project2.ElementaryLogicGates.Not;

public class Not16 {
    public boolean[] out = new boolean[16];
    private Not[] not = new Not[16];


    public Not16() {
        for(int i = 0; i<16; i++){
            not[i] = new Not();
        }

    }

    public void compute(boolean[] in){
        for(int i = 0; i<16; i++){
            Not calculate = not[i];
            calculate.compute(in[i]);
            out[i] = calculate.out;
        }

    }
}

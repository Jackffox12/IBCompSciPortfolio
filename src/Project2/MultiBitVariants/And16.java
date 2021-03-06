package Project2.MultiBitVariants;

import Project2.ElementaryLogicGates.And;

public class And16 {

    public boolean[] out = new boolean[16];
    private And[] and = new And[16];

    public And16() {
        for(int i = 0; i<16; i++){
            and[i] = new And();
        }

    }

    public void compute(boolean[] a,boolean[] b){
        for(int i = 0; i<16; i++){
            And calculate = and[i];
            calculate.compute(a[i],b[i]);
            out[i] = calculate.out;
        }

    }
}

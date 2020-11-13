package Project2.MultiBitVariants;

import Project2.ElementaryLogicGates.Or;

public class Or16 {
    public boolean[] out = new boolean[16];
    private Or[] or = new Or[16];

    public Or16() {
        for(int i = 0; i<16; i++){
            or[i] = new Or();
        }

    }

    public void compute(boolean[] a,boolean[] b){
        for(int i = 0; i<16; i++){
            Or calculate = or[i];
            calculate.compute(a[i],b[i]);
            out[i] = calculate.out;
        }
    }
}

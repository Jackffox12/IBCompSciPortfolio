package Project2.MultiBitVariants;


import Project2.ElementaryLogicGates.Or;

public class Or8Way {
    public boolean out;
    private Or[] or = new Or[8];
    private boolean[] initOutput;
    private boolean[] finalOutput;
    private Or finalOr = new Or();


    public Or8Way(){
        for(int i = 0; i<8; i++){
            or[i] = new Or();
        }

    }

    public void compute(boolean[] in){
        int counter = 0;
        for(int i = 0; i<8; i++){
            Or calculate = or[i];
            calculate.compute(in[counter],in[counter+1]);
            initOutput[i] = calculate.out;
            counter+=2;
        }
        counter = 0;
        for(int i = 0; i<4; i++){
            Or calculate = or[i];
            calculate.compute(in[counter],in[counter]);
            finalOutput[i] = calculate.out;
            counter+=2;
        }
        finalOr.compute(finalOutput[0],finalOutput[1]);
        out = finalOr.out;

    }

}

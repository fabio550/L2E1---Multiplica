package controller;

public class MultiplicaController {
    public MultiplicaController() {
        super();
    }

    public int CalcMultiplica(int a , int b) {

        if (a>0) {
            return CalcMultiplica(a-1, b) + b;
        } else {
            return 0;
        }
    }
}

package view;
import controller.MultiplicaController;

public class Principal {
    public static void main(String[] args) {
        MultiplicaController mc = new MultiplicaController();

        int res = mc.CalcMultiplica(6,5);
        System.out.println(res);
    }
}

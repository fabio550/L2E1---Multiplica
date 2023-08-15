package view;
import controller.MultiplicaController;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        MultiplicaController mc = new MultiplicaController();

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor b:"));

        int res = mc.CalcMultiplica(a,b);

        JOptionPane.showMessageDialog(null, "O resultado da multiplicação de " + a + " por " + b + " é " + res); // 20 24 -> 4
    }
}

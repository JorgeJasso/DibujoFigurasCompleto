package dibujofiguras;

import javax.swing.JFrame;

public class Prueba {

    public static void main(String[] args) {
        Interfaz marco = new Interfaz();
        marco.setBounds(220, 0, 900, 700);
        marco.setSize(900, 723);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}

/**
 * Integrantes:
 * Martínez Herrera Luis Alberto
 * Jiménez Rodríguez Aldo Eugenio
 * Posadas Diaz Jose Eduardo
 *
 * Objetivo del programa:
 * Representar un numero complejo en su forma binómica
 * apartir de 2 números reales empleando objetos
 * , encontrar su modulo y conjugado y sumar, restar, multiplicar
 * y mostrar una línea
 */
package numerosComplejos;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

        NumeroComplejo Obj = new NumeroComplejo();

        int menuSeleccion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Seleccionar operación: " + "\n"
                + "1) Representar numero complejo en forma binomica" + "\n"
                + "2) Sumar numeros complejos" + "\n"
                + "3) Restar numeros complejos" + "\n"
                + "4) Mostrar línea",
                "Números complejos",
                JOptionPane.QUESTION_MESSAGE));

        switch (menuSeleccion) {
            case 1 -> {
                float ConvNumRealA = Float.parseFloat(JOptionPane.showInputDialog(null,
                        "Ingresar primer numero real",
                        "Números complejos",
                        JOptionPane.QUESTION_MESSAGE));

                float ConvNumRealB = Float.parseFloat(JOptionPane.showInputDialog(null,
                        "Ingresar segundo numero real",
                        "Números complejos",
                        JOptionPane.QUESTION_MESSAGE));

                Obj.setNumRealA(ConvNumRealA);
                Obj.setNumRealB(ConvNumRealB);
                Obj.despliegueDeNumeroC();
            }
            case 2 -> {
                int seleccionOp = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingresar cuantos números complejos (a+bi) desea sumar",
                        "Suma números complejos",
                        JOptionPane.QUESTION_MESSAGE));
                Obj.SeleccionOp(seleccionOp);
                Obj.sumaDeNumeros();
                Obj.despliegueSuma();
            }
            case 3 -> {
                int seleccionOp2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingresar cuantos números complejos (a+bi) desea sumar",
                        "Suma números complejos",
                        JOptionPane.QUESTION_MESSAGE));
                Obj.SeleccionOp(seleccionOp2);

                Obj.restaDeNumeros();
                Obj.despliegueResta();
            }

            case 4 -> {
                JFrame frame = new JFrame("Dibujar una línea");
                frame.setSize(400, 400);

                GUIFrame panel = new GUIFrame();
                frame.add(panel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setVisible(true);
            }

            default ->
                throw new AssertionError();
        }

    }
}

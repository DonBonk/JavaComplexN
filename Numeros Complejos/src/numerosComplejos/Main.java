/**
 * Integrantes:
 * Martínez Herrera Luis Alberto
 * Jiménez Rodríguez Aldo Eugenio
 * Posadas Diaz Jose Eduardo
 *
 * Objetivo del programa:
 * Representar un numero complejo en su forma binómica
 * apartir de 2 números reales empleando objetos
 * y encontrar su modulo y conjugado
 */
package numerosComplejos;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        NumeroComplejo Obj = new NumeroComplejo();

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
}

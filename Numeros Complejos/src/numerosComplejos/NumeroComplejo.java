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

public class NumeroComplejo {

    private float numRealA;
    private float numRealB;
    private int seleccionOp;
    private double sum = 0;
    private double sum2 = 0;
    private double rest = 0;
    private double rest2 = 0;

    public float getRealNumberA() {
        return numRealA;
    }

    public float getRealNumberB() {
        return numRealB;
    }
    
    public float getSeleccionOp() {
        return seleccionOp;
    }

    public void setNumRealA(float newNumRealA) {
        this.numRealA = newNumRealA;
    }

    public void setNumRealB(float newNumRealB) {
        this.numRealB = newNumRealB;
    }
    
    public void SeleccionOp(int seleccionOp) {
        this.seleccionOp = seleccionOp;
    }

    private double obtenerModuloNumCom() {
        double modulo = (Math.sqrt(Math.pow(numRealA, 2) + Math.pow(numRealB, 2)));
        return modulo;
    }

    private String obtenerConjugadoNumCom() {
        String str;
        if (numRealB != 0) {

            str = String.valueOf(-1 * numRealB);

            return str;
        } else {

            str = String.valueOf(numRealB);
            return str;
        }
    }

    public void sumaDeNumeros() {
        int i = 0;

        double numberRealA[] = new double[seleccionOp];
        double numberRealB[] = new double[seleccionOp];

        while (i < seleccionOp) {
            numberRealA[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresar número real a " + (i + 1) + ":",
                    "Suma números complejos",
                    JOptionPane.QUESTION_MESSAGE));

            numberRealB[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresar número real b " + (i + 1) + ":",
                    "Suma números complejos",
                    JOptionPane.QUESTION_MESSAGE));
            sum += numberRealA[i];
            sum2 += numberRealB[i];
            i++;
        }
    }
    
    public void restaDeNumeros() {
        int i = 0;

        double numberRealA[] = new double[seleccionOp];
        double numberRealB[] = new double[seleccionOp];

        while (i < seleccionOp) {        
            numberRealA[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresar número real a " + (i + 1) + ":",
                    "Resta números complejos",
                    JOptionPane.QUESTION_MESSAGE));

            numberRealB[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Ingresar número real b " + (i + 1) + ":",
                    "Resta números complejos",
                    JOptionPane.QUESTION_MESSAGE));
            rest =- numberRealA[i];
            rest2 =- numberRealB[i];
            i++;
        }
    }
    
    

    public void despliegueDeNumeroC() {

        if (numRealB < 0) {
            JOptionPane.showMessageDialog(null, "Z = " + getRealNumberA()
                    + "" + getRealNumberB() + "i" + "\n"
                    + "Modulo de numero complejo: " + obtenerModuloNumCom()
                    + "\n" + "Conjugado de número complejo: "
                    + getRealNumberA() + "+" + obtenerConjugadoNumCom() + "i",
                    "Número complejo",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Z = " + getRealNumberA()
                    + " + " + getRealNumberB() + "i" + "\n"
                    + "Modulo de numero complejo: " + obtenerModuloNumCom()
                    + "\n" + "Conjugado de número complejo: "
                    + getRealNumberA() + obtenerConjugadoNumCom() + "i",
                    "Número complejo",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void despliegueSuma() {
        if (sum2 < 0) {
            JOptionPane.showMessageDialog(null,
                    "Resultado: " + sum
                    + ""
                    + sum2
                    + "i",
                    "Numero Complejo",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Resultado: " + sum
                    + "+"
                    + sum2
                    + "i",
                    "Numero Complejo",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void despliegueResta() {
        if (rest2 < 0) {
            JOptionPane.showMessageDialog(null,
                    "Resultado: " + rest
                    + ""
                    + rest2
                    + "i",
                    "Numero Complejo",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Resultado: " + rest
                    + "+"
                    + rest2
                    + "i",
                    "Numero Complejo",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

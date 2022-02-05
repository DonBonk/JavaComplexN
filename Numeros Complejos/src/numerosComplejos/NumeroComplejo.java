package numerosComplejos;

import javax.swing.JOptionPane;

public class NumeroComplejo {

    private float numRealA;
    private float numRealB;

    public float getRealNumberA() {
        return numRealA;
    }

    public float getRealNumberB() {
        return numRealB;
    }

    public void setNumRealA(float newNumRealA) {
        this.numRealA = newNumRealA;
    }

    public void setNumRealB(float newNumRealB) {
        this.numRealB = newNumRealB;
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
}

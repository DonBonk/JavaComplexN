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

import java.awt.Graphics;
import javax.swing.JPanel;

public class GUIFrame extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawLine(0, 200, 200, 200); //Coordenadas para dibujar la línea
    }

}
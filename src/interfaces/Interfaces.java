/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import pantallas.ListaDeNavegadores;

/**
 *
 * @author Jeferson Fano
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDeNavegadores lista = new ListaDeNavegadores();
        lista.setLocationRelativeTo(null);
        lista.setVisible(true);
    }
}

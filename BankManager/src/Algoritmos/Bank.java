/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritmos;

/**
 *
 * @author Juan
 */
public class Bank {

    /**
     * Manage the bank
     *
     * @param cuota de beneficio de la apuesta
     * @param probabilidad de que el equipo gane
     * @param bank disponible
     * @return cantidad inteligente para apostar
     */
    public static double kelly(double cuota, double probabilidad, int bank) {
        
        double kelly = ((((probabilidad/100) * cuota)- 1)/(cuota - 1));
        System.out.println(kelly);
        return bank * kelly;
    }

}

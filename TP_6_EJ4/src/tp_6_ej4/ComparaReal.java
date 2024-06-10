/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_6_ej4;

import java.util.Comparator;

/**
 *
 * @author Luis Mendoza
 */
public class ComparaReal implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Complejo d1 = (Complejo) o1;
        Complejo d2 = (Complejo) o2;
        if(d1.modulo()==d2.modulo()) return 0;
        else if(d1.modulo()>d2.modulo()) return 1;
        else return -1;
    }
    
}

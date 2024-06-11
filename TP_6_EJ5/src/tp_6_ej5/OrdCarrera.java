/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_6_ej5;

import java.util.Comparator;

/**
 *
 * @author Luis Mendoza
 */
public class OrdCarrera implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Estudiante d1 = (Estudiante)o1;
        Estudiante d2 = (Estudiante)o2;
       return d1.getCarrera().compareTo(d2.getCarrera());
    }
    
}

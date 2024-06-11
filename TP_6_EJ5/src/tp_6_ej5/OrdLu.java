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
public class OrdLu implements Comparator{ 
    
    @Override
    public int compare(Object o1, Object o2) {
        Estudiante d1 = (Estudiante)o1;
        Estudiante d2 = (Estudiante)o2;
        if(d1.getLu()== d2.getLu()){
          return 0;
        }
        else if(d1.getLu() < d2.getLu()){
          return -1;
        }
        else 
            return 1;
    }
}

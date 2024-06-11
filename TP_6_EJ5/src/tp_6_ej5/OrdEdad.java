/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_6_ej5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

/**
 *
 * @author Luis Mendoza
 */
public class OrdEdad implements Comparator {
    
    public static int edades(LocalDate fact){
        
       LocalDate actual = LocalDate.now(); 
       Period periodo = Period.between(fact,actual); 
       
       return periodo.getYears();
    }

    @Override
    public int compare(Object o1, Object o2) {
        Estudiante d1 = (Estudiante)o1;
        Estudiante d2 = (Estudiante)o2;
        
        if(edades(d1.getFechaNac()) == edades(d2.getFechaNac())){
          return 0;
        }
        else if(edades(d1.getFechaNac()) < edades(d2.getFechaNac())){
          return -1;
        }
        else 
            return 1;
    }
}

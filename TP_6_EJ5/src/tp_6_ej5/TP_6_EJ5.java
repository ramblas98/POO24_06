/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_6_ej5;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Luis Mendoza
 */
public class TP_6_EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Estudiante> lista = new ArrayList();
        lista.add(new Estudiante("Luis","TUP",LocalDate.of(2004,Month.SEPTEMBER, 02),4527));
        lista.add(new Estudiante("Agustin","LAS",LocalDate.of(2000,Month.JANUARY, 06),4567));
        lista.add(new Estudiante("Marcos","TIG",LocalDate.of(2003,Month.JULY, 26),4547));
        lista.add(new Estudiante("Gonzalo","IRNyF",LocalDate.of(2005,Month.DECEMBER, 15),4517));
        System.out.println("ArrayList Con CompareTo");
        Collections.sort(lista);
        System.out.println(lista.toString());
        
        
        System.out.println();
        
        
        
        System.out.println("HashSet");
        HashSet <Estudiante>lista0 = new HashSet();
        lista0.add(new Estudiante("Luis","TUP",LocalDate.of(2004,Month.SEPTEMBER, 02),4527));
        lista0.add(new Estudiante("Agustin","LAS",LocalDate.of(2000,Month.JANUARY, 06),4567));
        lista0.add(new Estudiante("Marcos","TIG",LocalDate.of(2003,Month.JULY, 26),4547));
        lista0.add(new Estudiante("Gonzalo","IRNyF",LocalDate.of(2005,Month.DECEMBER, 15),4517));
        lista0.add(new Estudiante("Luis","TUP",LocalDate.of(2004,Month.SEPTEMBER, 02),4527));
        System.out.println(lista0.toString());
        
        
        
        System.out.println();
        
        
        
        System.out.println("TreeSet Orden Natural Con El Atributo Nombre");
        TreeSet <Estudiante>lista1 = new TreeSet(lista);
        //lista1.addAll(lista);
        System.out.println(lista1.toString());
        
        
        System.out.println();
        
        
        System.out.println("TreeSet Orden de Edad de Menor a Mayor");
        TreeSet <Estudiante>lista2 = new TreeSet(new OrdEdad());
        lista2.addAll(lista);
        System.out.println(lista2.toString());
        
        
        System.out.println();
        
        
        System.out.println("TreeSet Orden por Lu");
        TreeSet <Estudiante>lista3 = new TreeSet(new OrdLu());
        lista3.addAll(lista);
        System.out.println(lista3.toString());
        
        System.out.println();
        
        System.out.println("TreeSet Orden por Carrera");
        TreeSet <Estudiante>lista4 = new TreeSet(new OrdCarrera());
        lista4.addAll(lista);
        System.out.println(lista4.toString());
        
        
    }
    
}

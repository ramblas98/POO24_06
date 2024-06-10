/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_6_ej4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Luis Mendoza
 */
public class TP_6_EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Complejo> lista = new ArrayList();
        lista.add(new Complejo(2.34,5.79));
        lista.add(new Complejo(6.81,6.29));
        lista.add(new Complejo(1.47,1.23));
        lista.add(new Complejo(5.63,4.35));
        lista.add(new Complejo(6.54,3.79));
        
        System.out.println("ArrayList con CompareTO");
        Collections.sort(lista);
        System.out.println(lista.toString());
        
        
        System.out.println();
        
        System.out.println("HashSet");
        HashSet<Complejo> lista1 = new HashSet(lista); //otra manera de asignar =new HashSet();
        //lista1.addAll(lista); 
        System.out.println(lista1.toString());
        
        
        System.out.println();
      
        System.out.println("TreeSet Orden Natural");
        TreeSet<Complejo> lista2 = new TreeSet(lista);
        //lista2.addAll(lista); 
        System.out.println(lista2.toString());
        
        System.out.println();
        
        System.out.println("Recorrido Con Iterartor ");
        Iterator <Complejo> listIter = lista.iterator();
        while(listIter.hasNext()){
        //Complejo aux = listIter.next();   //Otra manera 
        System.out.println(listIter.next()); //De la otra forma es System.out.println(aux);
        }
        
        
        System.out.println();
      
        System.out.println("TreeSet Orden Modulo");
        TreeSet<Complejo> lista3 = new TreeSet(new ComparaReal());
        lista3.addAll(lista);
        System.out.println(lista3.toString());
        
        
        
        
        
    }
    
}

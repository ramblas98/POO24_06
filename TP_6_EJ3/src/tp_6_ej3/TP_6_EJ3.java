/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_6_ej3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author Luis Mendoza
 */
public class TP_6_EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        TreeSet<String> lista1 = new TreeSet();
        lista1.add("TIG");
        lista1.add("LAS");
        lista1.add("EU");
        lista1.add("IRNyF");
        
        for(String e:lista1){
           System.out.println(e);
        }
        System.out.println();
        System.out.println("Array");
        System.out.println();
        
        ArrayList<String> lista2 = new ArrayList();
        lista2.add("TIG");
        lista2.add("LAS");
        lista2.add("EU");
        lista2.add("IRNyF");
        lista2.add("TUP");
        lista2.add("TIG");
        
        for(String h:lista2){
           System.out.println(h);
        }
        
        System.out.println();
        System.out.println("HashSet");
        System.out.println();
        
        
        HashSet <String> lista3 = new HashSet();
        lista3.add("TIG");
        lista3.add("LAS");
        lista3.add("EU");
        lista3.add("IRNyF");
        lista3.add("IRNyF");
        
        for(String z:lista3){
           System.out.println(z);
        }
        
        System.out.println();
        System.out.println("Linke");
        System.out.println();
        
        LinkedHashSet<String> lista4 = new LinkedHashSet();
        lista4.addAll(lista2);
        
        
        
        Iterator<String> it = lista2.iterator();
        while(it.hasNext()){
            String e = it.next();
            if(e.charAt(0)=='T')
               lista4.add(e);
            else
              lista2.remove(e); 
        }
         
         
        
         
    }
    
}

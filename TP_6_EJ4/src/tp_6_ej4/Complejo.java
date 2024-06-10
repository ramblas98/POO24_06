/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_6_ej4;

/**
 *
 * @author Luis Mendoza
 */
public class Complejo implements Comparable{
    private double re,im;  
    
    public Complejo(double re, double im) {
        this.re = re;              
        this.im = im;
    }
    public Complejo(){ 
    }
    
    
    public double getRe() { 
        return re;           
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) { 
        this.re = re;
    }

    public void setIm(double im) {  
        this.im = im;
    }
  
    
    public double modulo (){
    double a;
    a = Math.sqrt((this.re* this.re)+(this.im * this.im));
    return a;
    }

    @Override
    public int compareTo(Object o) {
        Complejo b = new Complejo(this.re,this.im);
        Complejo otro = (Complejo) o;
        double r1 = (double) b.modulo();
        double r2 = (double) otro.modulo();
        if(r1==r2) return 0;
        else if(r1>r2) return 1;
        else return -1;
    }
  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.re) ^ (Double.doubleToLongBits(this.re) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.im) ^ (Double.doubleToLongBits(this.im) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complejo other = (Complejo) obj;
        if (Double.doubleToLongBits(this.re) != Double.doubleToLongBits(other.re)) {
            return false;
        }
        return Double.doubleToLongBits(this.im) == Double.doubleToLongBits(other.im);
    }

    @Override
    public String toString() {
        return "Complejo{"  + re + ',' + im + '}' + '\n';
    }
    
    
    
}

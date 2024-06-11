/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_6_ej5;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Luis Mendoza
 */
public class Estudiante implements Comparable {
    private String nombre,carrera;
    private LocalDate fechaNac;
    private int lu;

    public Estudiante() {
    }

    public Estudiante(String nombre, String carrera, LocalDate fechaNac, int lu) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.fechaNac = fechaNac;
        this.lu = lu;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public int getLu() {
        return lu;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", carrera=" + carrera + ", fechaNac=" + fechaNac + ", lu=" + lu + '}'+'\n';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.carrera);
        hash = 67 * hash + Objects.hashCode(this.fechaNac);
        hash = 67 * hash + this.lu;
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
        final Estudiante other = (Estudiante) obj;
        if (this.lu != other.lu) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.carrera, other.carrera)) {
            return false;
        }
        return Objects.equals(this.fechaNac, other.fechaNac);
    }

    @Override
    public int compareTo(Object o) {
        Estudiante otro = (Estudiante) o;
        return this.nombre.compareTo(otro.nombre);
    }
    
    
}

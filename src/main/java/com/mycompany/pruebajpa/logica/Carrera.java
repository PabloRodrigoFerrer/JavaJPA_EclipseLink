
package com.mycompany.pruebajpa.logica;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Carrera implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    @OneToMany (mappedBy = "carrera")
    private ArrayList<Materia> listaMaterias;
    
    
    public Carrera(){};

    public Carrera(String nombre, ArrayList<Materia> materias) {
        this.nombre = nombre;
        this.listaMaterias = materias;
    }

    public ArrayList<Materia> getMaterias() {
        return listaMaterias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.listaMaterias = materias;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}

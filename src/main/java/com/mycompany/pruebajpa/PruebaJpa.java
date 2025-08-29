package com.mycompany.pruebajpa;

import com.mycompany.pruebajpa.logica.Alumno;
import com.mycompany.pruebajpa.logica.Carrera;
import com.mycompany.pruebajpa.logica.Materia;
import com.mycompany.pruebajpa.logica.Services;
import com.mycompany.pruebajpa.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.Date;

public class PruebaJpa {

    public static void main(String[] args) throws NonexistentEntityException, Exception {

        Services services = new Services();
//        ArrayList<Materia> materias = new ArrayList();
//        
//        Carrera carrera = new Carrera("Tec programacion", materias);
//        services.crearCarrera(carrera);
//        
//        Alumno pruebaAlu = new Alumno("Gabriela", "Ferrer Maurin", new Date(), carrera);
//        services.crearAlumno(pruebaAlu);
//
//        Materia mate1 = new Materia("Programación I", carrera);
//        Materia mate2 = new Materia("Programación II", carrera);
//        Materia mate3 = new Materia("Sistemas operativos I", carrera);
//        
//        materias.add(mate1);
//        materias.add(mate2);
//        materias.add(mate3);
//        
//        carrera.setMaterias(materias);
//        services.editarCarrera(carrera);
        
        System.out.println("Hola Mundo");
        
        var carrera = services.buscarCarrera(1);
        ArrayList<Materia> listaMaterias = carrera.getMaterias();
        
        for ( var materia : listaMaterias){
            System.out.println(materia.getNombre());                
        }
        
    }
}

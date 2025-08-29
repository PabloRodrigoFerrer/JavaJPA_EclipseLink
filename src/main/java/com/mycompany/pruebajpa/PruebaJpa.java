

package com.mycompany.pruebajpa;

import com.mycompany.pruebajpa.logica.Alumno;
import com.mycompany.pruebajpa.logica.Services;
import java.util.Date;

public class PruebaJpa {

    public static void main(String[] args) {
        
        Services services = new Services();
        Alumno pruebaAlu = new Alumno(1, "Rodrigo", "Ferrer Maurin", new Date(1993, 03, 11));
        
        services.crearAlumno(pruebaAlu);
        System.out.println("Hello World!");
    }
}


package com.mycompany.pruebajpa.persistencia;

import com.mycompany.pruebajpa.logica.Alumno;

public class ControllerPersistence {
    
    AlumnoJpaController alumnoJpa = new AlumnoJpaController();


    public void crearAlumno(Alumno alu) {
        alumnoJpa.create(alu);
    }
}


package com.mycompany.pruebajpa.logica;

import com.mycompany.pruebajpa.persistencia.ControllerPersistence;

public class Services {
    
      ControllerPersistence controllerPersist = new ControllerPersistence();

       public void crearAlumno(Alumno alu)
       {
           controllerPersist.crearAlumno(alu);
       }

    public Services() {
    }
    
   
    
    
}

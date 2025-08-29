package com.mycompany.pruebajpa.logica;

import com.mycompany.pruebajpa.persistencia.ControllerPersistence;
import com.mycompany.pruebajpa.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;

public class Services {

    public Services() {
    }

    ControllerPersistence controllerPersist = new ControllerPersistence();

    // Alumno controllers
    public void crearAlumno(Alumno alu) {
        controllerPersist.crearAlumno(alu);
    }

    public void eliminarAlumno(Alumno alu) throws NonexistentEntityException {
        controllerPersist.eliminarAlumno(alu);
    }

    public void eliminarAlumnoById(int id) throws NonexistentEntityException {
        controllerPersist.eliminarAlumnoById(id);
    }

    public void editarAlumno(Alumno alu) throws Exception {
        controllerPersist.editarAlumno(alu);
    }

    public Alumno buscarAlumno(int id) {
        return controllerPersist.buscarAlumno(id);
    }

    public ArrayList<Alumno> buscarAlumnoEntidades() {
        return controllerPersist.buscarAlumnoEntities();
    }

    // Carrera controllers
    public void crearCarrera(Carrera carrera) {
        controllerPersist.crearCarrera(carrera);
    }

    public void eliminarCarreraById(int idCarrera) throws NonexistentEntityException {
        controllerPersist.eliminarCarreraById(idCarrera);
    }

    public void editarCarrera(Carrera carrera) throws Exception {
        controllerPersist.editarCarrera(carrera);
    }

    public Carrera buscarCarrera(int idCarrera) {
        return controllerPersist.buscarCarrera(idCarrera);
    }

    public ArrayList<Carrera> buscarCarreraEntidades() {
        return controllerPersist.buscarCarreraEntidades();
    }

    // Materia controllers
    
    public void crearMateria(Materia materia) {
        
        controllerPersist.crearMateria(materia);
    }

    public void eliminarMateriaById(int idmateria) throws NonexistentEntityException {
        
        controllerPersist.eliminarMateriaById(idmateria);
    }

    public void editarMateria(Materia materia) throws Exception {
        
        controllerPersist.editarMateria(materia);
    }

    public Materia buscarMateria(int idMateria) {
        
        return controllerPersist.buscarMateria(idMateria);
    }

    public ArrayList<Materia> buscarMateriaEntidades() {
        
        return controllerPersist.buscarMateriaEntidades();
    }

}

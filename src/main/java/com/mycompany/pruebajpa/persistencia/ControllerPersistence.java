package com.mycompany.pruebajpa.persistencia;

import com.mycompany.pruebajpa.logica.Alumno;
import com.mycompany.pruebajpa.logica.Carrera;
import com.mycompany.pruebajpa.logica.Materia;
import com.mycompany.pruebajpa.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;

public class ControllerPersistence {

    AlumnoJpaController alumnoJpa = new AlumnoJpaController();
    CarreraJpaController carreraJpa = new CarreraJpaController();
    MateriaJpaController materiaJpa = new MateriaJpaController();

    
    // Alumno JPA
    
    public void crearAlumno(Alumno alu) {
        
        alumnoJpa.create(alu);
    }

    public void eliminarAlumno(Alumno alu) throws NonexistentEntityException {
        
        int id = alu.getId();
        alumnoJpa.destroy(id);
    }

    public void eliminarAlumnoById(int id) throws NonexistentEntityException {
        
        alumnoJpa.destroy(id);
    }

    public void editarAlumno(Alumno alu) throws Exception {
        
        alumnoJpa.edit(alu);
    }

    public Alumno buscarAlumno(int id) {
        
        return alumnoJpa.findAlumno(id);
    }

    public ArrayList<Alumno> buscarAlumnoEntities() {
        
        List<Alumno> alumnos = alumnoJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList(alumnos);

        return listaAlumnos;
    }

    // Carrera JPA
    
    public void crearCarrera(Carrera carrera) {
        
        carreraJpa.create(carrera);
    }

    public void eliminarCarreraById(int idCarrera) throws NonexistentEntityException {
        
        carreraJpa.destroy(idCarrera);
    }

    public void editarCarrera(Carrera carrera) throws Exception {
        
        carreraJpa.edit(carrera);
    }

    public Carrera buscarCarrera(int idCarrera) {
        
        return carreraJpa.findCarrera(idCarrera);
    }

    public ArrayList<Carrera> buscarCarreraEntidades() {

        List<Carrera> carreras = carreraJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList(carreras);
        
        return listaCarreras;
    }

    // Materia JPA
    
    public void crearMateria(Materia materia) {

        materiaJpa.create(materia);
    }

    public void eliminarMateriaById(int idmateria) throws NonexistentEntityException {
      
        materiaJpa.destroy(idmateria);
    }

    public void editarMateria(Materia materia) throws Exception {
        
        materiaJpa.edit(materia);
    }

    public Materia buscarMateria(int idMateria) {
        
        return materiaJpa.findMateria(idMateria);
    }

    public ArrayList<Materia> buscarMateriaEntidades() {

        List<Materia> materias = materiaJpa.findMateriaEntities();
        ArrayList<Materia> listaMaterias = new ArrayList(materias);
        
        return listaMaterias;
    }
    
    //
}

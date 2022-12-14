package mx.com.gm.jdbc.jpaprueba.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.jdbc.jpaprueba.logica.Alumno;
import mx.com.gm.jdbc.jpaprueba.persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    
    //3) Recibe el dato de la ControladoraLogica
    public void crearAlumno(Alumno alumno) {
        //4) Llama al create() del alumnoJpaControler
        aluJpa.create(alumno);
    }
    
    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alumno) {
        try {
            aluJpa.edit(alumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno obtenerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> obtenerAlumnos() {
        //Para evitar el casteo, en una lista guardamos todas las entidades.
        List<Alumno> listaAlumnos = aluJpa.findAlumnoEntities();
        //Luego creamos un ArrayList de Alumno, y le pasamos entre parentesis la lista anterior.
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>(listaAlumnos);
        
        return alumnos;
    }
    
}

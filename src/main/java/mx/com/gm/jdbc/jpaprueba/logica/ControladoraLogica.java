package mx.com.gm.jdbc.jpaprueba.logica;

import java.util.ArrayList;
import mx.com.gm.jdbc.jpaprueba.persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();
    
    //1) Recibe un alumno
    public void crearAlumno(Alumno alumno) {
        //2) Llama a la persistencia y le dice que cree un alumno
        controladoraPersistencia.crearAlumno(alumno);
    }
    
    public void eliminarAlumno(int id) {
        controladoraPersistencia.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alumno) {
        controladoraPersistencia.editarAlumno(alumno);
    }
    
    public Alumno obtenerAlumno(int id) {
        return controladoraPersistencia.obtenerAlumno(id);
    }
    
    public ArrayList<Alumno> obtenerAlumnos() {
        return controladoraPersistencia.obtenerAlumnos();
    }
}

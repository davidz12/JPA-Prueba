
package mx.com.gm.jdbc.jpaprueba;

import java.util.Date;
import mx.com.gm.jdbc.jpaprueba.logica.Alumno;
import mx.com.gm.jdbc.jpaprueba.logica.ControladoraLogica;
import mx.com.gm.jdbc.jpaprueba.persistencia.ControladoraPersistencia;

public class JpaPrueba {

    public static void main(String[] args) {
        
        ControladoraLogica control = new ControladoraLogica();
        
        
        Alumno alumno = new Alumno(10, "David", "Zelarayan", new Date());
        
        control.crearAlumno(alumno);
        
    }
}

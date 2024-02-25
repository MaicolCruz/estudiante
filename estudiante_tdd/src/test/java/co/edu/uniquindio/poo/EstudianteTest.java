/**
 * Clase para probar el funcionamiento del código de la informacion de estudiantes
 * @author Maicol Steven Paez Cruz
 * @since 2024-02-20
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Clases para realizar bancos de prueba.
 */
public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(EstudianteTest.class.getName());

    /**
     * Rigorous Test :-)
     */

    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");
        Estudiante estudiante = new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co","315635674", (int) 18);
        assertEquals(estudiante.getNombre(), "Camila");
        assertEquals(estudiante.getApellido(), "Alzate Rios");
        assertEquals(estudiante.getNumeroID(), "109453264");
        assertEquals(estudiante.getCorreo(), "camila@uniquindio.edu.co");
        assertEquals(estudiante.getTelefono(), "315635674");
        assertEquals(estudiante.getEdad(), 18);
        LOG.info("Finalizando test datosCompletos");
    }

    @Test
    public void datosNulos() {
        LOG.info("Inicio datos nulos");
        assertThrows(Throwable.class, () -> new Estudiante(null, null, null, null, null, 18));
        LOG.info("Finalizacion de datos nulos");
    }

    @Test
    public void datosVacios() {
        LOG.info("Inicio datos vacios");
        assertThrows(Throwable.class, () -> new Estudiante("", "", "", "camila@uniquindio.edu.co", "", 18));
        LOG.info("Finalizacion de datos vacios");
    }

    @Test
    public void edadNegativo() {
        LOG.info("Inicio edad negativa");
        assertThrows(Throwable.class, () -> new Estudiante("Camila", "Alzate Rios", "109453264", "camila@uniquindio.edu.co","315635674", (int) -18));
        LOG.info("Finalizacion de  edad negativa");
    }

    
    


}

/**
  * Prueba para verificar que los datos de un estudiante nulo
  */
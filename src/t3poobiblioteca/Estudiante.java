/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3poobiblioteca;

/**
 *
 * @author Acer
 */
public class Estudiante extends Persona {
    private String idEstudiante;
    private int carrera;
    /**
     * @return the idEstudiante
     */
    public String getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * @param idEstudiante the idEstudiante to set
     */
    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    /**
     * @return the carrera
     */
    public int getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(int carrera) {
        this.carrera = carrera;
    }
    
    // Constructor
    public Estudiante(String nombre, String apellido, String idEstudiante, int carrera) {
        super(nombre, apellido);
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
    }

}

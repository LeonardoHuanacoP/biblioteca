/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3poobiblioteca;
import java.util.Date;
import java.util.List;

public class Prestamo {
    private String codigoPrestamo;
    private Estudiante estudiante; 
    private List<String> codigosLibros; 
    private Date fechaPrestamo;
    private String fechaEstimadaDevolucion;
    private float multa;


    /**
     * @return the codigoPrestamo
     */
    public String getCodigoPrestamo() {
        return codigoPrestamo;
    }

    /**
     * @param codigoPrestamo the codigoPrestamo to set
     */
    public void setCodigoPrestamo(String codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    /**
     * @return the estudiante
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * @return the codigosLibros
     */
    public List<String> getCodigosLibros() {
        return codigosLibros;
    }

    /**
     * @param codigosLibros the codigosLibros to set
     */
    public void setCodigosLibros(List<String> codigosLibros) {
        this.codigosLibros = codigosLibros;
    }

    /**
     * @return the fechaPrestamo
     */
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * @param fechaPrestamo the fechaPrestamo to set
     */
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * @return the fechaEstimadaDevolucion
     */
    public String getFechaEstimadaDevolucion() {
        return fechaEstimadaDevolucion;
    }

    /**
     * @param fechaEstimadaDevolucion the fechaEstimadaDevolucion to set
     */
    public void setFechaEstimadaDevolucion(String fechaEstimadaDevolucion) {
        this.fechaEstimadaDevolucion = fechaEstimadaDevolucion;
    }

    /**
     * @return the multa
     */
    public float getMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(float multa) {
        this.multa = multa;
    }
    
    // Constructor
    public Prestamo(String codigoPrestamo, Estudiante estudiante, List<String> codigosLibros, Date fechaPrestamo, String fechaEstimadaDevolucion, float multa) {
        this.codigoPrestamo = codigoPrestamo;
        this.estudiante = estudiante;
        this.codigosLibros = codigosLibros;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEstimadaDevolucion = fechaEstimadaDevolucion;
        this.multa = multa;
    }

    
}

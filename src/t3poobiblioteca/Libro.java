/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3poobiblioteca;

/**
 *
 * @author Acer
 */
public class Libro {
    private String codigoLibro;
    private String tituloLibro;
    private String autorLibro;
    private int cantidad;
    private boolean estado;

    /**
     * @return the codigoLibro
     */
    public String getCodigoLibro() {
        return codigoLibro;
    }

    /**
     * @param codigoLibro the codigoLibro to set
     */
    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    /**
     * @return the tituloLibro
     */
    public String getTituloLibro() {
        return tituloLibro;
    }

    /**
     * @param tituloLibro the tituloLibro to set
     */
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    /**
     * @return the autorLibro
     */
    public String getAutorLibro() {
        return autorLibro;
    }

    /**
     * @param autorLibro the autorLibro to set
     */
    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public Libro(String codigoLibro, String tituloLibro, String autorLibro, int cantidad, boolean estado) {
        this.codigoLibro = codigoLibro;
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.cantidad = cantidad;
        this.estado = estado;
    }
    
}

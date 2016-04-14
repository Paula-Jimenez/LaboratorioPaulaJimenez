/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author PaulaJCh
 */
public class Registro {
    private String numeroRegistro;
    private String nombre;
    private String cedula;
    private String placa;

    public Registro(String numeroRegistro, String nombre, String cedula, String placa) {
        this.numeroRegistro = numeroRegistro;
        this.nombre = nombre;
        this.cedula = cedula;
        this.placa = placa;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getInformacion()
   {
       return "numeroRegistro: " +numeroRegistro+"Cedula: " +cedula+ "Nombre: " +nombre+"Placa: "+placa;
   } 
}

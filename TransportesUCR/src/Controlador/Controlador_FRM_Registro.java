/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Metodos;
import Vista.FRM_Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author PaulaJCh
 */

public class Controlador_FRM_Registro implements ActionListener{

    FRM_Registro frm_Registro;
    Metodos metodos;

    public Controlador_FRM_Registro (FRM_Registro frm_Registro)
    {
        this.frm_Registro = frm_Registro;
        metodos=new Metodos();
    }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Consultar"))
        {
            buscar();
        }
        if(e.getActionCommand().equals("Agregar"))
        {
            metodos.agregar(frm_Registro.devolverInformacion());
            metodos.mostrarInformacion();
            frm_Registro.limpiarInterfaz();
            frm_Registro.estadoInicial();
            frm_Registro.mostrarMensaje("Se Agrego el registro correctamente");
        }
        if(e.getActionCommand().equals("Modificar"))
        {
            metodos.modificarRegistro(frm_Registro.devolverInformacion());
            frm_Registro.deshabilitarNumeroR();
            frm_Registro.limpiarInterfaz();
            frm_Registro.estadoInicial();
            frm_Registro.mostrarMensaje("Se Modifico el registro correctamente");
        }
        if(e.getActionCommand().equals("Eliminar"))
        {
            metodos.eliminarRegistro(frm_Registro.devolverInformacion());
            frm_Registro.limpiarInterfaz();
            frm_Registro.estadoInicial();
            frm_Registro.mostrarMensaje("Se Elimino el registro correctamente");
        }
        
    }
    public void buscar()
    {
        if(metodos.consultarRegistro(frm_Registro.devolverNumeroRegistro()))
        {
            frm_Registro.mostrarInformacion(metodos.getArreglo());
            frm_Registro.habilitarOpciones();
        }
        else
        {
            frm_Registro.habilitarAgregar();
            frm_Registro.limpiarInterfaz();
            frm_Registro.mostrarMensaje("No se encontro información de este número de registro");
            
        }
    
    }
    
    public String colocarNumeroR() 
    { 
        return metodos.devolverNumeroR(frm_Registro.colocarNumeroR());
    }
}

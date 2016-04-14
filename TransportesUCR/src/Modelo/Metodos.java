/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author PaulaJCh
 */
public class Metodos {
     ArrayList<Registro> arrayRegistro;
    String arregloDatos[];
    
    public  Metodos()
    {
        arrayRegistro=new ArrayList<Registro>();
        arregloDatos=new String[3];    
    }
    
    public boolean consultarRegistro(String numeroRegistro)
    {
        boolean encontrado = false;
         
        for(int i=0;i<arrayRegistro.size();i++){
            if(arrayRegistro.get(i).getNumeroRegistro().equals(numeroRegistro)){
                arregloDatos[0]=arrayRegistro.get(i).getNombre();
                arregloDatos[1]=arrayRegistro.get(i).getCedula();
                arregloDatos[2]=arrayRegistro.get(i).getPlaca();
                
            encontrado=true;
            }
        }
        return encontrado;
    }
    
    public String[] getArreglo()
    {
         return this.arregloDatos;
    }    
    
    public void agregar(String informacion[])
    {   
        Registro temporal= new Registro(informacion[0],informacion[1], informacion[2],informacion[3]);
        arrayRegistro.add(temporal);
    }
    
    public void mostrarInformacion()
    {
        Registro temporal;
        temporal= arrayRegistro.get(0);
        System.out.println(temporal.getInformacion());
    }
    
    
    public void modificarRegistro (String informacion[]){
        for(int i=0;i<arrayRegistro.size();i ++)
        {
             if(arrayRegistro.get(i).getNumeroRegistro().equals(informacion[0])){
                 
                 arrayRegistro.get(i).setNumeroRegistro(informacion[0]);
                 arrayRegistro.get(i).setNombre(informacion[1]);
                 arrayRegistro.get(i).setCedula(informacion[2]);
                 arrayRegistro.get(i).setPlaca(informacion[3]);
             }
        }
    }
    
    
    public void eliminarRegistro(String informacion[])
    {
        System.out.println(arrayRegistro.size());
        
        for(int i=0;i<arrayRegistro.size();i ++)
        {
            if(arrayRegistro.get(i).getNumeroRegistro().equals(informacion[0])){
                arrayRegistro.remove(i);
            }
            System.out.println(arrayRegistro.size());
        } 
    }
    
    public String devolverNumeroR() 
    {
        String NumeroRegistro=" ";
        
        if(arrayRegistro.size()==0)
        {
            NumeroRegistro="001";
        }
        else
        {
            for(int contador=0; contador<arrayRegistro.size();contador++)
            {
                if(arrayRegistro.get(contador)!=null)
                {
               NumeroRegistro=arrayRegistro.get(contador).getNumeroRegistro();
                }
            }
                 int numero=Integer.parseInt(NumeroRegistro);
                    numero++;
                    NumeroRegistro=""+numero;
        }
        return NumeroRegistro;
    }
}

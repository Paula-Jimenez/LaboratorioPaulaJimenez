/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_Registro;

/**
 *
 * @author PaulaJCh
 */
public class GUI_Informacion extends javax.swing.JPanel {

    /**
     * Creates new form GUI_Informacion
     */
    Controlador_FRM_Registro controlador;
    public GUI_Informacion() {
        initComponents();
    }
    
     public String[] devolverInformacion()
    {
        String arreglo[];
        arreglo=new String[4];
        arreglo[0]=this.jt_NumeroRegistro.getText();
        arreglo[1]=this.jt_Nombre.getText();
        arreglo[2]=this.jt_Cedula.getText();
        arreglo[3]=this.jt_Placa.getText();
         
        return arreglo;
    }
    
    public String devolverNumeroRegistro()
    {
        return jt_NumeroRegistro.getText();
        
    }
    
    public void mostrarInformacion(String arreglo[])
    {
        this.jt_Nombre.setText(arreglo[0]);
        this.jt_Cedula.setText(arreglo[1]);
        this.jt_Placa.setText(arreglo[2]);
    }
    
     public void limpiarInterfaz()
    {
        this.jt_NumeroRegistro.setText("");
        this.jt_Nombre.setText("");
        this.jt_Cedula.setText("");
        this.jt_Placa.setText("");
    }
     public void habilitarOpciones()
     {
         this.jt_NumeroRegistro.setEnabled(false);
         this.jt_Nombre.setEnabled(true);
         this.jt_Cedula.setEnabled(true);
         this.jt_Placa.setEnabled(true);
     }
      public void habilitarAgregar()
     {
         this.jt_NumeroRegistro.setEnabled(true);
         this.jt_Nombre.setEnabled(true);
         this.jt_Cedula.setEnabled(true);
         this.jt_Placa.setEnabled(true);
     }
     public void estadoInicial()
     {
         this.jt_NumeroRegistro.setEnabled(true);
         this.jt_Nombre.setEnabled(false);
         this.jt_Cedula.setEnabled(false);
         this.jt_Placa.setEnabled(false);
     }
     public void colocarNumeroR()
    {
       this.jt_NumeroRegistro.setText(controlador.colocarNumeroR());
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_NumeroRegistro = new javax.swing.JLabel();
        jl_Nombre = new javax.swing.JLabel();
        jl_Cedula = new javax.swing.JLabel();
        jl_Placa = new javax.swing.JLabel();
        jt_NumeroRegistro = new javax.swing.JTextField();
        jt_Nombre = new javax.swing.JTextField();
        jt_Cedula = new javax.swing.JTextField();
        jt_Placa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jl_NumeroRegistro.setText("Número de Registro:");

        jl_Nombre.setText("Nombre del Dueño:");

        jl_Cedula.setText("Cédula del Dueño:");

        jl_Placa.setText("Placa del Automóvil:");

        jLabel5.setText("Registro de Transportes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_Placa)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jl_NumeroRegistro)
                                .addComponent(jl_Nombre)
                                .addComponent(jl_Cedula)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jt_NumeroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jt_Cedula)
                                .addComponent(jt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel5)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NumeroRegistro)
                    .addComponent(jt_NumeroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nombre)
                    .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Cedula)
                    .addComponent(jt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Placa)
                    .addComponent(jt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jl_Cedula;
    private javax.swing.JLabel jl_Nombre;
    private javax.swing.JLabel jl_NumeroRegistro;
    private javax.swing.JLabel jl_Placa;
    private javax.swing.JTextField jt_Cedula;
    private javax.swing.JTextField jt_Nombre;
    private javax.swing.JTextField jt_NumeroRegistro;
    private javax.swing.JTextField jt_Placa;
    // End of variables declaration//GEN-END:variables
}

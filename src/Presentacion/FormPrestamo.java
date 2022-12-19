
package Presentacion;

import Datos.ConectionSingleton;
import Datos.Prestamo;
import Datos.DetallePrestamo;
import Negocio.PrestamoConcreteParticipant;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormPrestamo extends javax.swing.JFrame {


    private PrestamoConcreteParticipant prestamo; 
      
    public FormPrestamo() {
        initComponents();
        jTable_Carrito.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        prestamo = new PrestamoConcreteParticipant();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        Prestar = new javax.swing.JButton();
        NroRegistro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Carrito = new javax.swing.JTable();
        CodigoLibro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AdicionarDetalle = new javax.swing.JButton();
        FechaFin = new com.toedter.calendar.JDateChooser();
        FechaInicio = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Prestar.setText("Prestar");
        Prestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestarActionPerformed(evt);
            }
        });

        NroRegistro.setName("NroRegistro"); // NOI18N

        jLabel2.setText("NRO REGISTRO");

        jLabel3.setText("FECHA INICIO");

        jLabel4.setText("FECHA FIN");

        jTable_Carrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Libro"
            }
        ));
        jScrollPane2.setViewportView(jTable_Carrito);

        CodigoLibro.setName("CodigoLibro"); // NOI18N

        jLabel5.setText("Codigo Libro");

        AdicionarDetalle.setText(">>>");
        AdicionarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarDetalleActionPerformed(evt);
            }
        });

        jButton1.setText("eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(FechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE)
                        .addComponent(Prestar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(CodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(AdicionarDetalle))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(AdicionarDetalle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prestar)
                    .addComponent(jButton1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        CodigoLibro.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestarActionPerformed
      String response=prestamo.save((int)System.nanoTime(),getPrestamo(),getDetallePrestamo()); 
      JOptionPane.showMessageDialog(null, response);
    }//GEN-LAST:event_PrestarActionPerformed

    private void AdicionarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarDetalleActionPerformed
           // TODO add your handling code here:
        String[] columnNames = { "Codigo Libro",};
        DefaultTableModel table = new DefaultTableModel(columnNames, 0);
        table.setRowCount(this.jTable_Carrito.getRowCount()+1);
        int i=0;
        while(i < this.jTable_Carrito.getRowCount()){
            table.setValueAt(this.jTable_Carrito.getValueAt(i, 0), i, 0);
           
            i++;
        }
        int CodigoLibro = Integer.parseInt(this.CodigoLibro.getText());
        table.setValueAt(CodigoLibro, i,0);
        this.jTable_Carrito.setModel(table);
    }//GEN-LAST:event_AdicionarDetalleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable_Carrito.getModel();
        int x=jTable_Carrito.getSelectedRow();
        if(x!=-1) {
            model.removeRow(x);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private Prestamo getPrestamo() {
        Prestamo aux = new Prestamo();
        aux.RegistroEstudiante=   NroRegistro.getText();
        aux.FechaInicio= FechaInicio.getDate();
        aux.FechaFin=FechaFin.getDate();
        return aux;
    }
    
    private ArrayList<DetallePrestamo> getDetallePrestamo(){
        ArrayList<DetallePrestamo> lista = new ArrayList<>();
        int i=0;
        while(i < this.jTable_Carrito.getRowCount()){
            int CodigoLibro = Integer.parseInt(this.jTable_Carrito.getValueAt(i, 0).toString());          
            lista.add(new DetallePrestamo( CodigoLibro));
            i++;
        }
        return lista;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarDetalle;
    private javax.swing.JTextField CodigoLibro;
    private com.toedter.calendar.JDateChooser FechaFin;
    private com.toedter.calendar.JDateChooser FechaInicio;
    private javax.swing.JTextField NroRegistro;
    private javax.swing.JButton Prestar;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable_Carrito;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Reportes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import sistemareservahospedajes.Menu;

/**
 *
 * @author Alejandro
 */
public class FormularioReporteReservas extends javax.swing.JFrame {

    /**
     * Creates new form FormularioReporteReservas
     */
    public FormularioReporteReservas() {
        initComponents();
        this.setLocationRelativeTo(null);
        leerTodosReportesReservas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tablaReservas = new javax.swing.JScrollPane();
        tablaReservas1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaReservas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaReservas1.setEnabled(false);
        tablaReservas.setViewportView(tablaReservas1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("REPORTE DE TODAS LAS RESERVAS DE HABITACION");

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnMenu.setText("Volver al menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("****Reporte detallado de todas las reservadas que se han realizado despues de realizar el CheckOut****");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tablaReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnMenu)
                        .addGap(52, 52, 52)
                        .addComponent(btnAtras)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(tablaReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu)
                    .addComponent(btnAtras))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        FormularioReportes fReportes = new FormularioReportes();
        fReportes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioReporteReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioReporteReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioReporteReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioReporteReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioReporteReservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane tablaReservas;
    private javax.swing.JTable tablaReservas1;
    // End of variables declaration//GEN-END:variables

    public void leerTodosReportesReservas()
    {
        File archivo = new File("ReporteReservasHabitaciones.csv");
        try{
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea1 = br.readLine().trim();
            String[] nombreColumnas = linea1.split(";");
            DefaultTableModel modelo = (DefaultTableModel)tablaReservas1.getModel();
            modelo.setColumnIdentifiers(nombreColumnas);
            
            DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
            alinear.setHorizontalAlignment(SwingConstants.CENTER);

            tablaReservas1.setModel(modelo);
            tablaReservas1.getColumnModel().getColumn(0).setPreferredWidth(40);
            tablaReservas1.getColumnModel().getColumn(0).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(0).setCellRenderer(alinear);
            tablaReservas1.getColumnModel().getColumn(1).setPreferredWidth(150);
            tablaReservas1.getColumnModel().getColumn(1).setCellRenderer(alinear);
            tablaReservas1.getColumnModel().getColumn(1).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(2).setPreferredWidth(88);
            tablaReservas1.getColumnModel().getColumn(2).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(2).setCellRenderer(alinear);
            tablaReservas1.getColumnModel().getColumn(3).setPreferredWidth(88);
            tablaReservas1.getColumnModel().getColumn(3).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(3).setCellRenderer(alinear);
            tablaReservas1.getColumnModel().getColumn(4).setPreferredWidth(100);
            tablaReservas1.getColumnModel().getColumn(4).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(4).setCellRenderer(alinear);
            tablaReservas1.getColumnModel().getColumn(5).setPreferredWidth(60);
            tablaReservas1.getColumnModel().getColumn(5).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(5).setCellRenderer(alinear);
            tablaReservas1.getColumnModel().getColumn(6).setPreferredWidth(65);
            tablaReservas1.getColumnModel().getColumn(6).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(6).setCellRenderer(alinear);
            tablaReservas1.getColumnModel().getColumn(7).setPreferredWidth(55);
            tablaReservas1.getColumnModel().getColumn(7).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(7).setCellRenderer(alinear);
            tablaReservas1.getColumnModel().getColumn(8).setPreferredWidth(80);
            tablaReservas1.getColumnModel().getColumn(8).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(8).setCellRenderer(alinear);
            tablaReservas1.getColumnModel().getColumn(9).setPreferredWidth(140);
            tablaReservas1.getColumnModel().getColumn(9).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(9).setCellRenderer(alinear);
            tablaReservas1.getColumnModel().getColumn(10).setPreferredWidth(80);
            tablaReservas1.getColumnModel().getColumn(10).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(10).setCellRenderer(alinear);
            tablaReservas1.getColumnModel().getColumn(11).setPreferredWidth(90);
            tablaReservas1.getColumnModel().getColumn(11).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(11).setCellRenderer(alinear);  
            tablaReservas1.getColumnModel().getColumn(12).setPreferredWidth(80);
            tablaReservas1.getColumnModel().getColumn(12).setResizable(false);
            tablaReservas1.getColumnModel().getColumn(12).setCellRenderer(alinear);
            
            Object[] lineaTabla = br.lines().toArray();
            
            for(int i = 0;i<lineaTabla.length;i++)
            {
                System.out.println(lineaTabla.length);
                String linea = lineaTabla[i].toString().trim();
                String[] dataRow = linea.split(";");
                modelo.addRow(dataRow);
            }
            
        }
        catch(Exception e)
        {
            
        }
    }
    
    
}

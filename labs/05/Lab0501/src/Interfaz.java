import java.awt.BorderLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Interfaz extends javax.swing.JFrame {

    Entrada entrada = new Entrada();
    
    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Beneficiario Colombia mayor por Apellido");

        jButton1.setText("Generar graficas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jRadioButton1.setText("Tiene");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("No tiene");

        jRadioButton3.setText("Todos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Filtro por segundo nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton1)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int[] personasPorApellidosTodos = entrada.personasPorApellidosTodos();
        int[] personasPorApellidosNombre = entrada.personasPorApellidosNombre();
        int[] apellidosGraficar = new int[12];
        
        boolean[] botones = new boolean[]{jRadioButton1.isSelected(),jRadioButton2.isSelected(),jRadioButton3.isSelected()};
        
        if(botones[0]&!botones[1]){
            for(int i=0;i<12;i++){
                apellidosGraficar[i]=personasPorApellidosTodos[i]-personasPorApellidosNombre[i];
            }
        }
        if(!botones[0]&botones[1]){
            for(int i=0;i<12;i++){
                apellidosGraficar[i]=personasPorApellidosNombre[i];
            }
        }
        if(botones[0]==botones[1]||botones[2]){
            for(int i=0;i<12;i++){
                apellidosGraficar[i]=personasPorApellidosTodos[i];
            }
        }
        
        //Barras
        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        datos.setValue(apellidosGraficar[0], "RODRIGUEZ", "Apellido");
        datos.setValue(apellidosGraficar[1], "GARCIA", "Apellido");
        datos.setValue(apellidosGraficar[2], "GOMEZ", "Apellido");
        datos.setValue(apellidosGraficar[3], "RESTREPO", "Apellido");
        datos.setValue(apellidosGraficar[4], "MORENO", "Apellido");
        datos.setValue(apellidosGraficar[5], "GONZALEZ", "Apellido");
        datos.setValue(apellidosGraficar[6], "SANCHEZ", "Apellido");
        datos.setValue(apellidosGraficar[7], "PEREZ", "Apellido");
        datos.setValue(apellidosGraficar[8], "ORTIZ", "Apellido");
        datos.setValue(apellidosGraficar[9], "DIAZ", "Apellido");
        datos.setValue(apellidosGraficar[10], "MARTINEZ", "Apellido");
        datos.setValue(apellidosGraficar[11], "GUERRERO", "Apellido");
        
        JFreeChart barras = ChartFactory.createBarChart("Personas por apellido", "Apellido", "Personas", datos, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel1 = new ChartPanel(barras);
        panel1.setMouseWheelEnabled(true);

        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(panel1, BorderLayout.NORTH);
        pack();
        repaint();
        
        //Pastel
        float prueba=0;
        for(int i=0;i<12;i++){
            prueba+=apellidosGraficar[i];
        }
        
                
        DefaultPieDataset datos1 = new DefaultPieDataset();

        datos1.setValue("RODRIGUEZ (" + (apellidosGraficar[0] * 100) / prueba + "%)", apellidosGraficar[0]);
        datos1.setValue("GARCIA (" + (apellidosGraficar[1] * 100) / prueba + "%)", apellidosGraficar[1]);
        datos1.setValue("GOMEZ (" + (apellidosGraficar[2] * 100) / prueba + "%)", apellidosGraficar[2]);
        datos1.setValue("RESTREPO (" + (apellidosGraficar[3] * 100) / prueba + "%)", apellidosGraficar[3]);
        datos1.setValue("MORENO (" + (apellidosGraficar[4] * 100) / prueba + "%)", apellidosGraficar[4]);
        datos1.setValue("GONZALEZ (" + (apellidosGraficar[5] * 100) / prueba + "%)", apellidosGraficar[5]);
        datos1.setValue("SANCHEZ (" + (apellidosGraficar[6] * 100) / prueba + "%)", apellidosGraficar[6]);
        datos1.setValue("PEREZ (" + (apellidosGraficar[7] * 100) / prueba + "%)", apellidosGraficar[7]);
        datos1.setValue("ORTIZ (" + (apellidosGraficar[8] * 100) / prueba + "%)", apellidosGraficar[8]);
        datos1.setValue("DIAZ (" + (apellidosGraficar[9] * 100) / prueba + "%)", apellidosGraficar[9]);
        datos1.setValue("MARTINEZ (" + (apellidosGraficar[10] * 100) / prueba + "%)", apellidosGraficar[10]);
        datos1.setValue("GUERRERO (" + (apellidosGraficar[11] * 100) / prueba + "%)", apellidosGraficar[11]);
        
        JFreeChart pastel = ChartFactory.createPieChart("Personas por apellido", datos1, true, true, false);

        ChartPanel panel_temporal = new ChartPanel(pastel);
        panel_temporal.setMouseWheelEnabled(true);

        jPanel2.setLayout(new BorderLayout());
        jPanel2.add(panel_temporal, BorderLayout.NORTH);

        pack();
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}

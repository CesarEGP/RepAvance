package Formularios;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class VentanaEstadistica3 extends javax.swing.JFrame {
    
    TableRowSorter<DefaultTableModel> sorter;
    
 
    
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelRound2 = new Background.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        panelRound1 = new Background.PanelRound();
        jbt_volver_ElecEstadistica3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_estadistica3 = new javax.swing.JTable();
        jbt_filtrarEstad2 = new javax.swing.JButton();
        jbt_exportar4 = new javax.swing.JButton();
        jtf_institucion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Id");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addContainerGap(548, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estadistica Tipo 3");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 430, 60));

        panelRound1.setBackground(new java.awt.Color(51, 51, 51));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);

        jbt_volver_ElecEstadistica3.setBackground(new java.awt.Color(32, 84, 95));
        jbt_volver_ElecEstadistica3.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_volver_ElecEstadistica3.setText("Volver ");
        jbt_volver_ElecEstadistica3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volver_ElecEstadistica3ActionPerformed(evt);
            }
        });

        jtb_estadistica3.setAutoCreateRowSorter(true);
        jtb_estadistica3.setBackground(new java.awt.Color(255, 255, 255));
        jtb_estadistica3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtb_estadistica3.setForeground(new java.awt.Color(0, 0, 0));
        jtb_estadistica3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Institucion", null, null, "", null, null, null, null, null, null, null, null, null, null, null, null},
                {"Femenino", null, null, "", null, null, null, null, null, null, null, null, null, null, null, null},
                {"Masculino", null, null, "", null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Etiqueta Filtro", "Negativo", "Positivo", "Total Aspirado Traqueal", "Negativo", "Positivo", "Total Hisopado Nasal y Faringeo", "Negativo", "Positivo", "Total Lavado Broncoalveolar", "Negativo", "Positivo", "Total Tejido Pulmonar", "Negativo", "Positivo", "Total Generado"
            }
        ));
        jtb_estadistica3.setAlignmentX(1.0F);
        jtb_estadistica3.setAlignmentY(1.0F);
        jtb_estadistica3.setGridColor(new java.awt.Color(153, 153, 153));
        jtb_estadistica3.setName(""); // NOI18N
        jtb_estadistica3.setRowHeight(30);
        jScrollPane1.setViewportView(jtb_estadistica3);
        if (jtb_estadistica3.getColumnModel().getColumnCount() > 0) {
            jtb_estadistica3.getColumnModel().getColumn(0).setMinWidth(100);
            jtb_estadistica3.getColumnModel().getColumn(0).setPreferredWidth(200);
            jtb_estadistica3.getColumnModel().getColumn(3).setPreferredWidth(200);
            jtb_estadistica3.getColumnModel().getColumn(6).setPreferredWidth(200);
            jtb_estadistica3.getColumnModel().getColumn(9).setPreferredWidth(200);
            jtb_estadistica3.getColumnModel().getColumn(12).setPreferredWidth(200);
            jtb_estadistica3.getColumnModel().getColumn(15).setPreferredWidth(200);
        }

        jbt_filtrarEstad2.setBackground(new java.awt.Color(78, 116, 111));
        jbt_filtrarEstad2.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_filtrarEstad2.setText("Filtrar");
        jbt_filtrarEstad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_filtrarEstad2ActionPerformed(evt);
            }
        });

        jbt_exportar4.setBackground(new java.awt.Color(32, 84, 95));
        jbt_exportar4.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_exportar4.setText("Exportar");
        jbt_exportar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_exportar4ActionPerformed(evt);
            }
        });

        jtf_institucion.setBackground(new java.awt.Color(255, 255, 255));
        jtf_institucion.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jtf_institucion.setForeground(new java.awt.Color(0, 0, 0));
        jtf_institucion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_institucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_institucionActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Institucion");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbt_volver_ElecEstadistica3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_institucion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addComponent(jbt_filtrarEstad2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addComponent(jbt_exportar4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jbt_volver_ElecEstadistica3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtf_institucion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_exportar4)
                    .addComponent(jbt_filtrarEstad2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jPanel2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1240, 740));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1270, 880));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbt_exportar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_exportar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_exportar4ActionPerformed

    private void jbt_filtrarEstad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_filtrarEstad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_filtrarEstad2ActionPerformed

    private void jbt_volver_ElecEstadistica3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volver_ElecEstadistica3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_volver_ElecEstadistica3ActionPerformed

    private void jtf_institucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_institucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_institucionActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_exportar4;
    private javax.swing.JButton jbt_filtrarEstad2;
    private javax.swing.JButton jbt_volver_ElecEstadistica3;
    private javax.swing.JTable jtb_estadistica3;
    private javax.swing.JTextField jtf_institucion;
    private Background.PanelRound panelRound1;
    private Background.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}

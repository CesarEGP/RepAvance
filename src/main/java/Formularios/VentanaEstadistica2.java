package Formularios;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class VentanaEstadistica2 extends javax.swing.JFrame {
    
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
        jbt_volver_ElecEstadistica2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_estadistica2 = new javax.swing.JTable();
        jbt_filtrarEstd2 = new javax.swing.JButton();
        jbt_exportar3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jcb_departamento_estad2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jcb_generoestad2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jtf_distritoestad2 = new javax.swing.JTextField();
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
        jLabel6.setText("Estadistica Tipo 2");

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

        jbt_volver_ElecEstadistica2.setBackground(new java.awt.Color(32, 84, 95));
        jbt_volver_ElecEstadistica2.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_volver_ElecEstadistica2.setText("Volver ");
        jbt_volver_ElecEstadistica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volver_ElecEstadistica2ActionPerformed(evt);
            }
        });

        jtb_estadistica2.setAutoCreateRowSorter(true);
        jtb_estadistica2.setBackground(new java.awt.Color(255, 255, 255));
        jtb_estadistica2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jtb_estadistica2.setForeground(new java.awt.Color(0, 0, 0));
        jtb_estadistica2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Departamento", null, null, null},
                {"Distrito", null, null, null},
                {"Sexo", null, null, null}
            },
            new String [] {
                "Etiqueta Filtro", "Total Generado", "Positivo", "Negativo"
            }
        ));
        jtb_estadistica2.setAlignmentX(1.0F);
        jtb_estadistica2.setAlignmentY(1.0F);
        jtb_estadistica2.setGridColor(new java.awt.Color(153, 153, 153));
        jtb_estadistica2.setName(""); // NOI18N
        jtb_estadistica2.setRowHeight(30);
        jScrollPane1.setViewportView(jtb_estadistica2);

        jbt_filtrarEstd2.setBackground(new java.awt.Color(78, 116, 111));
        jbt_filtrarEstd2.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_filtrarEstd2.setText("Filtrar");
        jbt_filtrarEstd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_filtrarEstd2ActionPerformed(evt);
            }
        });

        jbt_exportar3.setBackground(new java.awt.Color(32, 84, 95));
        jbt_exportar3.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_exportar3.setText("Exportar");
        jbt_exportar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_exportar3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Departamento");

        jcb_departamento_estad2.setBackground(new java.awt.Color(255, 255, 255));
        jcb_departamento_estad2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jcb_departamento_estad2.setForeground(new java.awt.Color(0, 0, 0));
        jcb_departamento_estad2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Áncash", "Apurímac", "Arequipa", "Ayacucho", "Cajamarca", "Cusco", "Huancavelica", "Huánuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios: Puerto", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));

        jLabel7.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sexo");

        jcb_generoestad2.setBackground(new java.awt.Color(255, 255, 255));
        jcb_generoestad2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jcb_generoestad2.setForeground(new java.awt.Color(0, 0, 0));
        jcb_generoestad2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel14.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Distrito");

        jtf_distritoestad2.setBackground(new java.awt.Color(255, 255, 255));
        jtf_distritoestad2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jtf_distritoestad2.setForeground(new java.awt.Color(0, 0, 0));
        jtf_distritoestad2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_distritoestad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_distritoestad2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(945, Short.MAX_VALUE)
                .addComponent(jbt_volver_ElecEstadistica2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jbt_filtrarEstd2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)
                        .addComponent(jbt_exportar3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcb_departamento_estad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169)))
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jtf_distritoestad2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcb_generoestad2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jbt_volver_ElecEstadistica2)
                .addGap(65, 65, 65)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jcb_departamento_estad2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jtf_distritoestad2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcb_generoestad2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_filtrarEstd2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_exportar3))
                .addGap(143, 143, 143))
        );

        jPanel2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1140, 730));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1180, 850));

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

    private void jbt_exportar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_exportar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_exportar3ActionPerformed

    private void jbt_filtrarEstd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_filtrarEstd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_filtrarEstd2ActionPerformed

    private void jbt_volver_ElecEstadistica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volver_ElecEstadistica2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_volver_ElecEstadistica2ActionPerformed

    private void jtf_distritoestad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_distritoestad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_distritoestad2ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_exportar3;
    private javax.swing.JButton jbt_filtrarEstd2;
    private javax.swing.JButton jbt_volver_ElecEstadistica2;
    private javax.swing.JComboBox<String> jcb_departamento_estad2;
    private javax.swing.JComboBox<String> jcb_generoestad2;
    private javax.swing.JTable jtb_estadistica2;
    private javax.swing.JTextField jtf_distritoestad2;
    private Background.PanelRound panelRound1;
    private Background.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}

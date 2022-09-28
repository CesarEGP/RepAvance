package Formularios;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class VentanaBuscar extends javax.swing.JFrame {
    
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
        jLabel2 = new javax.swing.JLabel();
        jbt_buscar = new javax.swing.JButton();
        jbt_volver_Eleccion = new javax.swing.JButton();
        jtf_busqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_busqueda = new javax.swing.JTable();
        jcb_eleccion_busqueda = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jbt_filtrar1 = new javax.swing.JButton();
        chb_sexo = new javax.swing.JCheckBox();
        chb_departamento = new javax.swing.JCheckBox();
        chb_edad = new javax.swing.JCheckBox();
        chb_provincia = new javax.swing.JCheckBox();
        chb_distrito = new javax.swing.JCheckBox();
        chb_tipo = new javax.swing.JCheckBox();
        chb_resultado = new javax.swing.JCheckBox();
        jbt_exportar1 = new javax.swing.JButton();
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
        jLabel6.setText("Buscar Paciente");

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

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dubai Light", 1, 30)); // NOI18N
        jLabel2.setText("Ingrese el tipo de dato que desea buscar");

        jbt_buscar.setBackground(new java.awt.Color(78, 116, 111));
        jbt_buscar.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_buscar.setText("Buscar");
        jbt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_buscarActionPerformed(evt);
            }
        });

        jbt_volver_Eleccion.setBackground(new java.awt.Color(32, 84, 95));
        jbt_volver_Eleccion.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_volver_Eleccion.setText("Volver ");
        jbt_volver_Eleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volver_EleccionActionPerformed(evt);
            }
        });

        jtf_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        jtf_busqueda.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtf_busqueda.setForeground(new java.awt.Color(0, 0, 0));
        jtf_busqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_busquedaActionPerformed(evt);
            }
        });

        jtb_busqueda.setAutoCreateRowSorter(true);
        jtb_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        jtb_busqueda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtb_busqueda.setForeground(new java.awt.Color(255, 255, 255));
        jtb_busqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Edad", "Sexo", "Departamento", "Provincia", "Distrito", "Tipo Muestra", "Resultado"
            }
        ));
        jtb_busqueda.setColumnSelectionAllowed(false);
        jtb_busqueda.setGridColor(new java.awt.Color(153, 153, 153));
        jtb_busqueda.setName(""); // NOI18N
        jScrollPane1.setViewportView(jtb_busqueda);

        jcb_eleccion_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        jcb_eleccion_busqueda.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jcb_eleccion_busqueda.setForeground(new java.awt.Color(0, 0, 0));
        jcb_eleccion_busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UUID", "Fecha muestra", "Institución", "Ubigeo" }));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dubai Light", 1, 30)); // NOI18N
        jLabel3.setText("Filtrar por");

        jbt_filtrar1.setBackground(new java.awt.Color(78, 116, 111));
        jbt_filtrar1.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_filtrar1.setText("Filtrar");
        jbt_filtrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_filtrar1ActionPerformed(evt);
            }
        });

        chb_sexo.setBackground(new java.awt.Color(102, 102, 102));
        chb_sexo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chb_sexo.setText("Sexo");
        chb_sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_sexoActionPerformed(evt);
            }
        });

        chb_departamento.setBackground(new java.awt.Color(102, 102, 102));
        chb_departamento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chb_departamento.setText("Departamento");

        chb_edad.setBackground(new java.awt.Color(102, 102, 102));
        chb_edad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chb_edad.setText("Edad\n");

        chb_provincia.setBackground(new java.awt.Color(102, 102, 102));
        chb_provincia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chb_provincia.setText("Provincia");
        chb_provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_provinciaActionPerformed(evt);
            }
        });

        chb_distrito.setBackground(new java.awt.Color(102, 102, 102));
        chb_distrito.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chb_distrito.setText("Distrito");
        chb_distrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_distritoActionPerformed(evt);
            }
        });

        chb_tipo.setBackground(new java.awt.Color(102, 102, 102));
        chb_tipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chb_tipo.setText("Tipo Muestra");
        chb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_tipoActionPerformed(evt);
            }
        });

        chb_resultado.setBackground(new java.awt.Color(102, 102, 102));
        chb_resultado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        chb_resultado.setText("Resultado");
        chb_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_resultadoActionPerformed(evt);
            }
        });

        jbt_exportar1.setBackground(new java.awt.Color(32, 84, 95));
        jbt_exportar1.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_exportar1.setText("Exportar");
        jbt_exportar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_exportar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(jcb_eleccion_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jtf_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbt_volver_Eleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRound1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(chb_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelRound1Layout.createSequentialGroup()
                                        .addGap(389, 389, 389)
                                        .addComponent(jbt_filtrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbt_exportar1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbt_volver_Eleccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_eleccion_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chb_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chb_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chb_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chb_distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbt_filtrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbt_exportar1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 1110, 680));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 800));

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

    private void jtf_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_busquedaActionPerformed

    private void jbt_volver_EleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volver_EleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_volver_EleccionActionPerformed

    private void jbt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_buscarActionPerformed

    private void jbt_filtrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_filtrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_filtrar1ActionPerformed

    private void chb_sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_sexoActionPerformed

    private void chb_provinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_provinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_provinciaActionPerformed

    private void chb_distritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_distritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_distritoActionPerformed

    private void chb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_tipoActionPerformed

    private void chb_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_resultadoActionPerformed

    private void jbt_exportar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_exportar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_exportar1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chb_departamento;
    private javax.swing.JCheckBox chb_distrito;
    private javax.swing.JCheckBox chb_edad;
    private javax.swing.JCheckBox chb_provincia;
    private javax.swing.JCheckBox chb_resultado;
    private javax.swing.JCheckBox chb_sexo;
    private javax.swing.JCheckBox chb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_buscar;
    private javax.swing.JButton jbt_exportar1;
    private javax.swing.JButton jbt_filtrar1;
    private javax.swing.JButton jbt_volver_Eleccion;
    private javax.swing.JComboBox<String> jcb_eleccion_busqueda;
    private javax.swing.JTable jtb_busqueda;
    private javax.swing.JTextField jtf_busqueda;
    private Background.PanelRound panelRound1;
    private Background.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}

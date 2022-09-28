package Formularios;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class VentanaEstadistica1 extends javax.swing.JFrame {
    
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
        jbt_volver_ElecEstadistica = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_estadistica1 = new javax.swing.JTable();
        jbt_filtrarEstd1 = new javax.swing.JButton();
        jbt_exportar2 = new javax.swing.JButton();
        chb_departamento1 = new javax.swing.JCheckBox();
        chb_departamento3 = new javax.swing.JCheckBox();
        chb_departamento2 = new javax.swing.JCheckBox();
        chb_departamento4 = new javax.swing.JCheckBox();
        chb_departamento9 = new javax.swing.JCheckBox();
        chb_departamento10 = new javax.swing.JCheckBox();
        chb_departamento11 = new javax.swing.JCheckBox();
        chb_departamento12 = new javax.swing.JCheckBox();
        chb_departamento5 = new javax.swing.JCheckBox();
        chb_departamento6 = new javax.swing.JCheckBox();
        chb_departamento7 = new javax.swing.JCheckBox();
        chb_departamento8 = new javax.swing.JCheckBox();
        chb_departamento22 = new javax.swing.JCheckBox();
        chb_departamento23 = new javax.swing.JCheckBox();
        chb_departamento24 = new javax.swing.JCheckBox();
        chb_departamento13 = new javax.swing.JCheckBox();
        chb_departamento14 = new javax.swing.JCheckBox();
        chb_departamento15 = new javax.swing.JCheckBox();
        chb_departamento16 = new javax.swing.JCheckBox();
        chb_departamento17 = new javax.swing.JCheckBox();
        chb_departamento18 = new javax.swing.JCheckBox();
        chb_departamento19 = new javax.swing.JCheckBox();
        chb_departamento20 = new javax.swing.JCheckBox();
        chb_departamento25 = new javax.swing.JCheckBox();
        chb_departamento21 = new javax.swing.JCheckBox();
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
        jLabel6.setText("Estadistica Tipo 1");

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

        jbt_volver_ElecEstadistica.setBackground(new java.awt.Color(32, 84, 95));
        jbt_volver_ElecEstadistica.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_volver_ElecEstadistica.setText("Volver ");
        jbt_volver_ElecEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_volver_ElecEstadisticaActionPerformed(evt);
            }
        });

        jtb_estadistica1.setAutoCreateRowSorter(true);
        jtb_estadistica1.setBackground(new java.awt.Color(255, 255, 255));
        jtb_estadistica1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtb_estadistica1.setForeground(new java.awt.Color(0, 0, 0));
        jtb_estadistica1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Amazonas", "", null, null, null, null, null, null},
                {"Áncash", "", null, null, null, null, null, null},
                {"Apurímac", "", null, null, null, null, null, null},
                {"Arequipa", null, null, null, null, null, null, null},
                {"Ayacucho", null, null, null, null, null, null, null},
                {"Cajamarca", null, null, null, null, null, null, null},
                {"Callao", null, null, null, null, null, null, null},
                {"Cuzco", null, null, null, null, null, null, null},
                {"Huancavelica", null, null, null, null, null, null, null},
                {"Huánuco", null, null, null, null, null, null, null},
                {"Ica", null, null, null, null, null, null, null},
                {"Junín", null, null, null, null, null, null, null},
                {"La Libertad", null, null, null, null, null, null, null},
                {"Lambayeque", null, null, null, null, null, null, null},
                {"Lima", null, null, null, null, null, null, null},
                {"Loreto", null, null, null, null, null, null, null},
                {"Madre de Dios", null, null, null, null, null, null, null},
                {"Moquegua", null, null, null, null, null, null, null},
                {"Pasco", null, null, null, null, null, null, null},
                {"Piura", null, null, null, null, null, null, null},
                {"Puno", null, null, null, null, null, null, null},
                {"San Martin", null, null, null, null, null, null, null},
                {"Tacna", null, null, null, null, null, null, null},
                {"Tumbes", null, null, null, null, null, null, null},
                {"Ucayali", null, null, null, null, null, null, null}
            },
            new String [] {
                "Etiqueta Filtro", "Aspirado Traqueal", "Hisopado Nasal y Faringeo", "Lavado Broncoalveolar", "Tejido Pulmonar", "Total Generado", "Positivo", "Negativo"
            }
        ));
        jtb_estadistica1.setAlignmentX(1.0F);
        jtb_estadistica1.setAlignmentY(1.0F);
        jtb_estadistica1.setGridColor(new java.awt.Color(153, 153, 153));
        jtb_estadistica1.setName(""); // NOI18N
        jtb_estadistica1.setRowHeight(19);
        jScrollPane1.setViewportView(jtb_estadistica1);

        jbt_filtrarEstd1.setBackground(new java.awt.Color(78, 116, 111));
        jbt_filtrarEstd1.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_filtrarEstd1.setText("Filtrar");
        jbt_filtrarEstd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_filtrarEstd1ActionPerformed(evt);
            }
        });

        jbt_exportar2.setBackground(new java.awt.Color(32, 84, 95));
        jbt_exportar2.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        jbt_exportar2.setText("Exportar");
        jbt_exportar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_exportar2ActionPerformed(evt);
            }
        });

        chb_departamento1.setText("Amazonas");
        chb_departamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento1ActionPerformed(evt);
            }
        });

        chb_departamento3.setText("Apurimac");
        chb_departamento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento3ActionPerformed(evt);
            }
        });

        chb_departamento2.setText("Áncash");
        chb_departamento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento2ActionPerformed(evt);
            }
        });

        chb_departamento4.setText("Arequipa");

        chb_departamento9.setText("Huancavelica");
        chb_departamento9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento9ActionPerformed(evt);
            }
        });

        chb_departamento10.setText("Huánuco");
        chb_departamento10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento10ActionPerformed(evt);
            }
        });

        chb_departamento11.setText("Ica");
        chb_departamento11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento11ActionPerformed(evt);
            }
        });

        chb_departamento12.setText("Junin");

        chb_departamento5.setText("Ayacucho");
        chb_departamento5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento5ActionPerformed(evt);
            }
        });

        chb_departamento6.setText("Cajamarca");
        chb_departamento6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento6ActionPerformed(evt);
            }
        });

        chb_departamento7.setText("Callao");
        chb_departamento7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento7ActionPerformed(evt);
            }
        });

        chb_departamento8.setText("Cuzco");

        chb_departamento22.setText("San Martin");
        chb_departamento22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento22ActionPerformed(evt);
            }
        });

        chb_departamento23.setText("Tacna");
        chb_departamento23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento23ActionPerformed(evt);
            }
        });

        chb_departamento24.setText("Tumbes");

        chb_departamento13.setText("La Libertad");
        chb_departamento13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento13ActionPerformed(evt);
            }
        });

        chb_departamento14.setText("Lambayeque");
        chb_departamento14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento14ActionPerformed(evt);
            }
        });

        chb_departamento15.setText("Lima");
        chb_departamento15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento15ActionPerformed(evt);
            }
        });

        chb_departamento16.setText("Loreto");

        chb_departamento17.setText("Madre de Dios");
        chb_departamento17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento17ActionPerformed(evt);
            }
        });

        chb_departamento18.setText("Moquegua");
        chb_departamento18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento18ActionPerformed(evt);
            }
        });

        chb_departamento19.setText("Pasco");
        chb_departamento19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento19ActionPerformed(evt);
            }
        });

        chb_departamento20.setText("Piura");

        chb_departamento25.setText("Ucayali");
        chb_departamento25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento25ActionPerformed(evt);
            }
        });

        chb_departamento21.setText("Puno");
        chb_departamento21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chb_departamento21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chb_departamento4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chb_departamento5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chb_departamento9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chb_departamento13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento16, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chb_departamento17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento20, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chb_departamento22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chb_departamento24, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chb_departamento21, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chb_departamento25, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbt_volver_ElecEstadistica, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jbt_filtrarEstd1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(293, 293, 293)
                        .addComponent(jbt_exportar2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 943, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelRound1Layout.createSequentialGroup()
                                    .addComponent(chb_departamento17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(chb_departamento18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(chb_departamento19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(chb_departamento20))
                                .addGroup(panelRound1Layout.createSequentialGroup()
                                    .addComponent(chb_departamento13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(chb_departamento14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(chb_departamento15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(chb_departamento16))
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRound1Layout.createSequentialGroup()
                                        .addComponent(chb_departamento1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_departamento2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_departamento3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_departamento4))
                                    .addGroup(panelRound1Layout.createSequentialGroup()
                                        .addComponent(chb_departamento5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_departamento6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_departamento7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_departamento8))
                                    .addGroup(panelRound1Layout.createSequentialGroup()
                                        .addComponent(chb_departamento9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_departamento10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_departamento11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chb_departamento12))))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chb_departamento21)
                                    .addComponent(chb_departamento25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chb_departamento22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chb_departamento23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chb_departamento24)))
                        .addGap(18, 18, 18)
                        .addComponent(jbt_filtrarEstd1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jbt_volver_ElecEstadistica)
                        .addGap(37, 37, 37)
                        .addComponent(jbt_exportar2)))
                .addContainerGap(13, Short.MAX_VALUE))
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

    private void jbt_exportar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_exportar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_exportar2ActionPerformed

    private void jbt_filtrarEstd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_filtrarEstd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_filtrarEstd1ActionPerformed

    private void jbt_volver_ElecEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_volver_ElecEstadisticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbt_volver_ElecEstadisticaActionPerformed

    private void chb_departamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento1ActionPerformed

    private void chb_departamento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento3ActionPerformed

    private void chb_departamento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento2ActionPerformed

    private void chb_departamento9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento9ActionPerformed

    private void chb_departamento10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento10ActionPerformed

    private void chb_departamento11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento11ActionPerformed

    private void chb_departamento5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento5ActionPerformed

    private void chb_departamento6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento6ActionPerformed

    private void chb_departamento7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento7ActionPerformed

    private void chb_departamento22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento22ActionPerformed

    private void chb_departamento23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento23ActionPerformed

    private void chb_departamento13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento13ActionPerformed

    private void chb_departamento14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento14ActionPerformed

    private void chb_departamento15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento15ActionPerformed

    private void chb_departamento17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento17ActionPerformed

    private void chb_departamento18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento18ActionPerformed

    private void chb_departamento19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento19ActionPerformed

    private void chb_departamento25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento25ActionPerformed

    private void chb_departamento21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chb_departamento21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chb_departamento21ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chb_departamento1;
    private javax.swing.JCheckBox chb_departamento10;
    private javax.swing.JCheckBox chb_departamento11;
    private javax.swing.JCheckBox chb_departamento12;
    private javax.swing.JCheckBox chb_departamento13;
    private javax.swing.JCheckBox chb_departamento14;
    private javax.swing.JCheckBox chb_departamento15;
    private javax.swing.JCheckBox chb_departamento16;
    private javax.swing.JCheckBox chb_departamento17;
    private javax.swing.JCheckBox chb_departamento18;
    private javax.swing.JCheckBox chb_departamento19;
    private javax.swing.JCheckBox chb_departamento2;
    private javax.swing.JCheckBox chb_departamento20;
    private javax.swing.JCheckBox chb_departamento21;
    private javax.swing.JCheckBox chb_departamento22;
    private javax.swing.JCheckBox chb_departamento23;
    private javax.swing.JCheckBox chb_departamento24;
    private javax.swing.JCheckBox chb_departamento25;
    private javax.swing.JCheckBox chb_departamento3;
    private javax.swing.JCheckBox chb_departamento4;
    private javax.swing.JCheckBox chb_departamento5;
    private javax.swing.JCheckBox chb_departamento6;
    private javax.swing.JCheckBox chb_departamento7;
    private javax.swing.JCheckBox chb_departamento8;
    private javax.swing.JCheckBox chb_departamento9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbt_exportar2;
    private javax.swing.JButton jbt_filtrarEstd1;
    private javax.swing.JButton jbt_volver_ElecEstadistica;
    private javax.swing.JTable jtb_estadistica1;
    private Background.PanelRound panelRound1;
    private Background.PanelRound panelRound2;
    // End of variables declaration//GEN-END:variables
}

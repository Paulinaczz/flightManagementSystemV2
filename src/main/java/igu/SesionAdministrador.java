package igu;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import archivo.Archivo;
import javax.swing.JTable;
import javax.swing.JTextField;
import logica.Usuario;
import logica.Vuelo;
import logica.VueloNacional;
import logica.VueloInternacional;
import logica.Aerolinea;
import logica.Pasajero;

public class SesionAdministrador extends javax.swing.JFrame {

    Archivo archivoVuelos = new Archivo();
    Archivo archivoPasajeros = new Archivo();
    Aerolinea aerolinea = new Aerolinea();
    ArrayList<Vuelo> vuelos = new ArrayList<>();
    ArrayList<Pasajero> pasajeros = new ArrayList<>();

    public SesionAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldID1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPrecio1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldFechaDeSalida1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldHoraDeSalida1 = new javax.swing.JTextField();
        jLabelFechaDeLlegada1 = new javax.swing.JLabel();
        jTextFieldFechaDeLlegada1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextFieldHoraDeLlegada1 = new javax.swing.JTextField();
        btnIngresar1 = new javax.swing.JButton();
        jButtonActualizar1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelPresentacion = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtNombresUsuario = new javax.swing.JTextField();
        txtApellidosUsuario = new javax.swing.JTextField();
        txtDniUsuario = new javax.swing.JTextField();
        txtCelularUsuario = new javax.swing.JTextField();
        txtCorreoUsuario = new javax.swing.JTextField();
        jPanelIngresarVuelo = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelVueloNacional = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldHoraDeSalida = new javax.swing.JTextField();
        jLabelFechaDeLlegada = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldHoraDeLlegada = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxDepOrigen = new javax.swing.JComboBox<>();
        jComboBoxDepDestino = new javax.swing.JComboBox<>();
        jComboBoxAerolinea = new javax.swing.JComboBox<>();
        jDateChooserFechaDeSalida = new com.toedter.calendar.JDateChooser();
        jDateChooserFechaDeLlegada = new com.toedter.calendar.JDateChooser();
        jPanelVueloInternacional = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldPaisOrigen = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextFieldPrecio2 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextFieldHoraDeSalida2 = new javax.swing.JTextField();
        jLabelFechaDeLlegada2 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextFieldHoraDeLlegada2 = new javax.swing.JTextField();
        btnIngresar2 = new javax.swing.JButton();
        jButtonActualizar2 = new javax.swing.JButton();
        jButtonLimpiar2 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jComboBoxAerolinea2 = new javax.swing.JComboBox<>();
        jComboBoxPaisDestino = new javax.swing.JComboBox<>();
        jTextFieldID2 = new javax.swing.JTextField();
        jDateChooserFechaDeSalida2 = new com.toedter.calendar.JDateChooser();
        jDateChooserFechaDeLlegada2 = new com.toedter.calendar.JDateChooser();
        jPanelCancelarVuelo = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldVueloAEliminar = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableVuelosEliminar = new javax.swing.JTable();
        btnBuscar1 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jComboBoxAerolinea3 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jPanelBuscarVuelo = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jComboBoxBuscarPor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVuelosBuscar = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jComboBoxAerolinea4 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel17.setText("Datos del Vuelo");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Precio");

        jTextFieldPrecio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecio1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel19.setText("Fecha de salida");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel20.setText("Hora de salida");

        jLabelFechaDeLlegada1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelFechaDeLlegada1.setText("Fecha de llegada");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel35.setText("Hora de llegada");

        jTextFieldHoraDeLlegada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoraDeLlegada1ActionPerformed(evt);
            }
        });

        btnIngresar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresar1.setText("Guardar");
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });

        jButtonActualizar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonActualizar1.setText("Actualizar");
        jButtonActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizar1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel17))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jButtonActualizar1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(btnIngresar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldID1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(103, 103, 103)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20)))
                                    .addComponent(jLabel35)
                                    .addComponent(jLabelFechaDeLlegada1))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFechaDeSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHoraDeSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFechaDeLlegada1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHoraDeLlegada1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel19)
                            .addComponent(jTextFieldFechaDeSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel20)
                            .addComponent(jTextFieldHoraDeSalida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFechaDeLlegada1)
                            .addComponent(jTextFieldFechaDeLlegada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(jTextFieldHoraDeLlegada1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonActualizar1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnIngresar1)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(35, 35, 35))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 102, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 60));

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));

        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel7MouseMoved(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Ingresar Vuelo");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel10.setPreferredSize(new java.awt.Dimension(193, 43));
        jPanel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel10MouseMoved(evt);
            }
        });
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cancelar Vuelo");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel11MouseMoved(evt);
            }
        });
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Buscar Vuelo");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel12MouseMoved(evt);
            }
        });
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Salir");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 1, 22)); // NOI18N
        jLabel31.setText("Bienvenido");

        jLabel24.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel24.setText("En Linea");

        jLabel34.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "\\src\\main\\java\\imagenes\\conectado.png"));

        jPanel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel14MouseMoved(evt);
            }
        });
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel14MouseExited(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Inicio");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jLabel24)))
                .addContainerGap())
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 430));

        jTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane.setToolTipText("");

        jPanelPresentacion.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(204, 153, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel15.setToolTipText("");

        jLabel46.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel46.setText("Administrador");

        jLabel47.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "\\src\\main\\java\\imagenes\\IconoAdministrador.png"));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel47)
                .addGap(27, 27, 27)
                .addComponent(jLabel46)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel48.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel48.setText("Inicio/Presentación");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel49.setText("Datos Personales");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel50.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel50.setText("Nombres");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel51.setText("Apellidos");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel52.setText("DNI");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel53.setText("Celular");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel54.setText("Correo");

        txtNombresUsuario.setEditable(false);
        txtNombresUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombresUsuario.setBorder(null);
        txtNombresUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresUsuarioActionPerformed(evt);
            }
        });

        txtApellidosUsuario.setEditable(false);
        txtApellidosUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellidosUsuario.setBorder(null);
        txtApellidosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosUsuarioActionPerformed(evt);
            }
        });

        txtDniUsuario.setEditable(false);
        txtDniUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDniUsuario.setBorder(null);
        txtDniUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniUsuarioActionPerformed(evt);
            }
        });

        txtCelularUsuario.setEditable(false);
        txtCelularUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCelularUsuario.setBorder(null);
        txtCelularUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularUsuarioActionPerformed(evt);
            }
        });

        txtCorreoUsuario.setEditable(false);
        txtCorreoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreoUsuario.setBorder(null);
        txtCorreoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel51)
                        .addComponent(jLabel50))
                    .addComponent(jLabel52)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel54)
                        .addComponent(jLabel53)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombresUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(txtApellidosUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(txtDniUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(txtCelularUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(txtCorreoUsuario))
                .addGap(44, 44, 44))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtNombresUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtApellidosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtDniUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txtCelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPresentacionLayout = new javax.swing.GroupLayout(jPanelPresentacion);
        jPanelPresentacion.setLayout(jPanelPresentacionLayout);
        jPanelPresentacionLayout.setHorizontalGroup(
            jPanelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPresentacionLayout.createSequentialGroup()
                .addGroup(jPanelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPresentacionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel48))
                    .addGroup(jPanelPresentacionLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPresentacionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(244, 244, 244))
        );
        jPanelPresentacionLayout.setVerticalGroup(
            jPanelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPresentacionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel48)
                .addGap(23, 23, 23)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("", jPanelPresentacion);

        jPanelIngresarVuelo.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanelVueloNacional.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel14.setText("Datos del Vuelo Nacional");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("ID");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Precio");

        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel15.setText("Fecha de salida");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setText("Hora de salida");

        jLabelFechaDeLlegada.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelFechaDeLlegada.setText("Fecha de llegada");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel18.setText("Hora de llegada");

        jTextFieldHoraDeLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoraDeLlegadaActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresar.setText("Guardar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jButtonActualizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Dep. origen");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Dep destino");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setText("Aerolinea");

        jComboBoxDepOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junin", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martin", "Tacna", "Tumbes", "Ucayali" }));

        jComboBoxDepDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junin", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martin", "Tacna", "Tumbes", "Ucayali" }));

        jComboBoxAerolinea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Latam", "Avianca", "Jetsmar" }));

        jDateChooserFechaDeSalida.setDateFormatString("dd-MM-yyyy");

        jDateChooserFechaDeLlegada.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanelVueloNacionalLayout = new javax.swing.GroupLayout(jPanelVueloNacional);
        jPanelVueloNacional.setLayout(jPanelVueloNacionalLayout);
        jPanelVueloNacionalLayout.setHorizontalGroup(
            jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVueloNacionalLayout.createSequentialGroup()
                .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVueloNacionalLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btnIngresar)
                        .addGap(63, 63, 63)
                        .addComponent(jButtonActualizar)
                        .addGap(79, 79, 79)
                        .addComponent(jButtonLimpiar))
                    .addGroup(jPanelVueloNacionalLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldID)
                            .addComponent(jTextFieldPrecio)
                            .addComponent(jComboBoxDepOrigen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxDepDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVueloNacionalLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel18))
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelFechaDeLlegada, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooserFechaDeLlegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldHoraDeLlegada, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jTextFieldHoraDeSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jDateChooserFechaDeSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVueloNacionalLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVueloNacionalLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVueloNacionalLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))))
        );
        jPanelVueloNacionalLayout.setVerticalGroup(
            jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVueloNacionalLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addGap(29, 29, 29)
                .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBoxAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelVueloNacionalLayout.createSequentialGroup()
                        .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(jDateChooserFechaDeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextFieldHoraDeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFechaDeLlegada)
                            .addComponent(jDateChooserFechaDeLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldHoraDeLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(2, 2, 2))
                    .addGroup(jPanelVueloNacionalLayout.createSequentialGroup()
                        .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBoxDepOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jComboBoxDepDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(jPanelVueloNacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonLimpiar))
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("                                  Vuelo nacional                             ", jPanelVueloNacional);

        jPanelVueloInternacional.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jLabel36.setText("Datos del Vuelo Internacional");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("ID");

        jTextFieldPaisOrigen.setEditable(false);
        jTextFieldPaisOrigen.setText("Perú");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel37.setText("Precio");

        jTextFieldPrecio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecio2ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel38.setText("Fecha de salida");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel39.setText("Hora de salida");

        jLabelFechaDeLlegada2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelFechaDeLlegada2.setText("Fecha de llegada");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel40.setText("Hora de llegada");

        jTextFieldHoraDeLlegada2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoraDeLlegada2ActionPerformed(evt);
            }
        });

        btnIngresar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresar2.setText("Guardar");
        btnIngresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar2ActionPerformed(evt);
            }
        });

        jButtonActualizar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonActualizar2.setText("Actualizar");
        jButtonActualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizar2ActionPerformed(evt);
            }
        });

        jButtonLimpiar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonLimpiar2.setText("Limpiar");
        jButtonLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiar2ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel41.setText("País origen");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel42.setText("Pais destino");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel43.setText("Aerolínea");

        jComboBoxAerolinea2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Latam", "Avianca", "Jetsmar" }));

        jComboBoxPaisDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Alemania", "Australia", "Canadá", "China", "España", "Estados Unidos", "Francia", "India", "Indonesia", "Italia", "Japón", "Malasia", "México", "Países Bajos", "Reino Unido", "Rusia", "Singapur", "Tailandia", "Turquía", "Vietnam" }));

        jDateChooserFechaDeSalida2.setDateFormatString("dd-MM-yyyy");

        jDateChooserFechaDeLlegada2.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPanelVueloInternacionalLayout = new javax.swing.GroupLayout(jPanelVueloInternacional);
        jPanelVueloInternacional.setLayout(jPanelVueloInternacionalLayout);
        jPanelVueloInternacionalLayout.setHorizontalGroup(
            jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVueloInternacionalLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVueloInternacionalLayout.createSequentialGroup()
                        .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel13)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPaisOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTextFieldPrecio2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jComboBoxPaisDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldID2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVueloInternacionalLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel40))
                            .addGroup(jPanelVueloInternacionalLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelFechaDeLlegada2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldHoraDeLlegada2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jTextFieldHoraDeSalida2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jDateChooserFechaDeSalida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooserFechaDeLlegada2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelVueloInternacionalLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnIngresar2)
                        .addGap(60, 60, 60)
                        .addComponent(jButtonActualizar2)
                        .addGap(60, 60, 60)
                        .addComponent(jButtonLimpiar2)))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVueloInternacionalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelVueloInternacionalLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxAerolinea2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(240, 240, 240))
        );
        jPanelVueloInternacionalLayout.setVerticalGroup(
            jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVueloInternacionalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel36)
                .addGap(32, 32, 32)
                .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jComboBoxAerolinea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelVueloInternacionalLayout.createSequentialGroup()
                        .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38)
                            .addComponent(jDateChooserFechaDeSalida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTextFieldHoraDeSalida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFechaDeLlegada2)
                            .addComponent(jDateChooserFechaDeLlegada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldHoraDeLlegada2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)))
                    .addGroup(jPanelVueloInternacionalLayout.createSequentialGroup()
                        .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jTextFieldPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jTextFieldPaisOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jComboBoxPaisDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(jPanelVueloInternacionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar2)
                    .addComponent(jButtonActualizar2)
                    .addComponent(jButtonLimpiar2))
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("                            Vuelo internacional                        ", jPanelVueloInternacional);

        javax.swing.GroupLayout jPanelIngresarVueloLayout = new javax.swing.GroupLayout(jPanelIngresarVuelo);
        jPanelIngresarVuelo.setLayout(jPanelIngresarVueloLayout);
        jPanelIngresarVueloLayout.setHorizontalGroup(
            jPanelIngresarVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanelIngresarVueloLayout.setVerticalGroup(
            jPanelIngresarVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIngresarVueloLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("", jPanelIngresarVuelo);

        jPanelCancelarVuelo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel21.setText(" ID del vuelo");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jTableVuelosEliminar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTableVuelosEliminar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Precio", "Fecha de salida", "Hora de salida", "Fecha de llegada", "Hora de llegada", "Origen", "Destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableVuelosEliminar);
        if (jTableVuelosEliminar.getColumnModel().getColumnCount() > 0) {
            jTableVuelosEliminar.getColumnModel().getColumn(0).setResizable(false);
            jTableVuelosEliminar.getColumnModel().getColumn(1).setResizable(false);
            jTableVuelosEliminar.getColumnModel().getColumn(2).setResizable(false);
            jTableVuelosEliminar.getColumnModel().getColumn(3).setResizable(false);
            jTableVuelosEliminar.getColumnModel().getColumn(4).setResizable(false);
            jTableVuelosEliminar.getColumnModel().getColumn(5).setResizable(false);
            jTableVuelosEliminar.getColumnModel().getColumn(6).setResizable(false);
            jTableVuelosEliminar.getColumnModel().getColumn(7).setResizable(false);
        }

        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel44.setText("Aerolinea");

        jComboBoxAerolinea3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Latam", "Avianca", "Jetsmar" }));

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setText("Limpiar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCancelarVueloLayout = new javax.swing.GroupLayout(jPanelCancelarVuelo);
        jPanelCancelarVuelo.setLayout(jPanelCancelarVueloLayout);
        jPanelCancelarVueloLayout.setHorizontalGroup(
            jPanelCancelarVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCancelarVueloLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCancelarVueloLayout.createSequentialGroup()
                .addGroup(jPanelCancelarVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCancelarVueloLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addGroup(jPanelCancelarVueloLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxAerolinea3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldVueloAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btnBuscar1)))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCancelarVueloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(44, 44, 44))
        );
        jPanelCancelarVueloLayout.setVerticalGroup(
            jPanelCancelarVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCancelarVueloLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelCancelarVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldVueloAEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar1)
                    .addComponent(jLabel44)
                    .addComponent(jComboBoxAerolinea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("", jPanelCancelarVuelo);

        jPanelBuscarVuelo.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jComboBoxBuscarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "ID", "Origen", "Destino", "Fecha de salida", "Fecha de llegada" }));
        jComboBoxBuscarPor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxBuscarPorItemStateChanged(evt);
            }
        });
        jComboBoxBuscarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBuscarPorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Aerolinea");

        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });

        jTableVuelosBuscar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTableVuelosBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Precio", "Fecha de salida", "Hora de salida", "Fecha de llegada", "Hora de llegada", "Origen", "Destino"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableVuelosBuscar);
        if (jTableVuelosBuscar.getColumnModel().getColumnCount() > 0) {
            jTableVuelosBuscar.getColumnModel().getColumn(0).setResizable(false);
            jTableVuelosBuscar.getColumnModel().getColumn(1).setResizable(false);
            jTableVuelosBuscar.getColumnModel().getColumn(2).setResizable(false);
            jTableVuelosBuscar.getColumnModel().getColumn(3).setResizable(false);
            jTableVuelosBuscar.getColumnModel().getColumn(4).setResizable(false);
            jTableVuelosBuscar.getColumnModel().getColumn(5).setResizable(false);
            jTableVuelosBuscar.getColumnModel().getColumn(6).setResizable(false);
            jTableVuelosBuscar.getColumnModel().getColumn(7).setResizable(false);
        }

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel45.setText("Buscar por");

        jComboBoxAerolinea4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Latam", "Avianca", "Jetsmar" }));
        jComboBoxAerolinea4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAerolinea4ItemStateChanged(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setText("Mostrar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscarVueloLayout = new javax.swing.GroupLayout(jPanelBuscarVuelo);
        jPanelBuscarVuelo.setLayout(jPanelBuscarVueloLayout);
        jPanelBuscarVueloLayout.setHorizontalGroup(
            jPanelBuscarVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarVueloLayout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(jButton6)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanelBuscarVueloLayout.createSequentialGroup()
                .addGroup(jPanelBuscarVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBuscarVueloLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxAerolinea4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(jPanelBuscarVueloLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelBuscarVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))))
                .addGap(32, 32, 32))
        );
        jPanelBuscarVueloLayout.setVerticalGroup(
            jPanelBuscarVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBuscarVueloLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanelBuscarVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel45)
                    .addComponent(jComboBoxBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxAerolinea4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelBuscarVueloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addGap(52, 52, 52))
        );

        jTabbedPane.addTab("", jPanelBuscarVuelo);

        jPanel1.add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 760, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrar(Usuario usuario) {
        txtNombresUsuario.setText(usuario.getNombres());
        txtApellidosUsuario.setText(usuario.getApellidos());
        txtDniUsuario.setText(usuario.getDNI());
        txtCelularUsuario.setText(usuario.getTelefono());
        txtCorreoUsuario.setText(usuario.getCorreo());
    }

    private void jPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseMoved
        jPanel7.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel7MouseMoved

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        jTabbedPane.setSelectedIndex(1);
        jButtonActualizar.setEnabled(false);
        jButtonActualizar2.setEnabled(false);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseMoved
        jPanel10.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel10MouseMoved

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        jTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        jPanel10.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseMoved
        jPanel11.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel11MouseMoved

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        jTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        jPanel11.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_jPanel11MouseExited

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
        jPanel12.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_jPanel12MouseExited

    private void jPanel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseMoved
        jPanel12.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel12MouseMoved

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jComboBoxBuscarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBuscarPorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBuscarPorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        eliminarVuelo();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fila = jTableVuelosBuscar.getSelectedRow();
        String aerolinea1 = jComboBoxAerolinea4.getSelectedItem().toString();
        int posicion;
        if (fila >= 0) {
            Vuelo aux = vuelos.get(fila);
            posicion = aerolinea.buscarVueloPorId(aux.getID());
            jTabbedPane.setSelectedIndex(1);
            if (aux instanceof VueloNacional) {
                jTabbedPane1.setSelectedIndex(0);
                jTextFieldID.setText(vuelos.get(posicion).getID());
                jComboBoxAerolinea.setSelectedItem(aerolinea1);
                jComboBoxAerolinea.setEnabled(false);
                jTextFieldID.setEditable(false);
                btnIngresar.setEnabled(false);
                jButtonActualizar.setEnabled(true);
            } else {
                jTabbedPane1.setSelectedIndex(1);
                jTextFieldID2.setText(vuelos.get(posicion).getID());
                jComboBoxAerolinea2.setSelectedItem(aerolinea1);
                jComboBoxAerolinea2.setEnabled(false);
                jTextFieldID2.setEditable(false);
                btnIngresar2.setEnabled(false);
                jButtonActualizar2.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un vuelo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        String aerolineaSeleccionada = jComboBoxAerolinea3.getSelectedItem().toString();
        String ID = jTextFieldVueloAEliminar.getText();
        if (!"Seleccionar".equals(aerolineaSeleccionada)) {
            if (!ID.isEmpty()) {
                String nombreArchivoVuelos = "vuelos" + aerolineaSeleccionada + ".txt";
                aerolinea.setVuelos(archivoVuelos.leer(nombreArchivoVuelos));
                vuelos = aerolinea.getVuelos();
                buscarPorID(jTableVuelosEliminar, ID);
            } else {
            JOptionPane.showMessageDialog(this, "Ingrese el ID de vuelo.", "Advertencia", JOptionPane.WARNING_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una aerolínea.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String aerolineaSeleccionada = jComboBoxAerolinea4.getSelectedItem().toString();
        String valorSeleccionado = jComboBoxBuscarPor.getSelectedItem().toString();
        if (!"Seleccionar".equals(aerolineaSeleccionada)) {
            String nombreArchivoVuelos = "vuelos" + aerolineaSeleccionada + ".txt";
            aerolinea.setVuelos(archivoVuelos.leer(nombreArchivoVuelos));
            vuelos = aerolinea.getVuelos();
            switch (valorSeleccionado) {
                case "ID":
                    buscarPorID(jTableVuelosBuscar, jTextFieldBuscar.getText());
                    break;
                case "Origen":
                    buscarPorOrigen(jTableVuelosBuscar, jTextFieldBuscar.getText());
                    break;
                case "Destino":
                    buscarPorDestino(jTableVuelosBuscar, jTextFieldBuscar.getText());
                    break;
                case "Fecha de salida":
                    buscarPorFechaSalida(jTableVuelosBuscar, jTextFieldBuscar.getText());
                    break;
                case "Fecha de llegada":
                    buscarPorFechaLlegada(jTableVuelosBuscar, jTextFieldBuscar.getText());
                    break;
                default:
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una aerolínea.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jPanel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseMoved
        jPanel14.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel14MouseMoved

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        jTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
        jPanel14.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_jPanel14MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActualizar1ActionPerformed

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresar1ActionPerformed

    private void jTextFieldHoraDeLlegada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraDeLlegada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoraDeLlegada1ActionPerformed

    private void jTextFieldPrecio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecio1ActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jComboBoxAerolinea.setSelectedIndex(0);
        jTextFieldID.setText("");
        jTextFieldPrecio.setText("");
        jComboBoxDepOrigen.setSelectedIndex(0);
        jComboBoxDepDestino.setSelectedIndex(0);
        ((JTextField) jDateChooserFechaDeSalida.getDateEditor().getUiComponent()).setText("");
        jTextFieldHoraDeSalida.setText("");
        ((JTextField) jDateChooserFechaDeLlegada.getDateEditor().getUiComponent()).setText("");
        jTextFieldHoraDeLlegada.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        editarDatosVueloNacional();
        limpiarTabla(jTableVuelosBuscar);
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if ((!"Seleccionar".equals(jComboBoxAerolinea.getSelectedItem().toString()))
                && !jTextFieldID.getText().isEmpty()
                && !jTextFieldPrecio.getText().isEmpty()
                && (esDouble(jTextFieldPrecio.getText()) == true)
                && (!"Seleccionar".equals(jComboBoxDepOrigen.getSelectedItem().toString()))
                && (!"Seleccionar".equals(jComboBoxDepDestino.getSelectedItem().toString()))
                && (!jComboBoxDepOrigen.getSelectedItem().toString().equals(jComboBoxDepDestino.getSelectedItem().toString()))
                && !((JTextField) jDateChooserFechaDeSalida.getDateEditor().getUiComponent()).getText().isEmpty()
                && !jTextFieldHoraDeSalida.getText().isEmpty()
                && !((JTextField) jDateChooserFechaDeLlegada.getDateEditor().getUiComponent()).getText().isEmpty()
                && !jTextFieldHoraDeLlegada.getText().isEmpty()) {

            String nombreArchivoVuelos = "vuelos" + jComboBoxAerolinea.getSelectedItem().toString() + ".txt";
            archivoVuelos.crear(nombreArchivoVuelos);
            aerolinea.setVuelos(archivoVuelos.leer(nombreArchivoVuelos));

            if (aerolinea.existeVuelo(jTextFieldID.getText()) == false) {
                Vuelo vuelo = new VueloNacional(jTextFieldID.getText(), Double.parseDouble(jTextFieldPrecio.getText()), ((JTextField) jDateChooserFechaDeSalida.getDateEditor().getUiComponent()).getText(), jTextFieldHoraDeSalida.getText(), ((JTextField) jDateChooserFechaDeLlegada.getDateEditor().getUiComponent()).getText(), jTextFieldHoraDeLlegada.getText(), jComboBoxDepOrigen.getSelectedItem().toString(), jComboBoxDepDestino.getSelectedItem().toString());
                archivoVuelos.escribir(vuelo, nombreArchivoVuelos);
                JOptionPane.showMessageDialog(this, "Vuelo registrado con éxito.");
            } else {
                JOptionPane.showMessageDialog(this, "El ID ya existe.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jTextFieldHoraDeLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraDeLlegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoraDeLlegadaActionPerformed

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jTextFieldPrecio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecio2ActionPerformed

    private void jTextFieldHoraDeLlegada2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraDeLlegada2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoraDeLlegada2ActionPerformed

    private void btnIngresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar2ActionPerformed
        if ((!"Seleccionar".equals(jComboBoxAerolinea2.getSelectedItem().toString()))
                && !jTextFieldID2.getText().isEmpty()
                && !jTextFieldPrecio2.getText().isEmpty()
                && esDouble(jTextFieldPrecio2.getText()) == true
                && !"Seleccionar".equals(jTextFieldPaisOrigen.getText())
                && !"Seleccionar".equals(jComboBoxPaisDestino.getSelectedItem().toString())
                && !((JTextField) jDateChooserFechaDeSalida2.getDateEditor().getUiComponent()).getText().isEmpty()
                && !jTextFieldHoraDeSalida2.getText().isEmpty()
                && !((JTextField) jDateChooserFechaDeLlegada2.getDateEditor().getUiComponent()).getText().isEmpty()
                && !jTextFieldHoraDeLlegada2.getText().isEmpty()) {

            String nombreArchivoVuelos = "vuelos" + jComboBoxAerolinea2.getSelectedItem().toString() + ".txt";
            archivoVuelos.crear(nombreArchivoVuelos);
            aerolinea.setVuelos(archivoVuelos.leer(nombreArchivoVuelos));

            if (aerolinea.existeVuelo(jTextFieldID2.getText()) == false) {
                Vuelo vuelo = new VueloInternacional(jTextFieldID2.getText(), Double.parseDouble(jTextFieldPrecio2.getText()), ((JTextField) jDateChooserFechaDeSalida2.getDateEditor().getUiComponent()).getText(), jTextFieldHoraDeSalida2.getText(), ((JTextField) jDateChooserFechaDeLlegada2.getDateEditor().getUiComponent()).getText(), jTextFieldHoraDeLlegada2.getText(), jTextFieldPaisOrigen.getText(), jComboBoxPaisDestino.getSelectedItem().toString());
                archivoVuelos.escribir(vuelo, nombreArchivoVuelos);
                JOptionPane.showMessageDialog(this, "Vuelo registrado con éxito.");
            } else {
                JOptionPane.showMessageDialog(this, "El ID ya existe.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresar2ActionPerformed

    private void jButtonActualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizar2ActionPerformed
        editarDatosVueloInternacional();
        limpiarTabla(jTableVuelosBuscar);
    }//GEN-LAST:event_jButtonActualizar2ActionPerformed

    private void jButtonLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiar2ActionPerformed
        jComboBoxAerolinea2.setSelectedIndex(0);
        jTextFieldID2.setText("");
        jTextFieldPrecio2.setText("");
        jComboBoxPaisDestino.setSelectedIndex(0);
        ((JTextField) jDateChooserFechaDeSalida2.getDateEditor().getUiComponent()).setText("");
        jTextFieldHoraDeSalida2.setText("");
        ((JTextField) jDateChooserFechaDeLlegada2.getDateEditor().getUiComponent()).setText("");
        jTextFieldHoraDeLlegada2.setText("");
    }//GEN-LAST:event_jButtonLimpiar2ActionPerformed

    private void jComboBoxAerolinea4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAerolinea4ItemStateChanged

    }//GEN-LAST:event_jComboBoxAerolinea4ItemStateChanged

    private void jComboBoxBuscarPorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxBuscarPorItemStateChanged

    }//GEN-LAST:event_jComboBoxBuscarPorItemStateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jComboBoxAerolinea4.setSelectedIndex(0);
        jComboBoxBuscarPor.setSelectedIndex(0);
        jTextFieldBuscar.setText("");
        limpiarTabla(jTableVuelosBuscar);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String aerolineaSeleccionada = jComboBoxAerolinea4.getSelectedItem().toString();
        if (!"Seleccionar".equals(aerolineaSeleccionada)) {
            String nombreArchivoVuelos = "vuelos" + aerolineaSeleccionada + ".txt";
            aerolinea.setVuelos(archivoVuelos.leer(nombreArchivoVuelos));
            vuelos = aerolinea.getVuelos();
            mostrarTodosLosVuelos(jTableVuelosBuscar);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una aerolínea.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jComboBoxAerolinea3.setSelectedIndex(0);
        jTextFieldVueloAEliminar.setText("");
        limpiarTabla(jTableVuelosEliminar);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtNombresUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresUsuarioActionPerformed

    private void txtApellidosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosUsuarioActionPerformed

    private void txtDniUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniUsuarioActionPerformed

    private void txtCelularUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularUsuarioActionPerformed

    private void txtCorreoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoUsuarioActionPerformed

   public void mostrarTodosLosVuelos(JTable jTable) {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"ID", "Precio", "Fecha de salida", "Hora de salida", "Fecha de llegada", "Hora de llegada", "Origen", "Destino"};
        tabla.setColumnIdentifiers(titulos);
        jTable.setModel(tabla);
        limpiarTabla(jTable);

        Object[] fila = new Object[tabla.getColumnCount()];

        for (int i = 0; i < vuelos.size(); i++) {
            Vuelo vuelo = vuelos.get(i);
            llenarFila(fila, vuelo);
            tabla.addRow(fila);
        }

        jTable.setRowHeight(60);
    }

    public void buscarPorID(JTable jTable, String ID) {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"ID", "Precio", "Fecha de salida", "Hora de salida", "Fecha de llegada", "Hora de llegada", "Origen", "Destino"};
        tabla.setColumnIdentifiers(titulos);
        jTable.setModel(tabla);
        limpiarTabla(jTable);

        Object fila[] = new Object[tabla.getColumnCount()];

        for (int i = 0; i < vuelos.size(); i++) {
            Vuelo vuelo = vuelos.get(i);
            if (vuelo.getID().equals(ID)) {
                llenarFila(fila, vuelo);
                tabla.addRow(fila);
            }
        }

        jTable.setRowHeight(60);
    }

    public void buscarPorOrigen(JTable jTable, String origen) {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"ID", "Precio", "Fecha de salida", "Hora de salida", "Fecha de llegada", "Hora de llegada", "Origen", "Destino"};
        tabla.setColumnIdentifiers(titulos);
        jTable.setModel(tabla);
        limpiarTabla(jTable);

        Object[] fila = new Object[tabla.getColumnCount()];

        for (int i = 0; i < vuelos.size(); i++) {
            Vuelo vuelo = vuelos.get(i);
            if (vuelo instanceof VueloNacional) {
                VueloNacional vueloNacional = (VueloNacional) vuelo;
                if (vueloNacional.getDepartamentoOrigen().equals(origen)) {
                    llenarFila(fila, vueloNacional);
                    tabla.addRow(fila);
                }
            } else if (vuelo instanceof VueloInternacional) {
                VueloInternacional vueloInternacional = (VueloInternacional) vuelo;
                if (vueloInternacional.getPaisOrigen().equals(origen)) {
                    llenarFila(fila, vueloInternacional);
                    tabla.addRow(fila);
                }
            }
        }
        jTable.setRowHeight(60);
    }

    public void buscarPorDestino(JTable jTable, String destino) {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"ID", "Precio", "Fecha de salida", "Hora de salida", "Fecha de llegada", "Hora de llegada", "Origen", "Destino"};
        tabla.setColumnIdentifiers(titulos);
        jTable.setModel(tabla);
        limpiarTabla(jTable);

        Object[] fila = new Object[tabla.getColumnCount()];

        for (int i = 0; i < vuelos.size(); i++) {
            Vuelo vuelo = vuelos.get(i);
            if (vuelo instanceof VueloNacional) {
                VueloNacional vueloNacional = (VueloNacional) vuelo;
                if (vueloNacional.getDepartamentoDestino().equals(destino)) {
                    llenarFila(fila, vueloNacional);
                    tabla.addRow(fila);
                }
            } else if (vuelo instanceof VueloInternacional) {
                VueloInternacional vueloInternacional = (VueloInternacional) vuelo;
                if (vueloInternacional.getPaisDestino().equals(destino)) {
                    llenarFila(fila, vueloInternacional);
                    tabla.addRow(fila);
                }
            }
        }

        jTable.setRowHeight(60);
    }

    public void buscarPorFechaSalida(JTable jTable, String fechaSalida) {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"ID", "Precio", "Fecha de salida", "Hora de salida", "Fecha de llegada", "Hora de llegada", "Origen", "Destino"};
        tabla.setColumnIdentifiers(titulos);
        jTable.setModel(tabla);
        limpiarTabla(jTable);

        Object[] fila = new Object[tabla.getColumnCount()];

        for (int i = 0; i < vuelos.size(); i++) {
            Vuelo vuelo = vuelos.get(i);
            if (vuelo.getFechasalida().equals(fechaSalida)) {
                llenarFila(fila, vuelo);
                tabla.addRow(fila);
            }
        }

        jTable.setRowHeight(60);
    }

    public void buscarPorFechaLlegada(JTable jTable, String fechaLlegada) {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"ID", "Precio", "Fecha de salida", "Hora de salida", "Fecha de llegada", "Hora de llegada", "Origen", "Destino"};
        tabla.setColumnIdentifiers(titulos);
        jTable.setModel(tabla);
        limpiarTabla(jTable);

        Object[] fila = new Object[tabla.getColumnCount()];

        for (int i = 0; i < vuelos.size(); i++) {
            Vuelo vuelo = vuelos.get(i);
            if (vuelo.getFechallegada().equals(fechaLlegada)) {
                llenarFila(fila, vuelo);
                tabla.addRow(fila);
            }
        }

        jTable.setRowHeight(60);
    }

    private void llenarFila(Object[] fila, Vuelo vuelo) {
        fila[0] = vuelo.getID();
        fila[1] = vuelo.getPrecio();
        fila[2] = vuelo.getFechasalida();
        fila[3] = vuelo.getHorasalida();
        fila[4] = vuelo.getFechallegada();
        fila[5] = vuelo.getHorallegada();
        if (vuelo instanceof VueloNacional) {
            VueloNacional vueloNacional = (VueloNacional) vuelo;
            fila[6] = vueloNacional.getDepartamentoOrigen();
            fila[7] = vueloNacional.getDepartamentoDestino();
        } else if (vuelo instanceof VueloInternacional) {
            VueloInternacional vueloInternacional = (VueloInternacional) vuelo;
            fila[6] = vueloInternacional.getPaisOrigen();
            fila[7] = vueloInternacional.getPaisDestino();
        }
    }

    public void editarDatosVueloNacional() {
        int posicion = aerolinea.buscarVueloPorId(jTextFieldID.getText());
        if (!jTextFieldPrecio.getText().isEmpty()
                && (esDouble(jTextFieldPrecio.getText()) == true)
                && (!"Seleccionar".equals(jComboBoxDepOrigen.getSelectedItem().toString()))
                && (!"Seleccionar".equals(jComboBoxDepDestino.getSelectedItem().toString()))
                && (!jComboBoxDepOrigen.getSelectedItem().toString().equals(jComboBoxDepDestino.getSelectedItem().toString()))
                && !((JTextField) jDateChooserFechaDeSalida.getDateEditor().getUiComponent()).getText().isEmpty()
                && !jTextFieldHoraDeSalida.getText().isEmpty()
                && !((JTextField) jDateChooserFechaDeLlegada.getDateEditor().getUiComponent()).getText().isEmpty()
                && !jTextFieldHoraDeLlegada.getText().isEmpty()) {
            Vuelo vueloModificado = new VueloNacional(jTextFieldID.getText(), Double.parseDouble(jTextFieldPrecio.getText()), ((JTextField) jDateChooserFechaDeSalida.getDateEditor().getUiComponent()).getText(), jTextFieldHoraDeSalida.getText(), ((JTextField) jDateChooserFechaDeLlegada.getDateEditor().getUiComponent()).getText(), jTextFieldHoraDeLlegada.getText(), jComboBoxDepOrigen.getSelectedItem().toString(), jComboBoxDepDestino.getSelectedItem().toString());
            String nombreArchivoVuelos = "vuelos" + jComboBoxAerolinea.getSelectedItem().toString() + ".txt";
            archivoVuelos.eliminar(nombreArchivoVuelos, posicion);
            archivoVuelos.escribir(vueloModificado, nombreArchivoVuelos);
            aerolinea.setVuelos(archivoVuelos.leer(nombreArchivoVuelos));
            JOptionPane.showMessageDialog(this, "Vuelo actualizado con éxito.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al modificar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarDatosVueloInternacional() {
        int posicion = aerolinea.buscarVueloPorId(jTextFieldID2.getText());
        if (!jTextFieldPrecio2.getText().isEmpty()
                && esDouble(jTextFieldPrecio2.getText()) == true
                && !"Seleccionar".equals(jTextFieldPaisOrigen.getText())
                && !"Seleccionar".equals(jComboBoxPaisDestino.getSelectedItem().toString())
                && !((JTextField) jDateChooserFechaDeSalida2.getDateEditor().getUiComponent()).getText().isEmpty()
                && !jTextFieldHoraDeSalida2.getText().isEmpty()
                && !((JTextField) jDateChooserFechaDeLlegada2.getDateEditor().getUiComponent()).getText().isEmpty()
                && !jTextFieldHoraDeLlegada2.getText().isEmpty()) {
            Vuelo vueloModificado = new VueloInternacional(jTextFieldID2.getText(), Double.parseDouble(jTextFieldPrecio2.getText()), ((JTextField) jDateChooserFechaDeSalida2.getDateEditor().getUiComponent()).getText(), jTextFieldHoraDeSalida2.getText(), ((JTextField) jDateChooserFechaDeLlegada2.getDateEditor().getUiComponent()).getText(), jTextFieldHoraDeLlegada2.getText(), jTextFieldPaisOrigen.getText(), jComboBoxPaisDestino.getSelectedItem().toString());
            String nombreArchivoVuelos = "vuelos" + jComboBoxAerolinea2.getSelectedItem().toString() + ".txt";
            archivoVuelos.eliminar(nombreArchivoVuelos, posicion);
            archivoVuelos.escribir(vueloModificado, nombreArchivoVuelos);
            aerolinea.setVuelos(archivoVuelos.leer(nombreArchivoVuelos));
            JOptionPane.showMessageDialog(this, "Vuelo actualizado con éxito.");
        } else {
            JOptionPane.showMessageDialog(this, "Error al modificar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarVuelo() {
        int posicion;
        int fila = jTableVuelosEliminar.getSelectedRow();
        String aerolineaSeleccionada = jComboBoxAerolinea3.getSelectedItem().toString();
        if (fila >= 0) {
            Vuelo aux = vuelos.get(fila);
            posicion = aerolinea.buscarVueloPorId(aux.getID());
            String nombreArchivoVuelos = "vuelos" + aerolineaSeleccionada + ".txt";
            archivoVuelos.eliminar(nombreArchivoVuelos, posicion);
            JOptionPane.showMessageDialog(this, "Vuelo cancelado con éxito.");
            
            String nombreArchivoPasajeros = "pasajeros" + aerolineaSeleccionada + ".txt";
            archivoPasajeros.crear(nombreArchivoPasajeros);
            pasajeros = archivoPasajeros.leer(nombreArchivoPasajeros);
            for (int i = 0; i < pasajeros.size(); i++) {
                System.out.println(pasajeros.get(i).getCodigo()+" "+aux.getID());
                if(pasajeros.get(i).getCodigo().equals(aux.getID())){
                    System.out.println(pasajeros.get(i).getNombres());
                    archivoPasajeros.eliminar(nombreArchivoPasajeros, i);
                    System.out.println("Se eliminó");
                }
            }
            
            limpiarTabla(jTableVuelosEliminar);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un vuelo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void limpiarTabla(JTable jTable) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
    }
    
    //Metodos auxiliares
    public boolean esDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    //Fin metodos auxiliares
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnIngresar1;
    private javax.swing.JButton btnIngresar2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonActualizar1;
    private javax.swing.JButton jButtonActualizar2;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonLimpiar2;
    private javax.swing.JComboBox<String> jComboBoxAerolinea;
    private javax.swing.JComboBox<String> jComboBoxAerolinea2;
    private javax.swing.JComboBox<String> jComboBoxAerolinea3;
    private javax.swing.JComboBox<String> jComboBoxAerolinea4;
    private javax.swing.JComboBox<String> jComboBoxBuscarPor;
    private javax.swing.JComboBox<String> jComboBoxDepDestino;
    private javax.swing.JComboBox<String> jComboBoxDepOrigen;
    private javax.swing.JComboBox<String> jComboBoxPaisDestino;
    private com.toedter.calendar.JDateChooser jDateChooserFechaDeLlegada;
    private com.toedter.calendar.JDateChooser jDateChooserFechaDeLlegada2;
    private com.toedter.calendar.JDateChooser jDateChooserFechaDeSalida;
    private com.toedter.calendar.JDateChooser jDateChooserFechaDeSalida2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFechaDeLlegada;
    private javax.swing.JLabel jLabelFechaDeLlegada1;
    private javax.swing.JLabel jLabelFechaDeLlegada2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelBuscarVuelo;
    private javax.swing.JPanel jPanelCancelarVuelo;
    private javax.swing.JPanel jPanelIngresarVuelo;
    private javax.swing.JPanel jPanelPresentacion;
    private javax.swing.JPanel jPanelVueloInternacional;
    private javax.swing.JPanel jPanelVueloNacional;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTableVuelosBuscar;
    private javax.swing.JTable jTableVuelosEliminar;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldFechaDeLlegada1;
    private javax.swing.JTextField jTextFieldFechaDeSalida1;
    private javax.swing.JTextField jTextFieldHoraDeLlegada;
    private javax.swing.JTextField jTextFieldHoraDeLlegada1;
    private javax.swing.JTextField jTextFieldHoraDeLlegada2;
    private javax.swing.JTextField jTextFieldHoraDeSalida;
    private javax.swing.JTextField jTextFieldHoraDeSalida1;
    private javax.swing.JTextField jTextFieldHoraDeSalida2;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldID1;
    private javax.swing.JTextField jTextFieldID2;
    private javax.swing.JTextField jTextFieldPaisOrigen;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldPrecio1;
    private javax.swing.JTextField jTextFieldPrecio2;
    private javax.swing.JTextField jTextFieldVueloAEliminar;
    private javax.swing.JTextField txtApellidosUsuario;
    private javax.swing.JTextField txtCelularUsuario;
    private javax.swing.JTextField txtCorreoUsuario;
    private javax.swing.JTextField txtDniUsuario;
    private javax.swing.JTextField txtNombresUsuario;
    // End of variables declaration//GEN-END:variables
}

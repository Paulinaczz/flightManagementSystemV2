package igu;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import archivo.Archivo;
import java.io.File;
import logica.Aerolinea;
import logica.Usuario;
import logica.Pasajero;
import logica.Avion;
import logica.Vuelo;
import logica.VueloInternacional;
import logica.VueloNacional;

public class SesionAgenteDeVentas extends javax.swing.JFrame {

    Archivo archivoVuelos = new Archivo();
    Aerolinea aerolinea = new Aerolinea();
    ArrayList<Vuelo> vuelos = new ArrayList<>();

    Archivo archivoPasajeros = new Archivo();
    Avion avion = new Avion();
    ArrayList<Pasajero> pasajeros = new ArrayList<>();

    public SesionAgenteDeVentas() {
        initComponents();
        btnPagar.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
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
        jPanelPresentación = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtNombresUsuario = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtApellidosUsuario = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtDniUsuario = new javax.swing.JTextField();
        txtCelularUsuario = new javax.swing.JTextField();
        txtCorreoUsuario = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jPanelIngresarReserva = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelIngresarReservaDatos = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPasaporte = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtFila = new javax.swing.JTextField();
        txtColumna = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        jComboBoxAerolinea3 = new javax.swing.JComboBox<>();
        jButtonSeleccionarAsiento = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanelMostrarVuelos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableVuelosBuscar = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        jComboBoxAerolinea4 = new javax.swing.JComboBox<>();
        btnBuscar2 = new javax.swing.JButton();
        jPanelCancelarReserva = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldDNIEliminar = new javax.swing.JTextField();
        jTextFieldIDBuscar = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEliminarReserva = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jComboBoxAerolineaEliminar = new javax.swing.JComboBox<>();
        jPanelBuscarReserva = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        jcbxBuscarPor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBuscar = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxAerolineaBuscar = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
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
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 50));

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
        jLabel1.setText("Ingresar Reserva");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
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
        jLabel2.setText("Cancelar Reserva");

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
                .addContainerGap(16, Short.MAX_VALUE))
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
        jLabel5.setText("Buscar Reserva");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)))
                .addContainerGap(22, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 400));

        jTabbedPane.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane.setToolTipText("");

        jPanelPresentación.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(204, 153, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel13.setToolTipText("");

        jLabel30.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        jLabel30.setText("Agente de Ventas");

        jLabel32.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "\\src\\main\\java\\imagenes\\IconoAgenteVentas.png"));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel30))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel32)
                .addGap(27, 27, 27)
                .addComponent(jLabel30)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel28.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        jLabel28.setText("Inicio/Presentación");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel25.setText("Datos Personales");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel23.setText("Nombres");

        txtNombresUsuario.setEditable(false);
        txtNombresUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombresUsuario.setBorder(null);
        txtNombresUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresUsuarioActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel26.setText("Apellidos");

        txtApellidosUsuario.setEditable(false);
        txtApellidosUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellidosUsuario.setBorder(null);
        txtApellidosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosUsuarioActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel27.setText("DNI");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel29.setText("Celular");

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

        jLabel33.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel33.setText("Correo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombresUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDniUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtNombresUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtApellidosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtDniUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtCelularUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPresentaciónLayout = new javax.swing.GroupLayout(jPanelPresentación);
        jPanelPresentación.setLayout(jPanelPresentaciónLayout);
        jPanelPresentaciónLayout.setHorizontalGroup(
            jPanelPresentaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPresentaciónLayout.createSequentialGroup()
                .addGroup(jPanelPresentaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPresentaciónLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPresentaciónLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel28)))
                .addGroup(jPanelPresentaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPresentaciónLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel25))
                    .addGroup(jPanelPresentaciónLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanelPresentaciónLayout.setVerticalGroup(
            jPanelPresentaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPresentaciónLayout.createSequentialGroup()
                .addGroup(jPanelPresentaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPresentaciónLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel25))
                    .addGroup(jPanelPresentaciónLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel28)))
                .addGap(27, 27, 27)
                .addGroup(jPanelPresentaciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("tab4", jPanelPresentación);

        jPanelIngresarReserva.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText(" Nombres");

        jLabel7.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel7.setText("Datos del Pasajero");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Apellidos");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("DNI");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Teléfono");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Correo");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel12.setText("Pasaporte");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("Nacionalidad");

        txtPasaporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasaporteActionPerformed(evt);
            }
        });

        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Bell MT", 3, 14)); // NOI18N
        jLabel14.setText("Datos del Vuelo");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel15.setText("Aerolínea");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setText("ID");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel18.setText("Fila");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel19.setText("Columna");

        txtFila.setEditable(false);

        txtColumna.setEditable(false);

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnPagar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        jComboBoxAerolinea3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Latam", "Avianca", "Jetsmar" }));

        jButtonSeleccionarAsiento.setText("Seleccionar asiento");
        jButtonSeleccionarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarAsientoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                                    .addGap(106, 106, 106)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPasaporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addComponent(jLabel18)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                    .addGap(101, 101, 101)
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel15)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(264, 264, 264)
                        .addComponent(jLabel14))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxAerolinea3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFila, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jButton1)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnPagar)))))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSeleccionarAsiento)
                        .addGap(117, 117, 117))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBoxAerolinea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSeleccionarAsiento))
                .addGap(12, 12, 12)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIngresar)
                            .addComponent(btnPagar)
                            .addComponent(jButton1))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelIngresarReservaDatosLayout = new javax.swing.GroupLayout(jPanelIngresarReservaDatos);
        jPanelIngresarReservaDatos.setLayout(jPanelIngresarReservaDatosLayout);
        jPanelIngresarReservaDatosLayout.setHorizontalGroup(
            jPanelIngresarReservaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIngresarReservaDatosLayout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelIngresarReservaDatosLayout.setVerticalGroup(
            jPanelIngresarReservaDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("                                 Reservar asientos                             ", jPanelIngresarReservaDatos);

        jPanelMostrarVuelos.setBackground(new java.awt.Color(255, 255, 255));

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
        jScrollPane3.setViewportView(jTableVuelosBuscar);

        jLabel45.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel45.setText("Aerolínea");

        jComboBoxAerolinea4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Latam", "Avianca", "Jetsmar" }));

        btnBuscar2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar2.setText("Buscar");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMostrarVuelosLayout = new javax.swing.GroupLayout(jPanelMostrarVuelos);
        jPanelMostrarVuelos.setLayout(jPanelMostrarVuelosLayout);
        jPanelMostrarVuelosLayout.setHorizontalGroup(
            jPanelMostrarVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarVuelosLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel45)
                .addGap(28, 28, 28)
                .addComponent(jComboBoxAerolinea4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157)
                .addComponent(btnBuscar2)
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(jPanelMostrarVuelosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMostrarVuelosLayout.setVerticalGroup(
            jPanelMostrarVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMostrarVuelosLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanelMostrarVuelosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jComboBoxAerolinea4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar2))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );

        jTabbedPane1.addTab("                                Mostrar vuelos                           ", jPanelMostrarVuelos);

        javax.swing.GroupLayout jPanelIngresarReservaLayout = new javax.swing.GroupLayout(jPanelIngresarReserva);
        jPanelIngresarReserva.setLayout(jPanelIngresarReservaLayout);
        jPanelIngresarReservaLayout.setHorizontalGroup(
            jPanelIngresarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanelIngresarReservaLayout.setVerticalGroup(
            jPanelIngresarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane.addTab("", jPanelIngresarReserva);

        jPanelCancelarReserva.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel20.setText("DNI/Cédula");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel21.setText(" ID del vuelo");

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar1.setText("Buscar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        jTableEliminarReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellidos", "Origen", "Destino", "Fila", "Columna"
            }
        ));
        jScrollPane2.setViewportView(jTableEliminarReserva);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel35.setText("Aerolínea");

        jComboBoxAerolineaEliminar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Latam", "Avianca", "Jetsmar" }));

        javax.swing.GroupLayout jPanelCancelarReservaLayout = new javax.swing.GroupLayout(jPanelCancelarReserva);
        jPanelCancelarReserva.setLayout(jPanelCancelarReservaLayout);
        jPanelCancelarReservaLayout.setHorizontalGroup(
            jPanelCancelarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCancelarReservaLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanelCancelarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel21))
                .addGap(40, 40, 40)
                .addGroup(jPanelCancelarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCancelarReservaLayout.createSequentialGroup()
                        .addComponent(jTextFieldIDBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelCancelarReservaLayout.createSequentialGroup()
                        .addComponent(jComboBoxAerolineaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldDNIEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnBuscar1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelCancelarReservaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCancelarReservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(70, 70, 70))
        );
        jPanelCancelarReservaLayout.setVerticalGroup(
            jPanelCancelarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCancelarReservaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanelCancelarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAerolineaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar1)
                    .addComponent(jTextFieldDNIEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(14, 14, 14)
                .addGroup(jPanelCancelarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldIDBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnCancelar)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("", jPanelCancelarReserva);

        jPanelBuscarReserva.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jcbxBuscarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "DNI", "Pasaporte", "Vuelo" }));
        jcbxBuscarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxBuscarPorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Buscar por");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        tablaBuscar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tablaBuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Vuelo (ID)", "Nombres", "Apellidos", "DNI", "Correo", "Telefono", "Pasaporte", "Nacionalidad", "Fila", "Columna"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaBuscar);
        if (tablaBuscar.getColumnModel().getColumnCount() > 0) {
            tablaBuscar.getColumnModel().getColumn(0).setResizable(false);
            tablaBuscar.getColumnModel().getColumn(1).setResizable(false);
            tablaBuscar.getColumnModel().getColumn(2).setResizable(false);
            tablaBuscar.getColumnModel().getColumn(3).setResizable(false);
            tablaBuscar.getColumnModel().getColumn(4).setResizable(false);
            tablaBuscar.getColumnModel().getColumn(5).setResizable(false);
            tablaBuscar.getColumnModel().getColumn(6).setResizable(false);
            tablaBuscar.getColumnModel().getColumn(7).setResizable(false);
            tablaBuscar.getColumnModel().getColumn(8).setResizable(false);
            tablaBuscar.getColumnModel().getColumn(9).setResizable(false);
        }

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Ver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel17.setText("Aerolínea");

        jComboBoxAerolineaBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Latam", "Avianca", "Jetsmar" }));
        jComboBoxAerolineaBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAerolineaBuscarActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonMostrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonMostrar.setText("Mostrar");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscarReservaLayout = new javax.swing.GroupLayout(jPanelBuscarReserva);
        jPanelBuscarReserva.setLayout(jPanelBuscarReservaLayout);
        jPanelBuscarReservaLayout.setHorizontalGroup(
            jPanelBuscarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarReservaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxAerolineaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jcbxBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnBuscar)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBuscarReservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBuscarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addGroup(jPanelBuscarReservaLayout.createSequentialGroup()
                        .addComponent(jButtonMostrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(30, 30, 30))
            .addGroup(jPanelBuscarReservaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBuscarReservaLayout.setVerticalGroup(
            jPanelBuscarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBuscarReservaLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanelBuscarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel17)
                    .addComponent(jComboBoxAerolineaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jcbxBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanelBuscarReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonMostrar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("", jPanelBuscarReserva);

        jPanel1.add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 760, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        eliminarReserva();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jcbxBuscarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxBuscarPorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbxBuscarPorActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseMoved
        jPanel7.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel7MouseMoved

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        jTabbedPane.setSelectedIndex(1);
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

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        String aerolineaSeleccionada = jComboBoxAerolineaEliminar.getSelectedItem().toString();
        String idVuelo = jTextFieldIDBuscar.getText();
        String DNI = jTextFieldDNIEliminar.getText();
        if (!"Seleccionar".equals(aerolineaSeleccionada)) {

            String nombreArchivoVuelos = "vuelos" + aerolineaSeleccionada + ".txt";
            aerolinea.setVuelos(archivoVuelos.leer(nombreArchivoVuelos));
            vuelos = aerolinea.getVuelos();

            String nombreArchivoPasajeros = "pasajeros" + aerolineaSeleccionada + ".txt";
            avion.setPasajeros(archivoPasajeros.leer(nombreArchivoPasajeros));
            pasajeros = avion.getPasajeros();

            if (aerolinea.existeVuelo(idVuelo)) {
                if (!DNI.isEmpty()) {
                    buscarPorDNI(jTableEliminarReserva, DNI);
                } else {
                    JOptionPane.showMessageDialog(this, "Ingrese el número de DNI.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No existe vuelo con ese ID.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una aerolínea.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Archivo archivoVuelos = new Archivo();
        Aerolinea aerolinea = new Aerolinea();
        int fila = tablaBuscar.getSelectedRow();
        int posicion;
        if (fila >= 0) {
            Pasajero aux = pasajeros.get(fila);
            posicion = avion.buscarPasajeroPorCodigo(aux.getCodigo());
            Pasajero pasajero = pasajeros.get(posicion);
            String nombreArchivoVuelos = "vuelos" + jComboBoxAerolineaBuscar.getSelectedItem().toString() + ".txt";
            aerolinea.setVuelos(archivoVuelos.leer(nombreArchivoVuelos));
            mostrarVoucher(pasajero, aerolinea.obtenerVueloPorID(aux.getCodigo()));
            limpiarTabla(tablaBuscar);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una reserva.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseMoved
        jPanel14.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel14MouseMoved

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        jTabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseExited
        jPanel14.setBackground(new Color(242, 230, 255));
    }//GEN-LAST:event_jPanel14MouseExited

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String aerolineaSeleccionada = jComboBoxAerolineaBuscar.getSelectedItem().toString();
        String valorSeleccionado = jcbxBuscarPor.getSelectedItem().toString();
        if (!"Seleccionar".equals(aerolineaSeleccionada)) {
            String nombreArchivoPasajeros = "pasajeros" + aerolineaSeleccionada + ".txt";
            avion.setPasajeros(archivoPasajeros.leer(nombreArchivoPasajeros));
            pasajeros = avion.getPasajeros();
            switch (valorSeleccionado) {
                case "DNI":
                    buscarPorDNI(tablaBuscar, txtBuscar.getText());
                    break;
                case "Pasaporte":
                    buscarPorPasaporte(tablaBuscar, txtBuscar.getText());
                    break;
                case "Vuelo":
                    buscarPorVueloID(tablaBuscar, txtBuscar.getText());
                    break;
                default:
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una aerolínea.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButtonSeleccionarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarAsientoActionPerformed
        ElegirAsiento elegirAsiento = new ElegirAsiento(txtId.getText());

        elegirAsiento.setAsientoSeleccionadoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtFila.setText(Integer.toString(elegirAsiento.getFila()));
                txtColumna.setText(Integer.toString(elegirAsiento.getColumna()));
            }
        });

        elegirAsiento.setVisible(true);
    }//GEN-LAST:event_jButtonSeleccionarAsientoActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        Pago pago = new Pago();
        pago.setVisible(true);
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String aerolineaSeleccionada = jComboBoxAerolinea3.getSelectedItem().toString();
        if (!txtNombres.getText().isEmpty()
                && !txtApellidos.getText().isEmpty()
                && !txtDni.getText().isEmpty()
                && !txtCorreo.getText().isEmpty()
                && !txtTelefono.getText().isEmpty()
                && !txtPasaporte.getText().isEmpty()
                && !txtNacionalidad.getText().isEmpty()
                && !"Seleccionar".equals(aerolineaSeleccionada)
                && !txtId.getText().isEmpty()
                && !txtFila.getText().isEmpty()
                && !txtColumna.getText().isEmpty()) {

            String nombreArchivoVuelos = "vuelos" + aerolineaSeleccionada + ".txt";
            aerolinea.setVuelos(archivoVuelos.leer(nombreArchivoVuelos));
            vuelos = aerolinea.getVuelos();

            if (aerolinea.existeVuelo(txtId.getText())) {
                String nombreArchivoPasajeros = "pasajeros" + aerolineaSeleccionada + ".txt";
                archivoPasajeros.crear(nombreArchivoPasajeros);
                avion.setPasajeros(archivoPasajeros.leer(nombreArchivoPasajeros));

                if (!avion.existePasajero(txtDni.getText())) {
                    if (!avion.verificarOcupadoAsiento(Integer.parseInt(txtFila.getText()), Integer.parseInt(txtColumna.getText()))) {
                        Pasajero pasajero = new Pasajero(txtNombres.getText(), txtApellidos.getText(), txtDni.getText(), txtCorreo.getText(), txtTelefono.getText(), txtPasaporte.getText(), txtNacionalidad.getText(), txtId.getText(), Integer.parseInt(txtFila.getText()), Integer.parseInt(txtColumna.getText()));
                        archivoPasajeros.escribir(pasajero, nombreArchivoPasajeros);
                        mostrarVoucher(pasajero, aerolinea.obtenerVueloPorID(txtId.getText()));
                        JOptionPane.showMessageDialog(this, "Reserva registrada con éxito.");

                    } else {
                        JOptionPane.showMessageDialog(this, ("Ya esta tomado ese asiento " + txtDni.getText()), "Advertencia", JOptionPane.WARNING_MESSAGE);

                    }

                } else {
                    JOptionPane.showMessageDialog(this, ("Ya existe reserva con el numero de DNI " + txtDni.getText()), "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No existe vuelo con ese ID.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadActionPerformed

    private void txtPasaporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasaporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasaporteActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        limpiarTabla(jTableVuelosBuscar);

        String aerolineaSeleccionada = jComboBoxAerolinea4.getSelectedItem().toString();
        if (!"Seleccionar".equals(aerolineaSeleccionada)) {
            String nombreArchivoVuelos = "vuelos" + aerolineaSeleccionada + ".txt";
            File archivo = new File(nombreArchivoVuelos);

            if (archivo.exists()) {
                aerolinea.setVuelos(archivoVuelos.leer(nombreArchivoVuelos));
                vuelos = aerolinea.getVuelos();

                if (!vuelos.isEmpty()) {
                    buscarPorAerolinea(jTableVuelosBuscar, vuelos);
                } else {
                    JOptionPane.showMessageDialog(this,
                            "No se encontraron vuelos para la aerolínea seleccionada.",
                            "Información",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this,
                        "El archivo de vuelos para la aerolínea seleccionada no existe.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Seleccione una aerolínea.",
                    "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void jComboBoxAerolineaBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAerolineaBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAerolineaBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDni.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtPasaporte.setText("");
        txtNacionalidad.setText("");
        jComboBoxAerolinea3.setSelectedIndex(0);
        txtId.setText("");
        txtFila.setText("");
        txtColumna.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jComboBoxAerolineaBuscar.setSelectedIndex(0);
        jcbxBuscarPor.setSelectedIndex(0);
        txtBuscar.setText("");
        limpiarTabla(tablaBuscar);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        String aerolineaSeleccionada = jComboBoxAerolineaBuscar.getSelectedItem().toString();
        if (!"Seleccionar".equals(aerolineaSeleccionada)) {
            String nombreArchivoPasajeros = "pasajeros" + aerolineaSeleccionada + ".txt";
            avion.setPasajeros(archivoPasajeros.leer(nombreArchivoPasajeros));
            pasajeros = avion.getPasajeros();
            mostrarTodasLasReservas(tablaBuscar);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una aerolínea.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMostrarActionPerformed

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

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    public void mostrarTodasLasReservas(JTable jTable) {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"Vuelo (ID)", "Nombres", "Apellidos", "DNI", "Correo", "Telefono", "Pasaporte", "Nacionalidad", "Fila", "Columna"};
        tabla.setColumnIdentifiers(titulos);
        jTable.setModel(tabla);
        limpiarTabla(jTable);

        Object[] fila = new Object[tabla.getColumnCount()];

        for (int i = 0; i < pasajeros.size(); i++) {
            Pasajero pasajero = pasajeros.get(i);
            llenarFilaReserva(fila, pasajero);
            tabla.addRow(fila);

        }

        jTable.setRowHeight(60);
    }

    public void buscarPorDNI(JTable jTable, String DNI) {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"Vuelo (ID)", "Nombres", "Apellidos", "DNI", "Correo", "Telefono", "Pasaporte", "Nacionalidad", "Fila", "Columna"};
        tabla.setColumnIdentifiers(titulos);
        jTable.setModel(tabla);
        limpiarTabla(jTable);

        Object fila[] = new Object[tabla.getColumnCount()];

        for (int i = 0; i < pasajeros.size(); i++) {
            Pasajero pasajero = pasajeros.get(i);
            if (pasajero.getDNI().equals(DNI)) {
                llenarFilaReserva(fila, pasajero);
                tabla.addRow(fila);
            }
        }

        jTable.setRowHeight(60);
    }

    public void buscarPorPasaporte(JTable jTable, String pasaporte) {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"Vuelo (ID)", "Nombres", "Apellidos", "DNI", "Correo", "Telefono", "Pasaporte", "Nacionalidad", "Fila", "Columna"};
        tabla.setColumnIdentifiers(titulos);
        jTable.setModel(tabla);
        limpiarTabla(jTable);

        Object fila[] = new Object[tabla.getColumnCount()];

        for (int i = 0; i < pasajeros.size(); i++) {
            Pasajero pasajero = pasajeros.get(i);
            if (pasajero.getPasaporte().equals(pasaporte)) {
                llenarFilaReserva(fila, pasajero);
                tabla.addRow(fila);
            }
        }

        jTable.setRowHeight(60);
    }

    public void buscarPorVueloID(JTable jTable, String ID) {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"Vuelo (ID)", "Nombres", "Apellidos", "DNI", "Correo", "Telefono", "Pasaporte", "Nacionalidad", "Fila", "Columna"};
        tabla.setColumnIdentifiers(titulos);
        jTable.setModel(tabla);
        limpiarTabla(jTable);

        Object fila[] = new Object[tabla.getColumnCount()];

        for (int i = 0; i < pasajeros.size(); i++) {
            Pasajero pasajero = pasajeros.get(i);
            if (pasajero.getCodigo().equals(ID)) {
                llenarFilaReserva(fila, pasajero);
                tabla.addRow(fila);
            }
        }
        jTable.setRowHeight(60);
    }

    private void llenarFilaReserva(Object[] fila, Pasajero pasajero) {
        fila[0] = pasajero.getCodigo();
        fila[1] = pasajero.getNombres();
        fila[2] = pasajero.getApellidos();
        fila[3] = pasajero.getDNI();
        fila[4] = pasajero.getCorreo();
        fila[5] = pasajero.getTelefono();
        fila[6] = pasajero.getPasaporte();
        fila[7] = pasajero.getNacionalidad();
        fila[8] = pasajero.getFila();
        fila[9] = pasajero.getColumna();
    }

    public void buscarPorAerolinea(JTable jTable, ArrayList<Vuelo> vuelos) {
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"ID", "Precio", "Fecha de salida", "Hora de salida", "Fecha de llegada", "Hora de llegada", "Origen", "Destino"};
        tabla.setColumnIdentifiers(titulos);
        jTable.setModel(tabla);
        limpiarTabla(jTable);

        Object fila[] = new Object[tabla.getColumnCount()];

        for (int i = 0; i < vuelos.size(); i++) {
            Vuelo vuelo = vuelos.get(i);
            llenarFila(fila, vuelo);
            tabla.addRow(fila);
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

    public void eliminarReserva() {
        int posicion;
        int fila = jTableEliminarReserva.getSelectedRow();
        String aerolineaSeleccionada = jComboBoxAerolineaEliminar.getSelectedItem().toString();
        String DNI = jTextFieldDNIEliminar.getText();
        String codigoAvion = jTextFieldIDBuscar.getText();

        if (fila >= 0) {
            Pasajero pasajeroEliminar = pasajeros.get(fila);
            posicion = avion.buscarPasajeroPorDNI(DNI);
            String nombreArchivoPasajeros = "pasajeros" + aerolineaSeleccionada + ".txt";
            archivoVuelos.eliminar(nombreArchivoPasajeros, posicion);
            JOptionPane.showMessageDialog(this, "Reserva cancelada con éxito.");
            limpiarTabla(jTableEliminarReserva);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una reserva.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void mostrarVoucher(Pasajero pasajero, Vuelo vuelo) {
        Voucher voucher = new Voucher();
        voucher.setjTextFieldNombres(pasajero.getNombres());
        voucher.setjTextFieldApellidos(pasajero.getApellidos());
        voucher.setjTextFieldID(pasajero.getCodigo());
        voucher.setjTextFieldFila(String.valueOf(pasajero.getFila()));
        voucher.setjTextFieldColumna(String.valueOf(pasajero.getColumna()));
        voucher.setjTextFieldFechaSalida(vuelo.getFechasalida());
        voucher.setjTextFieldFechaLlegada(vuelo.getFechallegada());
        if (vuelo instanceof VueloNacional) {
            voucher.setjTextFieldOrigen(((VueloNacional) vuelo).getDepartamentoOrigen());
            voucher.setjTextFieldDestino(((VueloNacional) vuelo).getDepartamentoDestino());
        } else if (vuelo instanceof VueloInternacional) {
            voucher.setjTextFieldOrigen(((VueloInternacional) vuelo).getPaisOrigen());
            voucher.setjTextFieldDestino(((VueloInternacional) vuelo).getPaisDestino());
        }
        voucher.setVisible(true);
    }

    public void limpiarTabla(JTable jTable) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);
    }

    //Metodos auxiliares
    //Fin metodos auxiliares    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonSeleccionarAsiento;
    private javax.swing.JComboBox<String> jComboBoxAerolinea3;
    private javax.swing.JComboBox<String> jComboBoxAerolinea4;
    private javax.swing.JComboBox<String> jComboBoxAerolineaBuscar;
    private javax.swing.JComboBox<String> jComboBoxAerolineaEliminar;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelBuscarReserva;
    private javax.swing.JPanel jPanelCancelarReserva;
    private javax.swing.JPanel jPanelIngresarReserva;
    private javax.swing.JPanel jPanelIngresarReservaDatos;
    private javax.swing.JPanel jPanelMostrarVuelos;
    private javax.swing.JPanel jPanelPresentación;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableEliminarReserva;
    private javax.swing.JTable jTableVuelosBuscar;
    private javax.swing.JTextField jTextFieldDNIEliminar;
    private javax.swing.JTextField jTextFieldIDBuscar;
    private javax.swing.JComboBox<String> jcbxBuscarPor;
    private javax.swing.JTable tablaBuscar;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosUsuario;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelularUsuario;
    private javax.swing.JTextField txtColumna;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoUsuario;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDniUsuario;
    private javax.swing.JTextField txtFila;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombresUsuario;
    private javax.swing.JTextField txtPasaporte;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

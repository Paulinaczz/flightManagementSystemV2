package igu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElegirAsiento extends JFrame {
    private JButton[][] asientos;  
    private int filaSeleccionada = -1;
    private int columnaSeleccionada = -1;
    private String idVuelo;

    private ActionListener asientoSeleccionadoListener;

    public ElegirAsiento(String idVuelo) {
        this.idVuelo = idVuelo;
        setTitle("Selección de Asientos - Vuelo " + idVuelo);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        inicializarInterfaz();
    }

    private void inicializarInterfaz() {
        JPanel panelPrincipal = new JPanel(new BorderLayout(10, 10));

        // Etiqueta título
        JLabel titulo = new JLabel("Seleccione su asiento - Vuelo " + idVuelo, SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        panelPrincipal.add(titulo, BorderLayout.NORTH);

        // Panel de asientos
        JPanel panelAsientos = new JPanel(new GridLayout(6, 6, 8, 8));
        asientos = new JButton[6][6];

        for (int fila = 0; fila < 6; fila++) {
            for (int col = 0; col < 6; col++) {
                JButton btn = new JButton((fila + 1) + "" + (char) ('A' + col));
                btn.setBackground(new Color(144, 238, 144)); // verde claro = disponible
                btn.setFocusPainted(false);
                btn.setFont(new Font("Arial", Font.PLAIN, 12));

                int f = fila;
                int c = col;

                btn.addActionListener(e -> {
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (asientos[i][j].isEnabled()) {
                                asientos[i][j].setBackground(new Color(144, 238, 144));
                            }
                        }
                    }

                    btn.setBackground(Color.YELLOW);
                    filaSeleccionada = f + 1;
                    columnaSeleccionada = c + 1;

                    if (asientoSeleccionadoListener != null) {
                        asientoSeleccionadoListener.actionPerformed(
                                new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "asientoSeleccionado")
                        );
                    }
                });

                asientos[fila][col] = btn;
                panelAsientos.add(btn);
            }
        }

        panelPrincipal.add(panelAsientos, BorderLayout.CENTER);

        // Botón confirmar
        JButton btnConfirmar = new JButton("Confirmar Selección");
        btnConfirmar.setFont(new Font("Arial", Font.BOLD, 14));
        btnConfirmar.setBackground(new Color(100, 149, 237)); 
        btnConfirmar.setForeground(Color.WHITE);
        btnConfirmar.setFocusPainted(false);

        btnConfirmar.addActionListener(e -> {
            if (filaSeleccionada == -1 || columnaSeleccionada == -1) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un asiento primero.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Has seleccionado el asiento: Fila " + filaSeleccionada + " - Columna " + columnaSeleccionada,
                        "Asiento Confirmado", JOptionPane.INFORMATION_MESSAGE);
                dispose(); // cerrar ventana
            }
        });

        panelPrincipal.add(btnConfirmar, BorderLayout.SOUTH);

        add(panelPrincipal);
    }

    // Métodos para comunicar selección a otra clase
    public int getFila() {
        return filaSeleccionada;
    }

    public int getColumna() {
        return columnaSeleccionada;
    }

    public void setAsientoSeleccionadoListener(ActionListener listener) {
        this.asientoSeleccionadoListener = listener;
    }
}

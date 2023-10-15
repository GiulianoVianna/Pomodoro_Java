package View;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import java.io.InputStream;

public class frmPomodoro extends javax.swing.JFrame {

    private Timer timer;
    private int segundosRestantes;

    public frmPomodoro() {
        
        initComponents();

        // Centraliza a janela
        setLocationRelativeTo(null);

        // Define o ícone da janela
        ImageIcon icone = new ImageIcon(frmPomodoro.class.getResource("/Imagens/tomate.png"));
        setIconImage(icone.getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTempo = new javax.swing.JLabel();
        cbTempo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbPausa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pomodoro");
        setResizable(false);

        lbTempo.setFont(new java.awt.Font("sansserif", 0, 68)); // NOI18N
        lbTempo.setForeground(new java.awt.Color(153, 153, 255));
        lbTempo.setText("00:00");

        cbTempo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cbTempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "15:00", "20:00", "25:00", "30:00", "35:00" }));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("Tempo");

        cbPausa.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cbPausa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "05:00", "10:00", "15:00" }));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setText("Pausa");

        btnIniciar.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTempo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbPausa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbTempo))
                    .addComponent(jSeparator1))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPausa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        lbTempo.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        iniciarContagem();
    }//GEN-LAST:event_btnIniciarActionPerformed

    public static void main(String args[]) {

        // Chama o método para configurar o tema antes de tornar a janela visível
        configurarTemaFlatLafDark();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPomodoro().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JComboBox<String> cbPausa;
    private javax.swing.JComboBox<String> cbTempo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTempo;
    // End of variables declaration//GEN-END:variables

    private boolean emPausa = false; // Variável para controlar se estamos em pausa ou não

    // Método para iniciar a contagem do tempo ou pausa
    private void iniciarContagem() {

        String tempoSelecionado; // Variável para armazenar o tempo selecionado pelo usuário
        // Verifica se está em pausa ou não
        if (emPausa) {
            tempoSelecionado = (String) cbPausa.getSelectedItem();
        } else {
            tempoSelecionado = (String) cbTempo.getSelectedItem();
        }
        // Converte o tempo selecionado para segundos
        segundosRestantes = Integer.parseInt(tempoSelecionado.split(":")[0]) * 60;

        // Para o timer anterior, se houver
        if (timer != null) {
            timer.stop();
        }

        // Cria um novo Timer
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundosRestantes--; // Decrementa os segundos restantes
                atualizarLabel(); // Atualiza o rótulo para mostrar o tempo restante

                // Quando o tempo acaba
                if (segundosRestantes <= 0) {
                    timer.stop(); // Para o timer
                    try {
                        tocarMp3("/MP3/sino.mp3"); // Toca o áudio
                    } catch (Exception ex) {
                        // Log ou tratamento da exceção
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    emPausa = !emPausa; // Inverte o estado (pausa <-> trabalho)
                    iniciarContagem(); // Inicia a contagem novamente
                }
            }
        });
        timer.start(); // Inicia o timer
    }

    // Método para tocar um arquivo MP3
    private void tocarMp3(String caminhoArquivo) throws Exception {
        try {

            // Carrega o arquivo MP3 do caminho especificado
            InputStream is = getClass().getResourceAsStream(caminhoArquivo);
            if (is == null) {
                throw new RuntimeException("Arquivo MP3 não encontrado.");
            }

            // Inicializa o player e toca o arquivo
            AdvancedPlayer player = new AdvancedPlayer(is);
            player.play();

        } catch (JavaLayerException error) {

            // Tratamento de erro específico para problemas de reprodução
            JOptionPane.showMessageDialog(null, "Erro ao tocar o MP3: " + error, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarLabel() {
        int minutos = segundosRestantes / 60;
        int segundos = segundosRestantes % 60;
        lbTempo.setText(String.format("%02d:%02d", minutos, segundos));
    }

    // Método estático para configurar o tema FlatLaf Dark
    public static void configurarTemaFlatLafDark() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            // Trate a exceção aqui, caso o tema não possa ser aplicado
            ex.printStackTrace();
        }
    }

}

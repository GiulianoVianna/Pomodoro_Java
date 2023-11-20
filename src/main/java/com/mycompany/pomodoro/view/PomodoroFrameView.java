package com.mycompany.pomodoro.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
import java.io.InputStream;

/**
 * {@code PomodoroFrameView} é uma classe que estende {@link javax.swing.JFrame}
 * e representa a janela principal da aplicação Pomodoro.
 * <p>
 * Esta classe é responsável por criar a interface gráfica do usuário (GUI) para
 * o aplicativo Pomodoro. Ela inclui componentes para exibir o tempo, iniciar e
 * pausar a contagem regressiva, e configurar os períodos de trabalho e pausa. A
 * classe gerencia a interação do usuário com a aplicação e atualiza a GUI de
 * acordo com o estado atual do temporizador Pomodoro.
 * </p>
 * <p>
 * A classe {@code PomodoroFrameView} encapsula a lógica de inicialização e
 * configuração dos componentes de interface do usuário, bem como o
 * gerenciamento de eventos de interação do usuário, como cliques em botões e
 * seleções em comboboxes.
 * </p>
 *
 * <b>Características principais:</b>
 * <ul>
 * <li>Criação e configuração da janela principal da aplicação.</li>
 * <li>Gerenciamento de componentes da interface do usuário, como rótulos,
 * botões e comboboxes.</li>
 * <li>Integração com outras classes para gerenciar a lógica do temporizador
 * Pomodoro.</li>
 * </ul>
 */
public class PomodoroFrameView extends javax.swing.JFrame {

    private Timer timer;
    private int segundosRestantes;

    public PomodoroFrameView() {

        initComponents();

        // Centraliza a janela
        setLocationRelativeTo(null);

        // Define o ícone da janela
        ImageIcon icone = new ImageIcon(PomodoroFrameView.class.getResource("/Icon/tomate.png"));
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
        cbTempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00", "15:00", "20:00", "25:00", "30:00", "35:00" }));

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PomodoroFrameView().setVisible(true);
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

    /**
     * Inicia a contagem regressiva do tempo de trabalho ou pausa. Este método
     * controla o fluxo de alternância entre períodos de trabalho e pausa. Ele
     * configura e inicia um timer que conta regressivamente o tempo
     * especificado, atualiza o rótulo do tempo na interface do usuário e toca
     * um áudio quando o tempo expira.
     * <p>
     * O método verifica se o usuário está em um período de pausa ou não,
     * seleciona o tempo apropriado do combobox correspondente e o converte em
     * segundos. Se já houver um timer em execução, ele é interrompido antes de
     * um novo ser iniciado.
     * </p>
     * <p>
     * Quando o tempo acaba, o timer é parado, um som de notificação é tocado, e
     * o estado de pausa é invertido. O método então se chama recursivamente
     * para iniciar a próxima contagem (trabalho ou pausa).
     * </p>
     *
     * <b>Fluxo do método:</b>
     * <ul>
     * <li>Verifica se está em pausa ou não.</li>
     * <li>Seleciona o tempo apropriado e o converte em segundos.</li>
     * <li>Para o timer anterior, se houver.</li>
     * <li>Cria e inicia um novo timer.</li>
     * <li>Atualiza o rótulo de tempo e toca um som quando o tempo acaba.</li>
     * <li>Alterna o estado de pausa e inicia a próxima contagem.</li>
     * </ul>
     */
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
                        tocarMp3(); // Toca o áudio
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

    /**
     * Toca um arquivo de áudio MP3 especificado. Este método é responsável por
     * carregar e reproduzir o arquivo MP3 utilizado para notificação sonora.
     * <p>
     * O método primeiro tenta carregar o arquivo MP3 do caminho especificado.
     * Se o arquivo não for encontrado, uma exceção {@code RuntimeException} é
     * lançada. Após carregar o arquivo, o método utiliza a biblioteca JavaLayer
     * para reproduzir o som.
     * </p>
     * <p>
     * Em caso de falha na reprodução do áudio, como um problema com o formato
     * do arquivo ou com a biblioteca JavaLayer, o método captura a exceção
     * {@code JavaLayerException} e exibe uma mensagem de erro para o usuário.
     * </p>
     *
     * @throws Exception Lança uma exceção genérica se o arquivo MP3 não for
     * encontrado ou se ocorrer um erro durante a inicialização do player.
     *
     * <b>Fluxo do método:</b>
     * <ul>
     * <li>Carrega o arquivo MP3 do caminho especificado.</li>
     * <li>Inicializa o player de MP3.</li>
     * <li>Toca o arquivo MP3.</li>
     * <li>Captura e trata qualquer exceção relacionada à reprodução do
     * áudio.</li>
     * </ul>
     */
    private void tocarMp3() throws Exception {
        try {

            // Carrega o arquivo MP3 do caminho especificado
            InputStream is = getClass().getResourceAsStream("/MP3/sino.mp3");
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

    /**
     * Atualiza o rótulo de tempo na interface do usuário com o tempo restante
     * formatado. Este método é responsável por calcular os minutos e segundos
     * restantes a partir do total de segundos e atualizar o rótulo
     * {@code lbTempo} na interface gráfica.
     * <p>
     * O tempo é dividido em minutos e segundos, e é formatado para o formato
     * <code>MM:ss</code>, onde MM representa os minutos e ss representa os
     * segundos. O formato garante que os minutos e os segundos sejam sempre
     * exibidos com dois dígitos, preenchendo com zero à esquerda quando
     * necessário.
     * </p>
     *
     * <b>Fluxo do método:</b>
     * <ul>
     * <li>Calcula os minutos e segundos restantes.</li>
     * <li>Formata o tempo no formato MM:ss.</li>
     * <li>Atualiza o rótulo {@code lbTempo} com o tempo formatado.</li>
     * </ul>
     */
    private void atualizarLabel() {
        int minutos = segundosRestantes / 60;
        int segundos = segundosRestantes % 60;
        lbTempo.setText(String.format("%02d:%02d", minutos, segundos));
    }

}

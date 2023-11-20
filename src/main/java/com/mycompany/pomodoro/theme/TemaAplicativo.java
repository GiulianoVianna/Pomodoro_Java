package com.mycompany.pomodoro.theme;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

/**
 * A classe {@code TemaAplicativo} é responsável por configurar o tema visual da
 * aplicação.
 * <p>
 * Esta classe contém métodos estáticos para configurar o Look and Feel (LAF) da
 * interface do usuário, permitindo a personalização visual da aplicação.
 * Atualmente, oferece suporte para configurar o tema FlatLaf Dark.
 * </p>
 */
public class TemaAplicativo {

    /**
     * Configura o tema visual da aplicação para o FlatLaf Dark.
     * <p>
     * Este método tenta definir o Look and Feel da aplicação para o FlatLaf
     * Dark, que é um tema escuro. Se bem-sucedido, imprime uma mensagem no
     * console indicando que o tema foi configurado com sucesso. Em caso de
     * falha, uma mensagem de erro é impressa no console e o stack trace da
     * exceção é exibido, indicando o motivo da falha.
     * </p>
     * <p>
     * Este método é útil para aplicar uma aparência consistente e moderna em
     * toda a aplicação.
     * </p>
     *
     * <b>Processo:</b>
     * <ul>
     * <li>Tenta definir o Look and Feel para FlatLaf Dark.</li>
     * <li>Registra sucesso ou falha no console.</li>
     * </ul>
     */
    public static void configurarTemaFlatLafDark() {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());

            // Se não houver exceção, o tema foi configurado com sucesso
            System.out.println("Tema FlatLaf Dark configurado com sucesso.");
        } catch (Exception e) {
            System.err.println("Não foi possível configurar o tema FlatLaf Dark.");
            e.printStackTrace();
        }
    }
}

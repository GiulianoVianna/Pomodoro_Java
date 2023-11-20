package com.mycompany.pomodoro.theme;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

/**
 *
 * @author giulianojorgeviannasilva
 */
public class TemaAplicativo {

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

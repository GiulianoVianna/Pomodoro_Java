package com.mycompany.pomodoro;

import com.mycompany.pomodoro.theme.TemaAplicativo;
import com.mycompany.pomodoro.view.PomodoroFrameView;

/**
 *
 * @author Giuliano Vianna
 */
public class Main {

    public static void main(String[] args) {

        // Configuração a aparência da janela
        TemaAplicativo.configurarTemaFlatLafDark();

        PomodoroFrameView objTela = new PomodoroFrameView();

        objTela.setVisible(true);

    }
}

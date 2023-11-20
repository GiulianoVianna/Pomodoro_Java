package com.mycompany.pomodoro;

import com.mycompany.pomodoro.theme.TemaAplicativo;
import com.mycompany.pomodoro.view.PomodoroFrameView;

/**
 * Classe principal da aplicação Pomodoro.
 * <p>
 * Esta classe contém o método {@code main}, que é o ponto de entrada da
 * aplicação. Ela é responsável por inicializar e configurar a interface do
 * usuário e iniciar a execução da aplicação.
 * </p>
 */
public class Main {

    /**
     * Ponto de entrada principal da aplicação Pomodoro.
     * <p>
     * Este método inicia a aplicação configurando o tema visual da interface do
     * usuário e criando e exibindo a janela principal. Primeiro, ele chama
     * {@code TemaAplicativo.configurarTemaFlatLafDark()} para definir o tema
     * FlatLaf Dark para a interface do usuário. Em seguida, cria uma instância
     * de {@code PomodoroFrameView} e a torna visível, iniciando assim a
     * interação do usuário com a aplicação.
     * </p>
     *
     * @param args Argumentos da linha de comando (não utilizados nesta
     * aplicação).
     */
    public static void main(String[] args) {

        // Configuração a aparência da janela
        TemaAplicativo.configurarTemaFlatLafDark();

        PomodoroFrameView objTela = new PomodoroFrameView();

        objTela.setVisible(true);

    }
}

# Projeto Pomodoro Timer

![image](https://github.com/GiulianoVianna/Pomodoro_Java/assets/101942554/57d278f3-f897-4ba8-8ca8-2837a54424d1)


## Descrição

Este projeto é um temporizador Pomodoro construído em Java Swing. O método Pomodoro é uma técnica de gerenciamento de tempo que envolve trabalhar em ciclos de concentração intensa, geralmente de 25 minutos, seguidos de curtos intervalos de descanso, normalmente de 5 minutos.

## Características

- **Temporizador**: O programa conta regressivamente a partir de um tempo selecionado.
- **Pausas**: O temporizador suporta períodos de pausa e trabalho.
- **Som de Alerta**: Toca um áudio ao final de cada ciclo de trabalho ou pausa.
- **Tema Escuro**: Usa o tema escuro FlatLaf para uma melhor experiência visual.

## Como Usar

1. **Iniciar Contagem**: Clique no botão "Iniciar" para iniciar a contagem regressiva. O tempo inicial é selecionado a partir de um menu suspenso.
2. **Pausa e Trabalho**: O programa alterna automaticamente entre períodos de pausa e trabalho.
3. **Som de Alerta**: Um som será tocado ao final de cada período.

## Explicação de Código (Para Desenvolvedores)

### Métodos Importantes

- `iniciarContagem()`: Este método é responsável por iniciar a contagem regressiva.
- `tocarMp3(String caminhoArquivo)`: Método para tocar um arquivo MP3.
- `atualizarLabel()`: Atualiza o rótulo do tempo na interface gráfica.

### Tratamento de Erros

O código usa `try-catch` para tratar erros, especialmente relacionados ao tocador de MP3. Quando ocorre um erro, uma caixa de diálogo é mostrada para informar o usuário.



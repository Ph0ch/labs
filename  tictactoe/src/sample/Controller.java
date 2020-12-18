package sample;

import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Controller {
    public GridPane pane;
    private char[][] data;
    private final int cnt = 4;
    private char turn;

    public Controller() {
        turn = 'x';
        data = new char[cnt][cnt];
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                data[i][j] = ' ';
            }
        }
    }

    private void showWinner(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Внимание");
        alert.setHeaderText("Игра завершена");
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void handleClick(MouseEvent mouseEvent) {
        Object src = mouseEvent.getSource();
        if (!(src instanceof Label)) {
            return;
        }
        Label lbl = (Label) src;
        lbl.getUserData();
        int row = GridPane.getRowIndex(lbl);
        int col = GridPane.getColumnIndex(lbl);
        processTurn(row, col);
    }

    private void processTurn(int row, int col) {
        if (data[row][col] != ' ') {
            return;
        }
        data[row][col] = turn;
        changeTurn();
        render();
        processWinner();
    }

    private void processWinner() {
        char winner = checkWinner();
        if (winner == '?') {
            return;
        }
        if (winner == 'x') {
            showWinner("Крестики победили!");
        } else if (winner == 'o') {
            showWinner("Нолики победили");
        } else if (winner == ' ') {
            showWinner("Ничья =(");
        }
        clear();
        render();
    }

    private void clear() {
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                data[i][j] = ' ';
            }
        }
    }

    /**
     * Check the winner.
     *
     * @return ' ' - draw, '?' - continue the game, 'x' - X wins, 'o' - O wins.
     */
    private char checkWinner() {
        for (int i = 0; i < cnt; i++) {
            if (data[i][0] != ' ' && data[i][0] == data[i][1] && data[i][0] == data[i][2] && data[i][0] == data[i][3]) {
                return data[i][0];
            }
            if (data[0][i] != ' ' && data[0][i] == data[1][i] && data[0][i] == data[2][i] && data[0][i] == data[3][i]) {
                return data[0][i];
            }
        }
        if (data[0][0] != ' ' && data[0][0] == data[1][1] && data[0][0] == data[2][2] && data[0][0] == data[3][3]) {
            return data[0][0];
        }
        if (data[0][3] != ' ' && data[0][3] == data[1][2] && data[0][3] == data[2][1] && data[0][3] == data[3][0]) {
            return data[0][3];
        }
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                if (data[i][j] == ' ') {
                    return '?';
                }
            }
        }
        return ' ';
    }

    private void changeTurn() {
        turn = turn == 'x' ? 'o' : 'x';
    }

    private void render() {
        for (Node node : pane.getChildren()) {
            if (!(node instanceof Label)) {
                continue;
            }
            Label lbl = (Label) node;
            int row = GridPane.getRowIndex(lbl);
            int col = GridPane.getColumnIndex(lbl);
            lbl.setText(data[row][col] + "");
        }
    }
}

package com.example.rick.tictactoe.logic;

public interface Board {
    public void initializeBoard();
    public void printBoard();
    public boolean isBoardFull();
    public boolean checkForWin();

    public boolean checkRowsForWin();
    public boolean checkColumnsForWins();
    public boolean checkDiagonalForWins();
    public boolean checkRowCol(char c1,char c2,char c3);
    public void changePlayer();
    public boolean placeMark(int row, int col);
}

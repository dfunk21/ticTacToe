package com.company;

/**
 * Created by df377 on 12/19/16.
 */
public class board {

    public String mode;

    public board (String s) {
        mode = s;
    }

    public String[][] createBoard ()
    {
        String board[] [] = new String[3] [3];

        String n = "";
        for (int i = 0; i < board.length; i++)
        {
            board [i][0] = "";
            board [i][1] = "";
            board [i][2] = "";
        }

        int space = 0;
        for (int j = 0; j < 3; j++)
        {
            System.out.println("_" + board[j][space] + "_|_" + board[j][space + 1] + "_|_" + board[j][space + 2] + "_");
        }
        return board;
    }

    //board print out

}

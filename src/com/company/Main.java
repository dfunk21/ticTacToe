package com.company;

public class Main {

    public static void main(String[] args) {
	//Tic Tac Toe again...
        //I might cry

        String board[] [] = new String[3] [3];

        int space = 0;
        for (int j = 0; j < 3; j++)
        {
            System.out.println("_" + board[j][space] + "_|_" + board[j][space + 1] + "_|_" + board[j][space + 2] + "_");
        }
        //board print out

        System.out.println("\nWelcome to Tic-Tac-Toe Remastered! You will be the X player in our game and will" +
                "be taking the first turn! Where would you like to move (Type in coordinates)");


    }
}

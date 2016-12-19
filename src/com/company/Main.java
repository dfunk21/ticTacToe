package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	//Tic Tac Toe again...
        //I might cry

        Scanner kb = new Scanner(System.in);

        System.out.println("What game mode would you like to start with: Player vs. Player, Computer vs. Player, " +
                "or Computer vs. Computer?\nType 1 for PvP, 2 for CvP, or 3 for CvC");
        String gameMode = kb.nextLine();

        if (gameMode.equalsIgnoreCase("1")) {
            System.out.println("\nWelcome to Tic-Tac-Toe Remastered! You will be the X player in our game and will" +
                    "be taking the first turn!\nWhere would you like to move");

            //board print out
            board hi = new board("ready");
            hi.createBoard();

            //first turn
            System.out.println("Enter X coordinate (first row is 0, second row 1, third row 2)");
            int xCoordinate = kb.nextInt();

            System.out.println("Enter Y coordinate (first column is 0, second column 1, third column 2");
            int yCoordinate = kb.nextInt();

            takeTurn start = new takeTurn(xCoordinate, yCoordinate);




        }

    }
}

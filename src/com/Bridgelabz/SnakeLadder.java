package com.Bridgelabz;

public class SnakeLadder {
    public static final int winningPosition = 100;

    public static void main(String[] args) {


        int currentPositionPlayer1 = 0;
        int currentPositionPlayer2 = 0;
        boolean player1Turn = true;

        while (currentPositionPlayer1 < winningPosition && currentPositionPlayer2 < winningPosition) {
            int dice=(int)(Math.random()*6+1);

            int Options = (int) ((Math.random() * 10) %3);

            if (player1Turn) {
                switch (Options) {
                    case 0:
                        System.out.println("Player 1 - No Play");

                        break;
                    case 1:
                        System.out.println("Player 1 - Ladder");
                        currentPositionPlayer1 += dice;
                        break;
                    case 2:
                        System.out.println("Player 1 - Snake");
                        currentPositionPlayer1 -= dice;
                        if (currentPositionPlayer1 < 0) {
                            currentPositionPlayer1 = 0;
                        }
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }

                System.out.println("Player 1 - Current Position: " + currentPositionPlayer1);
            } else {
                switch (Options) {
                    case 0:
                        System.out.println("Player 2 - No Play");
                        // Player stays in the same position, no change needed
                        break;
                    case 1:
                        System.out.println("Player 2 - Ladder");
                        currentPositionPlayer2 += dice;
                        break;
                    case 2:
                        System.out.println("Player 2 - Snake");
                        currentPositionPlayer2 -= dice;
                        if (currentPositionPlayer2 < 0) {
                            currentPositionPlayer2 = 0;
                        }
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }

                System.out.println("Player 2 - Current Position: " + currentPositionPlayer2);
            }


            if (currentPositionPlayer1 > winningPosition || currentPositionPlayer2 > winningPosition) {
                if (player1Turn) {
                    currentPositionPlayer1 -= dice;
                } else {
                    currentPositionPlayer2 -= dice;
                }
            } else {

                if (Options == 1) {
                    continue;
                }
            }
            player1Turn = !player1Turn;
        }

        if (currentPositionPlayer1 >= winningPosition && currentPositionPlayer2 >= winningPosition) {
            System.out.println("It's a tie!");
        } else if (currentPositionPlayer1 >= winningPosition) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}


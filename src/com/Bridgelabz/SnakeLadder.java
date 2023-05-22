package com.Bridgelabz;

public class SnakeLadder {
    public static void main(String[] args)
    {
        int Position = 0;
        int winningPosition=100;
        for(Position=0;Position<=winningPosition;Position++){
            int dice=(int)(Math.random()*6+1);

            int Options = (int)((Math.random() * 10)%3);

            switch (Options) {
                case 0:
                    System.out.println("NoPlay");
                    break;
                case 1:
                    System.out.println("Ladder");
                    Position+=dice;
                    break;
                default:
                    System.out.println("Snake");
                    Position-=dice;

            }
            if (Position < 0) {
                Position = 0;
            }
            System.out.println("CurrentPosition : "+Position);
        }
        System.out.println("Player has reached the winning position" +winningPosition);
    }
}


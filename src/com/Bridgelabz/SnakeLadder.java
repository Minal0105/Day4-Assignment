package com.Bridgelabz;

public class SnakeLadder {
    public static void main(String[] args)
    {
        int currentPosition = 10,Position=0;
        int dice=(int)(Math.random()*6+1);

        int Options = (int) ((Math.random() * 10) %3);

        switch (Options) {
            case 0:
                System.out.println("NoPlay");
                System.out.println("stay at same position");
                break;
            case 1:
                System.out.println("Ladder");
                Position=currentPosition+dice;
                System.out.println("Move ahead by "+dice+" Position");
                break;
            default:
                System.out.println("Snake");
                Position=currentPosition-dice;
                System.out.println("Move behind by "+dice+" Position");
                break;
        }
        System.out.println("CurrentPosition : "+Position);
    }

}


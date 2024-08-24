package com.cbfacademy;

public class GameFactory {
    private static Player playerl;
    private static Player player2;

    /**
     * Creates a new dice game.
     * @param player 
     * @param Player1 
     *
     * @return A dice game.
     */
    public static Game create() {
        return new DiceGame(playerl, player2);
    
    }
}

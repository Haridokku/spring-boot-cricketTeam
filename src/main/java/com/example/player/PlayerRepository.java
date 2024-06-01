package com.example.player;

import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getAllPlayers();

    Player addPlayer(Player player);

    Player getPlayerById(int playerId);

    Player updatePlayer(int playerId, Player player);

    void removePlayer(int playerId);
}

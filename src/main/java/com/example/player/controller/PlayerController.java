
package com.example.player.controller;

import com.example.player.model.Player;
import com.example.player.service.PlayerH2Service;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class PlayerController{
    PlayerH2Service playerService = new PlayerH2Service();

    @GetMapping("/players")
    public ArrayList<Player> getPlayers(){
        return playerService.getPlayers();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId){
        return playerService.getPlayerById(playerId);
    }


    @PostMapping("/players")

    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }


    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId,@RequestBody Player player){
        return playerService.updatePlayer(playerId,player);
    }

    @DeleteMapping("/players/{playerId}")


    public void deletePlayer(@PathVariable("playerId") int playerId){
    playerService.deletePlayer(playerId);
    }


 }

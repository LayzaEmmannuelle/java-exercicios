package prova.tedlasso.model;

import java.util.ArrayList;
import java.util.List;

public class Team {
    
    private String name;
    private String colors;
    private List<Player> players = new ArrayList<Player>() {};

    public Team() {}

    public Team(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColors() {
        return this.colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}

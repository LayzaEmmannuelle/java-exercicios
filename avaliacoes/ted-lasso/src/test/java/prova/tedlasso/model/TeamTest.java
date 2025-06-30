package prova.tedlasso.model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TeamTest {

    @Test
    public void testDefaultConstructor() {
        Team team = new Team();
        assertNull(team.getName());
        assertNull(team.getColors());
        assertNotNull(team.getPlayers());
        assertTrue(team.getPlayers().isEmpty());
    }

    @Test
    public void testConstructorWithName() {
        Team team = new Team("Richmond FC");
        assertEquals("Richmond FC", team.getName());
    }

    @Test
    public void testSetAndGetName() {
        Team team = new Team();
        team.setName("Ted's Team");
        assertEquals("Ted's Team", team.getName());
    }

    @Test
    public void testSetAndGetColors() {
        Team team = new Team();
        team.setColors("Red and White");
        assertEquals("Red and White", team.getColors());
    }

    @Test
    public void testSetAndGetPlayers() {
        Player p1 = new Player();
        p1.setName("Jamie");

        Player p2 = new Player();
        p2.setName("Roy");

        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);

        Team team = new Team();
        team.setPlayers(players);

        assertEquals(2, team.getPlayers().size());
        assertEquals("Jamie", team.getPlayers().get(0).getName());
        assertEquals("Roy", team.getPlayers().get(1).getName());
    }
}

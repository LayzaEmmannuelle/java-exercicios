package prova.tedlasso.model;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void testSetAndGetName() {
        Player player = new Player();
        player.setName("Ted");
        assertEquals("Ted", player.getName());
    }

    @Test
    public void testSetAndGetSurname() {
        Player player = new Player();
        player.setSurname("Lasso");
        assertEquals("Lasso", player.getSurname());
    }

    @Test
    public void testSetAndGetNumber() {
        Player player = new Player();
        player.setNumber(10);
        assertEquals(10, player.getNumber());
    }

    @Test
    public void testSetAndGetPosition() {
        Player player = new Player();
        player.setPosition("Coach");
        assertEquals("Coach", player.getPosition());
    }

    @Test
    public void testFullPlayer() {
        Player player = new Player();
        player.setName("Jamie");
        player.setSurname("Tartt");
        player.setNumber(9);
        player.setPosition("Forward");

        assertAll("player",
            () -> assertEquals("Jamie", player.getName()),
            () -> assertEquals("Tartt", player.getSurname()),
            () -> assertEquals(9, player.getNumber()),
            () -> assertEquals("Forward", player.getPosition())
        );
    }
}

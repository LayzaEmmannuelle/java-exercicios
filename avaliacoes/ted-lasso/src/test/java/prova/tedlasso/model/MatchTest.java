package prova.tedlasso.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class MatchTest {

    @Test
    public void testSetAndGetHome() {
        Team home = new Team("Time A");
        Match match = new Match();
        match.setHome(home);
        assertEquals(home, match.getHome());
    }

    @Test
    public void testSetAndGetVisitor() {
        Team visitor = new Team("Time B");
        Match match = new Match();
        match.setVisitor(visitor);
        assertEquals(visitor, match.getVisitor());
    }

    @Test
    public void testGetResultWinner() {
        Team home = new Team("Time A");
        Team visitor = new Team("Time B");
        Match match = new Match();
        match.setHome(home);
        match.setVisitor(visitor);
        match.setHomeScore(3);
        match.setVisitorScore(1);
        assertEquals(home, match.getResult());
    }

    @Test
    public void testGetResultDraw() {
        Team home = new Team("Time A");
        Team visitor = new Team("Time B");
        Match match = new Match();
        match.setHome(home);
        match.setVisitor(visitor);
        match.setHomeScore(2);
        match.setVisitorScore(2);
        assertNull(match.getResult());
    }

    @Test
    public void testGetResultScoreForTeam() {
        Team home = new Team("Time A");
        Team visitor = new Team("Time B");
        Match match = new Match();
        match.setHome(home);
        match.setVisitor(visitor);
        match.setHomeScore(1);
        match.setVisitorScore(2);
        
        assertEquals(0, match.getResult(home));     
        assertEquals(3, match.getResult(visitor));   
    }
}

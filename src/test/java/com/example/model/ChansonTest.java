package com.example.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChansonTest {

    @Test
    public void testChansonCreation() {
        Chanson chanson = new Chanson("Title", "Artist", 300);
        assertEquals("Title", chanson.getTitre());
        assertEquals("Artist", chanson.getArtiste());
        assertEquals(300, chanson.getDuree());
    }

    @Test
    public void testSetters() {
        Chanson chanson = new Chanson("Title", "Artist", 300);
        chanson.setTitre("New Title");
        chanson.setArtiste("New Artist");
        chanson.setDuree(400);
        assertEquals("New Title", chanson.getTitre());
        assertEquals("New Artist", chanson.getArtiste());
        assertEquals(400, chanson.getDuree());
    }

    @Test
    public void testToString() {
        Chanson chanson = new Chanson("Title", "Artist", 300);
        String expected = "Chanson{titre='Title', artiste='Artist', duree=300}";
        assertEquals(expected, chanson.toString());
    }
}

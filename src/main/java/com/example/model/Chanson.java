package com.example.model;

public class Chanson {
    private String titre;
    private String artiste;
    private int duree; // en secondes

    // Constructeur
    public Chanson(String titre, String artiste, int duree) {
        this.titre = titre;
        this.artiste = artiste;
        this.duree = duree;
    }

    // Getters et Setters
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "Chanson{" +
                "titre='" + titre + '\'' +
                ", artiste='" + artiste + '\'' +
                ", duree=" + duree +
                '}';
    }
}

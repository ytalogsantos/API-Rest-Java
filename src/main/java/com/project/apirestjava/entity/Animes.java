package com.project.apirestjava.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "animes")
public class Animes {

    public Animes() {
    }

    public Animes(Integer animeId, String animeTitle, Integer animeEpisodes) {
        this.animeId = animeId;
        this.animeTitle = animeTitle;
        this.animeEpisodes = animeEpisodes;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "anime_id")
    private Integer animeId;

    @Column(name = "anime_title")
    private String animeTitle;

    @Column(name = "episodes")
    private Integer animeEpisodes;

    public Integer getAnimeId() {
        return animeId;
    }

    public void setAnimeId(Integer animeId) {
        this.animeId = animeId;
    }

    public String getAnimeTitle() {
        return animeTitle;
    }

    public void setAnimeTitle(String animeTitle) {
        this.animeTitle = animeTitle;
    }

    public Integer getAnimeEpisodes() {
        return animeEpisodes;
    }

    public void setAnimeEpisodes(Integer animeEpisodes) {
        this.animeEpisodes = animeEpisodes;
    }
}

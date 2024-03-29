package com.example.spotifyapiexample.models;

/**
 * SpotifyApiExample created by joelgnanasekaram
 * student_id: 991518913
 * on 2019-11-04
 */
public class Song {

    private String id;
    private String name;

    public Song(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

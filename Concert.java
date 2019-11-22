package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;

@Entity
public class Concert extends Event{
   private String artist;

public void setArtist(String value) {
    this.artist = value;
}
public String getArtist() {
    return this.artist;
}
}

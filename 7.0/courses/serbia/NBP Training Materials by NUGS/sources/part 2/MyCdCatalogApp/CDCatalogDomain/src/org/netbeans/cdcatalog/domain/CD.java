
package org.netbeans.cdcatalog.domain;

/**
 *
 * @author zoran
 */
public class CD {
        String title;
        String artist;
        String songs;

    public CD(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public CD(String title, String artist, String songs) {
        this.title = title;
        this.artist = artist;
        this.songs = songs;
    }

 

    public CD() {
    }     
        
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSongs() {
        return songs;
    }

    public void setSongs(String songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "CD{" + "title=" + title + "artist=" + artist + "songs=" + songs + '}';
    }




        
    

}

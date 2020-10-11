
package it.lorenzopavez.urbi.entities.cityscoot;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("scooters")
    @Expose
    private List<Scooter> scooters = null;
    @SerializedName("artworks")
    @Expose
    private List<Artwork> artworks = null;

    public List<Scooter> getScooters() {
        return scooters;
    }

    public void setScooters(List<Scooter> scooters) {
        this.scooters = scooters;
    }

    public List<Artwork> getArtworks() {
        return artworks;
    }

    public void setArtworks(List<Artwork> artworks) {
        this.artworks = artworks;
    }

}

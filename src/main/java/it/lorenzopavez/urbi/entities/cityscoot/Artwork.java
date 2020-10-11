
package it.lorenzopavez.urbi.entities.cityscoot;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Artwork {

    @SerializedName("id_scooter_artwork")
    @Expose
    private Integer idScooterArtwork;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    public Integer getIdScooterArtwork() {
        return idScooterArtwork;
    }

    public void setIdScooterArtwork(Integer idScooterArtwork) {
        this.idScooterArtwork = idScooterArtwork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}

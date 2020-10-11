
package it.lorenzopavez.urbi.entities.cityscoot;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Scooter {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("id_availability")
    @Expose
    private Integer idAvailability;
    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("id_fleet")
    @Expose
    private Integer idFleet;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("citybox")
    @Expose
    private Integer citybox;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("geohash")
    @Expose
    private String geohash;
    @SerializedName("battery")
    @Expose
    private Integer battery;
    @SerializedName("ep_soc")
    @Expose
    private Integer epSoc;
    @SerializedName("autonomy")
    @Expose
    private Integer autonomy;
    @SerializedName("plate")
    @Expose
    private String plate;
    @SerializedName("geocoding")
    @Expose
    private String geocoding;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("has_cityboost")
    @Expose
    private Boolean hasCityboost;
    @SerializedName("marker_graphic_id")
    @Expose
    private Integer markerGraphicId;
    @SerializedName("id_scooter_artwork")
    @Expose
    private Integer idScooterArtwork;
    @SerializedName("helmet_type")
    @Expose
    private Integer helmetType;
    @SerializedName("helmet_size")
    @Expose
    private String helmetSize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdAvailability() {
        return idAvailability;
    }

    public void setIdAvailability(Integer idAvailability) {
        this.idAvailability = idAvailability;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getIdFleet() {
        return idFleet;
    }

    public void setIdFleet(Integer idFleet) {
        this.idFleet = idFleet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCitybox() {
        return citybox;
    }

    public void setCitybox(Integer citybox) {
        this.citybox = citybox;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getGeohash() {
        return geohash;
    }

    public void setGeohash(String geohash) {
        this.geohash = geohash;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public Integer getEpSoc() {
        return epSoc;
    }

    public void setEpSoc(Integer epSoc) {
        this.epSoc = epSoc;
    }

    public Integer getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(Integer autonomy) {
        this.autonomy = autonomy;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getGeocoding() {
        return geocoding;
    }

    public void setGeocoding(String geocoding) {
        this.geocoding = geocoding;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getHasCityboost() {
        return hasCityboost;
    }

    public void setHasCityboost(Boolean hasCityboost) {
        this.hasCityboost = hasCityboost;
    }

    public Integer getMarkerGraphicId() {
        return markerGraphicId;
    }

    public void setMarkerGraphicId(Integer markerGraphicId) {
        this.markerGraphicId = markerGraphicId;
    }

    public Integer getIdScooterArtwork() {
        return idScooterArtwork;
    }

    public void setIdScooterArtwork(Integer idScooterArtwork) {
        this.idScooterArtwork = idScooterArtwork;
    }

    public Integer getHelmetType() {
        return helmetType;
    }

    public void setHelmetType(Integer helmetType) {
        this.helmetType = helmetType;
    }

    public String getHelmetSize() {
        return helmetSize;
    }

    public void setHelmetSize(String helmetSize) {
        this.helmetSize = helmetSize;
    }

}

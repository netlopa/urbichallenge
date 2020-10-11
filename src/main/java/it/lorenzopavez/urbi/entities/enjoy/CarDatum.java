
package it.lorenzopavez.urbi.entities.enjoy;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CarDatum {

    @SerializedName("carCategoryID")
    @Expose
    private Integer carCategoryID;
    @SerializedName("carCategoryTypeID")
    @Expose
    private Integer carCategoryTypeID;
    @SerializedName("carIdentifier")
    @Expose
    private String carIdentifier;
    @SerializedName("carManufacturer")
    @Expose
    private String carManufacturer;
    @SerializedName("carModel")
    @Expose
    private String carModel;
    @SerializedName("carName")
    @Expose
    private String carName;
    @SerializedName("carPlate")
    @Expose
    private String carPlate;
    @SerializedName("dynamicAttrs")
    @Expose
    private List<Integer> dynamicAttrs = null;
    @SerializedName("fuelLevel")
    @Expose
    private Integer fuelLevel;
    @SerializedName("isOwner")
    @Expose
    private Boolean isOwner;
    @SerializedName("locationData")
    @Expose
    private LocationData locationData;
    @SerializedName("priceRangeID")
    @Expose
    private Integer priceRangeID;
    @SerializedName("virtualRentalID")
    @Expose
    private Integer virtualRentalID;
    @SerializedName("virtualRentalTypeID")
    @Expose
    private Integer virtualRentalTypeID;

    public Integer getCarCategoryID() {
        return carCategoryID;
    }

    public void setCarCategoryID(Integer carCategoryID) {
        this.carCategoryID = carCategoryID;
    }

    public Integer getCarCategoryTypeID() {
        return carCategoryTypeID;
    }

    public void setCarCategoryTypeID(Integer carCategoryTypeID) {
        this.carCategoryTypeID = carCategoryTypeID;
    }

    public String getCarIdentifier() {
        return carIdentifier;
    }

    public void setCarIdentifier(String carIdentifier) {
        this.carIdentifier = carIdentifier;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public List<Integer> getDynamicAttrs() {
        return dynamicAttrs;
    }

    public void setDynamicAttrs(List<Integer> dynamicAttrs) {
        this.dynamicAttrs = dynamicAttrs;
    }

    public Integer getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(Integer fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Boolean getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    public LocationData getLocationData() {
        return locationData;
    }

    public void setLocationData(LocationData locationData) {
        this.locationData = locationData;
    }

    public Integer getPriceRangeID() {
        return priceRangeID;
    }

    public void setPriceRangeID(Integer priceRangeID) {
        this.priceRangeID = priceRangeID;
    }

    public Integer getVirtualRentalID() {
        return virtualRentalID;
    }

    public void setVirtualRentalID(Integer virtualRentalID) {
        this.virtualRentalID = virtualRentalID;
    }

    public Integer getVirtualRentalTypeID() {
        return virtualRentalTypeID;
    }

    public void setVirtualRentalTypeID(Integer virtualRentalTypeID) {
        this.virtualRentalTypeID = virtualRentalTypeID;
    }

}

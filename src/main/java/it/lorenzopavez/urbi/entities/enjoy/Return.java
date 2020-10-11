
package it.lorenzopavez.urbi.entities.enjoy;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Return {

    @SerializedName("carsAvailabilityData")
    @Expose
    private List<CarsAvailabilityDatum> carsAvailabilityData = null;
    @SerializedName("isCanReserve")
    @Expose
    private Boolean isCanReserve;
    @SerializedName("statusCode")
    @Expose
    private String statusCode;
    @SerializedName("statusMessage")
    @Expose
    private String statusMessage;

    public List<CarsAvailabilityDatum> getCarsAvailabilityData() {
        return carsAvailabilityData;
    }

    public void setCarsAvailabilityData(List<CarsAvailabilityDatum> carsAvailabilityData) {
        this.carsAvailabilityData = carsAvailabilityData;
    }

    public Boolean getIsCanReserve() {
        return isCanReserve;
    }

    public void setIsCanReserve(Boolean isCanReserve) {
        this.isCanReserve = isCanReserve;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

}

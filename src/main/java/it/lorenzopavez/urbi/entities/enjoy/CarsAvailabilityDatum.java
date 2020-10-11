
package it.lorenzopavez.urbi.entities.enjoy;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CarsAvailabilityDatum {

    @SerializedName("carData")
    @Expose
    private List<CarDatum> carData = null;
    @SerializedName("parkingId")
    @Expose
    private Integer parkingId;

    public List<CarDatum> getCarData() {
        return carData;
    }

    public void setCarData(List<CarDatum> carData) {
        this.carData = carData;
    }

    public Integer getParkingId() {
        return parkingId;
    }

    public void setParkingId(Integer parkingId) {
        this.parkingId = parkingId;
    }

}

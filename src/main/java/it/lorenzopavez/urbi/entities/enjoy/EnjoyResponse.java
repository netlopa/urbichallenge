
package it.lorenzopavez.urbi.entities.enjoy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EnjoyResponse {

    @SerializedName("return")
    @Expose
    private Return _return;
    @SerializedName("statusFlag")
    @Expose
    private Boolean statusFlag;

    public Return getReturn() {
        return _return;
    }

    public void setReturn(Return _return) {
        this._return = _return;
    }

    public Boolean getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Boolean statusFlag) {
        this.statusFlag = statusFlag;
    }

}

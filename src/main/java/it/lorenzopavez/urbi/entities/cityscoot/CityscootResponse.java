
package it.lorenzopavez.urbi.entities.cityscoot;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CityscootResponse {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("reason")
    @Expose
    private Integer reason;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getReason() {
        return reason;
    }

    public void setReason(Integer reason) {
        this.reason = reason;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}

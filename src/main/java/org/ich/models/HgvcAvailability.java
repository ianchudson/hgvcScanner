
package org.ich.models;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "hasEliteCashDiscounts",
    "minNightsPoints",
    "minNightsCash",
    "maxBookingWindowPoints",
    "minBookingWindowPoints",
    "maxBookingWindowCash",
    "minBookingWindowCash",
    "requiresOwnershipCash",
    "requiresOwnershipPoints",
    "rooms",
    "unitTypes",
    "isOpenSeasonBlocked",
    "BookableOnline",
    "CantBookOnlineMessage",
    "ResortName"
})

public class HgvcAvailability {

    @JsonProperty("id")
    private String id;
    @JsonProperty("hasEliteCashDiscounts")
    private Boolean hasEliteCashDiscounts;
    @JsonProperty("minNightsPoints")
    private Integer minNightsPoints;
    @JsonProperty("minNightsCash")
    private Integer minNightsCash;
    @JsonProperty("maxBookingWindowPoints")
    private String maxBookingWindowPoints;
    @JsonProperty("minBookingWindowPoints")
    private String minBookingWindowPoints;
    @JsonProperty("maxBookingWindowCash")
    private String maxBookingWindowCash;
    @JsonProperty("minBookingWindowCash")
    private String minBookingWindowCash;
    @JsonProperty("requiresOwnershipCash")
    private Boolean requiresOwnershipCash;
    @JsonProperty("requiresOwnershipPoints")
    private Boolean requiresOwnershipPoints;
    @JsonProperty("rooms")
    private List<Room> rooms = new ArrayList<Room>();
    @JsonProperty("unitTypes")
    private List<UnitType> unitTypes = new ArrayList<UnitType>();
    @JsonProperty("isOpenSeasonBlocked")
    private Boolean isOpenSeasonBlocked;
    @JsonProperty("BookableOnline")
    private Boolean bookableOnline;
    @JsonProperty("CantBookOnlineMessage")
    private Object cantBookOnlineMessage;
    @JsonProperty("ResortName")
    private String resortName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public HgvcAvailability withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("hasEliteCashDiscounts")
    public Boolean getHasEliteCashDiscounts() {
        return hasEliteCashDiscounts;
    }

    @JsonProperty("hasEliteCashDiscounts")
    public void setHasEliteCashDiscounts(Boolean hasEliteCashDiscounts) {
        this.hasEliteCashDiscounts = hasEliteCashDiscounts;
    }

    public HgvcAvailability withHasEliteCashDiscounts(Boolean hasEliteCashDiscounts) {
        this.hasEliteCashDiscounts = hasEliteCashDiscounts;
        return this;
    }

    @JsonProperty("minNightsPoints")
    public Integer getMinNightsPoints() {
        return minNightsPoints;
    }

    @JsonProperty("minNightsPoints")
    public void setMinNightsPoints(Integer minNightsPoints) {
        this.minNightsPoints = minNightsPoints;
    }

    public HgvcAvailability withMinNightsPoints(Integer minNightsPoints) {
        this.minNightsPoints = minNightsPoints;
        return this;
    }

    @JsonProperty("minNightsCash")
    public Integer getMinNightsCash() {
        return minNightsCash;
    }

    @JsonProperty("minNightsCash")
    public void setMinNightsCash(Integer minNightsCash) {
        this.minNightsCash = minNightsCash;
    }

    public HgvcAvailability withMinNightsCash(Integer minNightsCash) {
        this.minNightsCash = minNightsCash;
        return this;
    }

    @JsonProperty("maxBookingWindowPoints")
    public String getMaxBookingWindowPoints() {
        return maxBookingWindowPoints;
    }

    @JsonProperty("maxBookingWindowPoints")
    public void setMaxBookingWindowPoints(String maxBookingWindowPoints) {
        this.maxBookingWindowPoints = maxBookingWindowPoints;
    }

    public HgvcAvailability withMaxBookingWindowPoints(String maxBookingWindowPoints) {
        this.maxBookingWindowPoints = maxBookingWindowPoints;
        return this;
    }

    @JsonProperty("minBookingWindowPoints")
    public String getMinBookingWindowPoints() {
        return minBookingWindowPoints;
    }

    @JsonProperty("minBookingWindowPoints")
    public void setMinBookingWindowPoints(String minBookingWindowPoints) {
        this.minBookingWindowPoints = minBookingWindowPoints;
    }

    public HgvcAvailability withMinBookingWindowPoints(String minBookingWindowPoints) {
        this.minBookingWindowPoints = minBookingWindowPoints;
        return this;
    }

    @JsonProperty("maxBookingWindowCash")
    public String getMaxBookingWindowCash() {
        return maxBookingWindowCash;
    }

    @JsonProperty("maxBookingWindowCash")
    public void setMaxBookingWindowCash(String maxBookingWindowCash) {
        this.maxBookingWindowCash = maxBookingWindowCash;
    }

    public HgvcAvailability withMaxBookingWindowCash(String maxBookingWindowCash) {
        this.maxBookingWindowCash = maxBookingWindowCash;
        return this;
    }

    @JsonProperty("minBookingWindowCash")
    public String getMinBookingWindowCash() {
        return minBookingWindowCash;
    }

    @JsonProperty("minBookingWindowCash")
    public void setMinBookingWindowCash(String minBookingWindowCash) {
        this.minBookingWindowCash = minBookingWindowCash;
    }

    public HgvcAvailability withMinBookingWindowCash(String minBookingWindowCash) {
        this.minBookingWindowCash = minBookingWindowCash;
        return this;
    }

    @JsonProperty("requiresOwnershipCash")
    public Boolean getRequiresOwnershipCash() {
        return requiresOwnershipCash;
    }

    @JsonProperty("requiresOwnershipCash")
    public void setRequiresOwnershipCash(Boolean requiresOwnershipCash) {
        this.requiresOwnershipCash = requiresOwnershipCash;
    }

    public HgvcAvailability withRequiresOwnershipCash(Boolean requiresOwnershipCash) {
        this.requiresOwnershipCash = requiresOwnershipCash;
        return this;
    }

    @JsonProperty("requiresOwnershipPoints")
    public Boolean getRequiresOwnershipPoints() {
        return requiresOwnershipPoints;
    }

    @JsonProperty("requiresOwnershipPoints")
    public void setRequiresOwnershipPoints(Boolean requiresOwnershipPoints) {
        this.requiresOwnershipPoints = requiresOwnershipPoints;
    }

    public HgvcAvailability withRequiresOwnershipPoints(Boolean requiresOwnershipPoints) {
        this.requiresOwnershipPoints = requiresOwnershipPoints;
        return this;
    }

    @JsonProperty("rooms")
    public List<Room> getRooms() {
        return rooms;
    }

    @JsonProperty("rooms")
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public HgvcAvailability withRooms(List<Room> rooms) {
        this.rooms = rooms;
        return this;
    }

    @JsonProperty("unitTypes")
    public List<UnitType> getUnitTypes() {
        return unitTypes;
    }

    @JsonProperty("unitTypes")
    public void setUnitTypes(List<UnitType> unitTypes) {
        this.unitTypes = unitTypes;
    }

    public HgvcAvailability withUnitTypes(List<UnitType> unitTypes) {
        this.unitTypes = unitTypes;
        return this;
    }

    @JsonProperty("isOpenSeasonBlocked")
    public Boolean getIsOpenSeasonBlocked() {
        return isOpenSeasonBlocked;
    }

    @JsonProperty("isOpenSeasonBlocked")
    public void setIsOpenSeasonBlocked(Boolean isOpenSeasonBlocked) {
        this.isOpenSeasonBlocked = isOpenSeasonBlocked;
    }

    public HgvcAvailability withIsOpenSeasonBlocked(Boolean isOpenSeasonBlocked) {
        this.isOpenSeasonBlocked = isOpenSeasonBlocked;
        return this;
    }

    @JsonProperty("BookableOnline")
    public Boolean getBookableOnline() {
        return bookableOnline;
    }

    @JsonProperty("BookableOnline")
    public void setBookableOnline(Boolean bookableOnline) {
        this.bookableOnline = bookableOnline;
    }

    public HgvcAvailability withBookableOnline(Boolean bookableOnline) {
        this.bookableOnline = bookableOnline;
        return this;
    }

    @JsonProperty("CantBookOnlineMessage")
    public Object getCantBookOnlineMessage() {
        return cantBookOnlineMessage;
    }

    @JsonProperty("CantBookOnlineMessage")
    public void setCantBookOnlineMessage(Object cantBookOnlineMessage) {
        this.cantBookOnlineMessage = cantBookOnlineMessage;
    }

    public HgvcAvailability withCantBookOnlineMessage(Object cantBookOnlineMessage) {
        this.cantBookOnlineMessage = cantBookOnlineMessage;
        return this;
    }

    @JsonProperty("ResortName")
    public String getResortName() {
        return resortName;
    }

    @JsonProperty("ResortName")
    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public HgvcAvailability withResortName(String resortName) {
        this.resortName = resortName;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public HgvcAvailability withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HgvcAvailability.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("hasEliteCashDiscounts");
        sb.append('=');
        sb.append(((this.hasEliteCashDiscounts == null)?"<null>":this.hasEliteCashDiscounts));
        sb.append(',');
        sb.append("minNightsPoints");
        sb.append('=');
        sb.append(((this.minNightsPoints == null)?"<null>":this.minNightsPoints));
        sb.append(',');
        sb.append("minNightsCash");
        sb.append('=');
        sb.append(((this.minNightsCash == null)?"<null>":this.minNightsCash));
        sb.append(',');
        sb.append("maxBookingWindowPoints");
        sb.append('=');
        sb.append(((this.maxBookingWindowPoints == null)?"<null>":this.maxBookingWindowPoints));
        sb.append(',');
        sb.append("minBookingWindowPoints");
        sb.append('=');
        sb.append(((this.minBookingWindowPoints == null)?"<null>":this.minBookingWindowPoints));
        sb.append(',');
        sb.append("maxBookingWindowCash");
        sb.append('=');
        sb.append(((this.maxBookingWindowCash == null)?"<null>":this.maxBookingWindowCash));
        sb.append(',');
        sb.append("minBookingWindowCash");
        sb.append('=');
        sb.append(((this.minBookingWindowCash == null)?"<null>":this.minBookingWindowCash));
        sb.append(',');
        sb.append("requiresOwnershipCash");
        sb.append('=');
        sb.append(((this.requiresOwnershipCash == null)?"<null>":this.requiresOwnershipCash));
        sb.append(',');
        sb.append("requiresOwnershipPoints");
        sb.append('=');
        sb.append(((this.requiresOwnershipPoints == null)?"<null>":this.requiresOwnershipPoints));
        sb.append(',');
        sb.append("rooms");
        sb.append('=');
        sb.append(((this.rooms == null)?"<null>":this.rooms));
        sb.append(',');
        sb.append("unitTypes");
        sb.append('=');
        sb.append(((this.unitTypes == null)?"<null>":this.unitTypes));
        sb.append(',');
        sb.append("isOpenSeasonBlocked");
        sb.append('=');
        sb.append(((this.isOpenSeasonBlocked == null)?"<null>":this.isOpenSeasonBlocked));
        sb.append(',');
        sb.append("bookableOnline");
        sb.append('=');
        sb.append(((this.bookableOnline == null)?"<null>":this.bookableOnline));
        sb.append(',');
        sb.append("cantBookOnlineMessage");
        sb.append('=');
        sb.append(((this.cantBookOnlineMessage == null)?"<null>":this.cantBookOnlineMessage));
        sb.append(',');
        sb.append("resortName");
        sb.append('=');
        sb.append(((this.resortName == null)?"<null>":this.resortName));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.rooms == null)? 0 :this.rooms.hashCode()));
        result = ((result* 31)+((this.resortName == null)? 0 :this.resortName.hashCode()));
        result = ((result* 31)+((this.minNightsCash == null)? 0 :this.minNightsCash.hashCode()));
        result = ((result* 31)+((this.maxBookingWindowCash == null)? 0 :this.maxBookingWindowCash.hashCode()));
        result = ((result* 31)+((this.hasEliteCashDiscounts == null)? 0 :this.hasEliteCashDiscounts.hashCode()));
        result = ((result* 31)+((this.bookableOnline == null)? 0 :this.bookableOnline.hashCode()));
        result = ((result* 31)+((this.maxBookingWindowPoints == null)? 0 :this.maxBookingWindowPoints.hashCode()));
        result = ((result* 31)+((this.cantBookOnlineMessage == null)? 0 :this.cantBookOnlineMessage.hashCode()));
        result = ((result* 31)+((this.minBookingWindowPoints == null)? 0 :this.minBookingWindowPoints.hashCode()));
        result = ((result* 31)+((this.minNightsPoints == null)? 0 :this.minNightsPoints.hashCode()));
        result = ((result* 31)+((this.isOpenSeasonBlocked == null)? 0 :this.isOpenSeasonBlocked.hashCode()));
        result = ((result* 31)+((this.minBookingWindowCash == null)? 0 :this.minBookingWindowCash.hashCode()));
        result = ((result* 31)+((this.unitTypes == null)? 0 :this.unitTypes.hashCode()));
        result = ((result* 31)+((this.requiresOwnershipPoints == null)? 0 :this.requiresOwnershipPoints.hashCode()));
        result = ((result* 31)+((this.requiresOwnershipCash == null)? 0 :this.requiresOwnershipCash.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HgvcAvailability) == false) {
            return false;
        }
        HgvcAvailability rhs = ((HgvcAvailability) other);
        return ((((((((((((((((((this.rooms == rhs.rooms)||((this.rooms!= null)&&this.rooms.equals(rhs.rooms)))&&((this.resortName == rhs.resortName)||((this.resortName!= null)&&this.resortName.equals(rhs.resortName))))&&((this.minNightsCash == rhs.minNightsCash)||((this.minNightsCash!= null)&&this.minNightsCash.equals(rhs.minNightsCash))))&&((this.maxBookingWindowCash == rhs.maxBookingWindowCash)||((this.maxBookingWindowCash!= null)&&this.maxBookingWindowCash.equals(rhs.maxBookingWindowCash))))&&((this.hasEliteCashDiscounts == rhs.hasEliteCashDiscounts)||((this.hasEliteCashDiscounts!= null)&&this.hasEliteCashDiscounts.equals(rhs.hasEliteCashDiscounts))))&&((this.bookableOnline == rhs.bookableOnline)||((this.bookableOnline!= null)&&this.bookableOnline.equals(rhs.bookableOnline))))&&((this.maxBookingWindowPoints == rhs.maxBookingWindowPoints)||((this.maxBookingWindowPoints!= null)&&this.maxBookingWindowPoints.equals(rhs.maxBookingWindowPoints))))&&((this.cantBookOnlineMessage == rhs.cantBookOnlineMessage)||((this.cantBookOnlineMessage!= null)&&this.cantBookOnlineMessage.equals(rhs.cantBookOnlineMessage))))&&((this.minBookingWindowPoints == rhs.minBookingWindowPoints)||((this.minBookingWindowPoints!= null)&&this.minBookingWindowPoints.equals(rhs.minBookingWindowPoints))))&&((this.minNightsPoints == rhs.minNightsPoints)||((this.minNightsPoints!= null)&&this.minNightsPoints.equals(rhs.minNightsPoints))))&&((this.isOpenSeasonBlocked == rhs.isOpenSeasonBlocked)||((this.isOpenSeasonBlocked!= null)&&this.isOpenSeasonBlocked.equals(rhs.isOpenSeasonBlocked))))&&((this.minBookingWindowCash == rhs.minBookingWindowCash)||((this.minBookingWindowCash!= null)&&this.minBookingWindowCash.equals(rhs.minBookingWindowCash))))&&((this.unitTypes == rhs.unitTypes)||((this.unitTypes!= null)&&this.unitTypes.equals(rhs.unitTypes))))&&((this.requiresOwnershipPoints == rhs.requiresOwnershipPoints)||((this.requiresOwnershipPoints!= null)&&this.requiresOwnershipPoints.equals(rhs.requiresOwnershipPoints))))&&((this.requiresOwnershipCash == rhs.requiresOwnershipCash)||((this.requiresOwnershipCash!= null)&&this.requiresOwnershipCash.equals(rhs.requiresOwnershipCash))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}

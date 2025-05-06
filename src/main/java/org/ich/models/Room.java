
package org.ich.models;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "unit",
    "project",
    "availability",
    "isExistingResUnitType",
    "unitNumber"
})
public class Room {

    @JsonProperty("unit")
    private String unit;
    @JsonProperty("project")
    private Integer project;
    @JsonProperty("availability")
    private List<Availability> availability = new ArrayList<Availability>();
    @JsonProperty("isExistingResUnitType")
    private Boolean isExistingResUnitType;
    @JsonProperty("unitNumber")
    private Object unitNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Room withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    @JsonProperty("project")
    public Integer getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(Integer project) {
        this.project = project;
    }

    public Room withProject(Integer project) {
        this.project = project;
        return this;
    }

    @JsonProperty("availability")
    public List<Availability> getAvailability() {
        return availability;
    }

    @JsonProperty("availability")
    public void setAvailability(List<Availability> availability) {
        this.availability = availability;
    }

    public Room withAvailability(List<Availability> availability) {
        this.availability = availability;
        return this;
    }

    @JsonProperty("isExistingResUnitType")
    public Boolean getIsExistingResUnitType() {
        return isExistingResUnitType;
    }

    @JsonProperty("isExistingResUnitType")
    public void setIsExistingResUnitType(Boolean isExistingResUnitType) {
        this.isExistingResUnitType = isExistingResUnitType;
    }

    public Room withIsExistingResUnitType(Boolean isExistingResUnitType) {
        this.isExistingResUnitType = isExistingResUnitType;
        return this;
    }

    @JsonProperty("unitNumber")
    public Object getUnitNumber() {
        return unitNumber;
    }

    @JsonProperty("unitNumber")
    public void setUnitNumber(Object unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Room withUnitNumber(Object unitNumber) {
        this.unitNumber = unitNumber;
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

    public Room withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Room.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("availability");
        sb.append('=');
        sb.append(((this.availability == null)?"<null>":this.availability));
        sb.append(',');
        sb.append("isExistingResUnitType");
        sb.append('=');
        sb.append(((this.isExistingResUnitType == null)?"<null>":this.isExistingResUnitType));
        sb.append(',');
        sb.append("unitNumber");
        sb.append('=');
        sb.append(((this.unitNumber == null)?"<null>":this.unitNumber));
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
        result = ((result* 31)+((this.project == null)? 0 :this.project.hashCode()));
        result = ((result* 31)+((this.unitNumber == null)? 0 :this.unitNumber.hashCode()));
        result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
        result = ((result* 31)+((this.availability == null)? 0 :this.availability.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.isExistingResUnitType == null)? 0 :this.isExistingResUnitType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Room) == false) {
            return false;
        }
        Room rhs = ((Room) other);
        return (((((((this.project == rhs.project)||((this.project!= null)&&this.project.equals(rhs.project)))&&((this.unitNumber == rhs.unitNumber)||((this.unitNumber!= null)&&this.unitNumber.equals(rhs.unitNumber))))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))))&&((this.availability == rhs.availability)||((this.availability!= null)&&this.availability.equals(rhs.availability))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.isExistingResUnitType == rhs.isExistingResUnitType)||((this.isExistingResUnitType!= null)&&this.isExistingResUnitType.equals(rhs.isExistingResUnitType))));
    }

}

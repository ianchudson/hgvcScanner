
package org.ich.models;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "unit",
    "project",
    "description",
    "isExistingResUnitType",
    "size",
    "sizeWithUnit",
    "accomodates",
    "adaDescriptions",
    "accomodatesLabel",
    "sizeLabel",
    "unitNumber",
    "unitNumberEncrypted",
    "unitNumberGenerated",
    "numberOfRooms",
    "images"
})
public class UnitType {

    @JsonProperty("name")
    private String name;
    @JsonProperty("unit")
    private String unit;
    @JsonProperty("project")
    private Integer project;
    @JsonProperty("description")
    private String description;
    @JsonProperty("isExistingResUnitType")
    private Boolean isExistingResUnitType;
    @JsonProperty("size")
    private String size;
    @JsonProperty("sizeWithUnit")
    private String sizeWithUnit;
    @JsonProperty("accomodates")
    private Integer accomodates;
    @JsonProperty("adaDescriptions")
    private String adaDescriptions;
    @JsonProperty("accomodatesLabel")
    private String accomodatesLabel;
    @JsonProperty("sizeLabel")
    private String sizeLabel;
    @JsonProperty("unitNumber")
    private Object unitNumber;
    @JsonProperty("unitNumberEncrypted")
    private Object unitNumberEncrypted;
    @JsonProperty("unitNumberGenerated")
    private Object unitNumberGenerated;
    @JsonProperty("numberOfRooms")
    private Integer numberOfRooms;
    @JsonProperty("images")
    private List<Image> images = new ArrayList<Image>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public UnitType withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("unit")
    public String getUnit() {
        return unit;
    }

    @JsonProperty("unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public UnitType withUnit(String unit) {
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

    public UnitType withProject(Integer project) {
        this.project = project;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public UnitType withDescription(String description) {
        this.description = description;
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

    public UnitType withIsExistingResUnitType(Boolean isExistingResUnitType) {
        this.isExistingResUnitType = isExistingResUnitType;
        return this;
    }

    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    public UnitType withSize(String size) {
        this.size = size;
        return this;
    }

    @JsonProperty("sizeWithUnit")
    public String getSizeWithUnit() {
        return sizeWithUnit;
    }

    @JsonProperty("sizeWithUnit")
    public void setSizeWithUnit(String sizeWithUnit) {
        this.sizeWithUnit = sizeWithUnit;
    }

    public UnitType withSizeWithUnit(String sizeWithUnit) {
        this.sizeWithUnit = sizeWithUnit;
        return this;
    }

    @JsonProperty("accomodates")
    public Integer getAccomodates() {
        return accomodates;
    }

    @JsonProperty("accomodates")
    public void setAccomodates(Integer accomodates) {
        this.accomodates = accomodates;
    }

    public UnitType withAccomodates(Integer accomodates) {
        this.accomodates = accomodates;
        return this;
    }

    @JsonProperty("adaDescriptions")
    public String getAdaDescriptions() {
        return adaDescriptions;
    }

    @JsonProperty("adaDescriptions")
    public void setAdaDescriptions(String adaDescriptions) {
        this.adaDescriptions = adaDescriptions;
    }

    public UnitType withAdaDescriptions(String adaDescriptions) {
        this.adaDescriptions = adaDescriptions;
        return this;
    }

    @JsonProperty("accomodatesLabel")
    public String getAccomodatesLabel() {
        return accomodatesLabel;
    }

    @JsonProperty("accomodatesLabel")
    public void setAccomodatesLabel(String accomodatesLabel) {
        this.accomodatesLabel = accomodatesLabel;
    }

    public UnitType withAccomodatesLabel(String accomodatesLabel) {
        this.accomodatesLabel = accomodatesLabel;
        return this;
    }

    @JsonProperty("sizeLabel")
    public String getSizeLabel() {
        return sizeLabel;
    }

    @JsonProperty("sizeLabel")
    public void setSizeLabel(String sizeLabel) {
        this.sizeLabel = sizeLabel;
    }

    public UnitType withSizeLabel(String sizeLabel) {
        this.sizeLabel = sizeLabel;
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

    public UnitType withUnitNumber(Object unitNumber) {
        this.unitNumber = unitNumber;
        return this;
    }

    @JsonProperty("unitNumberEncrypted")
    public Object getUnitNumberEncrypted() {
        return unitNumberEncrypted;
    }

    @JsonProperty("unitNumberEncrypted")
    public void setUnitNumberEncrypted(Object unitNumberEncrypted) {
        this.unitNumberEncrypted = unitNumberEncrypted;
    }

    public UnitType withUnitNumberEncrypted(Object unitNumberEncrypted) {
        this.unitNumberEncrypted = unitNumberEncrypted;
        return this;
    }

    @JsonProperty("unitNumberGenerated")
    public Object getUnitNumberGenerated() {
        return unitNumberGenerated;
    }

    @JsonProperty("unitNumberGenerated")
    public void setUnitNumberGenerated(Object unitNumberGenerated) {
        this.unitNumberGenerated = unitNumberGenerated;
    }

    public UnitType withUnitNumberGenerated(Object unitNumberGenerated) {
        this.unitNumberGenerated = unitNumberGenerated;
        return this;
    }

    @JsonProperty("numberOfRooms")
    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    @JsonProperty("numberOfRooms")
    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public UnitType withNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        return this;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    public UnitType withImages(List<Image> images) {
        this.images = images;
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

    public UnitType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UnitType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("unit");
        sb.append('=');
        sb.append(((this.unit == null)?"<null>":this.unit));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("isExistingResUnitType");
        sb.append('=');
        sb.append(((this.isExistingResUnitType == null)?"<null>":this.isExistingResUnitType));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("sizeWithUnit");
        sb.append('=');
        sb.append(((this.sizeWithUnit == null)?"<null>":this.sizeWithUnit));
        sb.append(',');
        sb.append("accomodates");
        sb.append('=');
        sb.append(((this.accomodates == null)?"<null>":this.accomodates));
        sb.append(',');
        sb.append("adaDescriptions");
        sb.append('=');
        sb.append(((this.adaDescriptions == null)?"<null>":this.adaDescriptions));
        sb.append(',');
        sb.append("accomodatesLabel");
        sb.append('=');
        sb.append(((this.accomodatesLabel == null)?"<null>":this.accomodatesLabel));
        sb.append(',');
        sb.append("sizeLabel");
        sb.append('=');
        sb.append(((this.sizeLabel == null)?"<null>":this.sizeLabel));
        sb.append(',');
        sb.append("unitNumber");
        sb.append('=');
        sb.append(((this.unitNumber == null)?"<null>":this.unitNumber));
        sb.append(',');
        sb.append("unitNumberEncrypted");
        sb.append('=');
        sb.append(((this.unitNumberEncrypted == null)?"<null>":this.unitNumberEncrypted));
        sb.append(',');
        sb.append("unitNumberGenerated");
        sb.append('=');
        sb.append(((this.unitNumberGenerated == null)?"<null>":this.unitNumberGenerated));
        sb.append(',');
        sb.append("numberOfRooms");
        sb.append('=');
        sb.append(((this.numberOfRooms == null)?"<null>":this.numberOfRooms));
        sb.append(',');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
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
        result = ((result* 31)+((this.images == null)? 0 :this.images.hashCode()));
        result = ((result* 31)+((this.adaDescriptions == null)? 0 :this.adaDescriptions.hashCode()));
        result = ((result* 31)+((this.project == null)? 0 :this.project.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.sizeWithUnit == null)? 0 :this.sizeWithUnit.hashCode()));
        result = ((result* 31)+((this.accomodatesLabel == null)? 0 :this.accomodatesLabel.hashCode()));
        result = ((result* 31)+((this.unitNumber == null)? 0 :this.unitNumber.hashCode()));
        result = ((result* 31)+((this.numberOfRooms == null)? 0 :this.numberOfRooms.hashCode()));
        result = ((result* 31)+((this.unitNumberEncrypted == null)? 0 :this.unitNumberEncrypted.hashCode()));
        result = ((result* 31)+((this.unit == null)? 0 :this.unit.hashCode()));
        result = ((result* 31)+((this.unitNumberGenerated == null)? 0 :this.unitNumberGenerated.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.sizeLabel == null)? 0 :this.sizeLabel.hashCode()));
        result = ((result* 31)+((this.isExistingResUnitType == null)? 0 :this.isExistingResUnitType.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.accomodates == null)? 0 :this.accomodates.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UnitType) == false) {
            return false;
        }
        UnitType rhs = ((UnitType) other);
        return ((((((((((((((((((this.images == rhs.images)||((this.images!= null)&&this.images.equals(rhs.images)))&&((this.adaDescriptions == rhs.adaDescriptions)||((this.adaDescriptions!= null)&&this.adaDescriptions.equals(rhs.adaDescriptions))))&&((this.project == rhs.project)||((this.project!= null)&&this.project.equals(rhs.project))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.sizeWithUnit == rhs.sizeWithUnit)||((this.sizeWithUnit!= null)&&this.sizeWithUnit.equals(rhs.sizeWithUnit))))&&((this.accomodatesLabel == rhs.accomodatesLabel)||((this.accomodatesLabel!= null)&&this.accomodatesLabel.equals(rhs.accomodatesLabel))))&&((this.unitNumber == rhs.unitNumber)||((this.unitNumber!= null)&&this.unitNumber.equals(rhs.unitNumber))))&&((this.numberOfRooms == rhs.numberOfRooms)||((this.numberOfRooms!= null)&&this.numberOfRooms.equals(rhs.numberOfRooms))))&&((this.unitNumberEncrypted == rhs.unitNumberEncrypted)||((this.unitNumberEncrypted!= null)&&this.unitNumberEncrypted.equals(rhs.unitNumberEncrypted))))&&((this.unit == rhs.unit)||((this.unit!= null)&&this.unit.equals(rhs.unit))))&&((this.unitNumberGenerated == rhs.unitNumberGenerated)||((this.unitNumberGenerated!= null)&&this.unitNumberGenerated.equals(rhs.unitNumberGenerated))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.sizeLabel == rhs.sizeLabel)||((this.sizeLabel!= null)&&this.sizeLabel.equals(rhs.sizeLabel))))&&((this.isExistingResUnitType == rhs.isExistingResUnitType)||((this.isExistingResUnitType!= null)&&this.isExistingResUnitType.equals(rhs.isExistingResUnitType))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.accomodates == rhs.accomodates)||((this.accomodates!= null)&&this.accomodates.equals(rhs.accomodates))));
    }

}

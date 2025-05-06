
package org.ich.models;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "FileName",
    "CreatedDate",
    "Ordinal",
    "ImageSizes",
    "Thumbnail",
    "Caption"
})
public class Image {

    @JsonProperty("Id")
    private String id;
    @JsonProperty("FileName")
    private String fileName;
    @JsonProperty("CreatedDate")
    private String createdDate;
    @JsonProperty("Ordinal")
    private Integer ordinal;
    @JsonProperty("ImageSizes")
    private List<ImageSize> imageSizes = new ArrayList<ImageSize>();
    @JsonProperty("Thumbnail")
    private String thumbnail;
    @JsonProperty("Caption")
    private String caption;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Id")
    public String getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    public Image withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("FileName")
    public String getFileName() {
        return fileName;
    }

    @JsonProperty("FileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Image withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    @JsonProperty("CreatedDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("CreatedDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Image withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    @JsonProperty("Ordinal")
    public Integer getOrdinal() {
        return ordinal;
    }

    @JsonProperty("Ordinal")
    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public Image withOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    @JsonProperty("ImageSizes")
    public List<ImageSize> getImageSizes() {
        return imageSizes;
    }

    @JsonProperty("ImageSizes")
    public void setImageSizes(List<ImageSize> imageSizes) {
        this.imageSizes = imageSizes;
    }

    public Image withImageSizes(List<ImageSize> imageSizes) {
        this.imageSizes = imageSizes;
        return this;
    }

    @JsonProperty("Thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("Thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Image withThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    @JsonProperty("Caption")
    public String getCaption() {
        return caption;
    }

    @JsonProperty("Caption")
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Image withCaption(String caption) {
        this.caption = caption;
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

    public Image withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("fileName");
        sb.append('=');
        sb.append(((this.fileName == null)?"<null>":this.fileName));
        sb.append(',');
        sb.append("createdDate");
        sb.append('=');
        sb.append(((this.createdDate == null)?"<null>":this.createdDate));
        sb.append(',');
        sb.append("ordinal");
        sb.append('=');
        sb.append(((this.ordinal == null)?"<null>":this.ordinal));
        sb.append(',');
        sb.append("imageSizes");
        sb.append('=');
        sb.append(((this.imageSizes == null)?"<null>":this.imageSizes));
        sb.append(',');
        sb.append("thumbnail");
        sb.append('=');
        sb.append(((this.thumbnail == null)?"<null>":this.thumbnail));
        sb.append(',');
        sb.append("caption");
        sb.append('=');
        sb.append(((this.caption == null)?"<null>":this.caption));
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
        result = ((result* 31)+((this.fileName == null)? 0 :this.fileName.hashCode()));
        result = ((result* 31)+((this.thumbnail == null)? 0 :this.thumbnail.hashCode()));
        result = ((result* 31)+((this.createdDate == null)? 0 :this.createdDate.hashCode()));
        result = ((result* 31)+((this.imageSizes == null)? 0 :this.imageSizes.hashCode()));
        result = ((result* 31)+((this.caption == null)? 0 :this.caption.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ordinal == null)? 0 :this.ordinal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image) == false) {
            return false;
        }
        Image rhs = ((Image) other);
        return (((((((((this.fileName == rhs.fileName)||((this.fileName!= null)&&this.fileName.equals(rhs.fileName)))&&((this.thumbnail == rhs.thumbnail)||((this.thumbnail!= null)&&this.thumbnail.equals(rhs.thumbnail))))&&((this.createdDate == rhs.createdDate)||((this.createdDate!= null)&&this.createdDate.equals(rhs.createdDate))))&&((this.imageSizes == rhs.imageSizes)||((this.imageSizes!= null)&&this.imageSizes.equals(rhs.imageSizes))))&&((this.caption == rhs.caption)||((this.caption!= null)&&this.caption.equals(rhs.caption))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ordinal == rhs.ordinal)||((this.ordinal!= null)&&this.ordinal.equals(rhs.ordinal))));
    }

}


package org.ich.models;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "p",
    "d",
    "r",
    "hasdisc",
    "pdisc",
    "req"
})

public class Availability {

    @JsonProperty("date")
    private String date;
    @JsonProperty("p")
    private Object p;
    @JsonProperty("d")
    private Object d;
    @JsonProperty("r")
    private Boolean r;
    @JsonProperty("hasdisc")
    private Boolean hasdisc;
    @JsonProperty("pdisc")
    private Object pdisc;
    @JsonProperty("req")
    private List<Object> req = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Availability withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("p")
    public Object getP() {
        return p;
    }

    @JsonProperty("p")
    public void setP(Object p) {
        this.p = p;
    }

    public Availability withP(Object p) {
        this.p = p;
        return this;
    }

    @JsonProperty("d")
    public Object getD() {
        return d;
    }

    @JsonProperty("d")
    public void setD(Object d) {
        this.d = d;
    }

    public Availability withD(Object d) {
        this.d = d;
        return this;
    }

    @JsonProperty("r")
    public Boolean getR() {
        return r;
    }

    @JsonProperty("r")
    public void setR(Boolean r) {
        this.r = r;
    }

    public Availability withR(Boolean r) {
        this.r = r;
        return this;
    }

    @JsonProperty("hasdisc")
    public Boolean getHasdisc() {
        return hasdisc;
    }

    @JsonProperty("hasdisc")
    public void setHasdisc(Boolean hasdisc) {
        this.hasdisc = hasdisc;
    }

    public Availability withHasdisc(Boolean hasdisc) {
        this.hasdisc = hasdisc;
        return this;
    }

    @JsonProperty("pdisc")
    public Object getPdisc() {
        return pdisc;
    }

    @JsonProperty("pdisc")
    public void setPdisc(Object pdisc) {
        this.pdisc = pdisc;
    }

    public Availability withPdisc(Object pdisc) {
        this.pdisc = pdisc;
        return this;
    }

    @JsonProperty("req")
    public List<Object> getReq() {
        return req;
    }

    @JsonProperty("req")
    public void setReq(List<Object> req) {
        this.req = req;
    }

    public Availability withReq(List<Object> req) {
        this.req = req;
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

    public Availability withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Availability.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("p");
        sb.append('=');
        sb.append(((this.p == null)?"<null>":this.p));
        sb.append(',');
        sb.append("d");
        sb.append('=');
        sb.append(((this.d == null)?"<null>":this.d));
        sb.append(',');
        sb.append("r");
        sb.append('=');
        sb.append(((this.r == null)?"<null>":this.r));
        sb.append(',');
        sb.append("hasdisc");
        sb.append('=');
        sb.append(((this.hasdisc == null)?"<null>":this.hasdisc));
        sb.append(',');
        sb.append("pdisc");
        sb.append('=');
        sb.append(((this.pdisc == null)?"<null>":this.pdisc));
        sb.append(',');
        sb.append("req");
        sb.append('=');
        sb.append(((this.req == null)?"<null>":this.req));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.p == null)? 0 :this.p.hashCode()));
        result = ((result* 31)+((this.r == null)? 0 :this.r.hashCode()));
        result = ((result* 31)+((this.d == null)? 0 :this.d.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.pdisc == null)? 0 :this.pdisc.hashCode()));
        result = ((result* 31)+((this.hasdisc == null)? 0 :this.hasdisc.hashCode()));
        result = ((result* 31)+((this.req == null)? 0 :this.req.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Availability) == false) {
            return false;
        }
        Availability rhs = ((Availability) other);
        return (((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.p == rhs.p)||((this.p!= null)&&this.p.equals(rhs.p))))&&((this.r == rhs.r)||((this.r!= null)&&this.r.equals(rhs.r))))&&((this.d == rhs.d)||((this.d!= null)&&this.d.equals(rhs.d))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.pdisc == rhs.pdisc)||((this.pdisc!= null)&&this.pdisc.equals(rhs.pdisc))))&&((this.hasdisc == rhs.hasdisc)||((this.hasdisc!= null)&&this.hasdisc.equals(rhs.hasdisc))))&&((this.req == rhs.req)||((this.req!= null)&&this.req.equals(rhs.req))));
    }

}


package com.cicidi.truecar.model.database;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "body",
        "engine",
        "custom",
        "drivetrain",
        "trimline",
        "transmission"
})
public class Prompts {

    @JsonProperty("body")
    private String body;
    @JsonProperty("engine")
    private String engine;
    @JsonProperty("custom")
    private String custom;
    @JsonProperty("drivetrain")
    private String drivetrain;
    @JsonProperty("trimline")
    private String trimline;
    @JsonProperty("transmission")
    private String transmission;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The body
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    /**
     * @param body The body
     */
    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return The engine
     */
    @JsonProperty("engine")
    public String getEngine() {
        return engine;
    }

    /**
     * @param engine The engine
     */
    @JsonProperty("engine")
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * @return The custom
     */
    @JsonProperty("custom")
    public String getCustom() {
        return custom;
    }

    /**
     * @param custom The custom
     */
    @JsonProperty("custom")
    public void setCustom(String custom) {
        this.custom = custom;
    }

    /**
     * @return The drivetrain
     */
    @JsonProperty("drivetrain")
    public String getDrivetrain() {
        return drivetrain;
    }

    /**
     * @param drivetrain The drivetrain
     */
    @JsonProperty("drivetrain")
    public void setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
    }

    /**
     * @return The trimline
     */
    @JsonProperty("trimline")
    public String getTrimline() {
        return trimline;
    }

    /**
     * @param trimline The trimline
     */
    @JsonProperty("trimline")
    public void setTrimline(String trimline) {
        this.trimline = trimline;
    }

    /**
     * @return The transmission
     */
    @JsonProperty("transmission")
    public String getTransmission() {
        return transmission;
    }

    /**
     * @param transmission The transmission
     */
    @JsonProperty("transmission")
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

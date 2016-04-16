
package com.cicidi.truecar.model.database;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "relativeMinimum",
    "transactionCount",
    "minimum",
    "maximum",
    "relativeMaximum"
})
public class Bucket {

    @JsonProperty("relativeMinimum")
    private Double relativeMinimum;
    @JsonProperty("transactionCount")
    private Integer transactionCount;
    @JsonProperty("minimum")
    private Integer minimum;
    @JsonProperty("maximum")
    private Integer maximum;
    @JsonProperty("relativeMaximum")
    private Double relativeMaximum;

    /**
     * 
     * @return
     *     The relativeMinimum
     */
    @JsonProperty("relativeMinimum")
    public Double getRelativeMinimum() {
        return relativeMinimum;
    }

    /**
     * 
     * @param relativeMinimum
     *     The relativeMinimum
     */
    @JsonProperty("relativeMinimum")
    public void setRelativeMinimum(Double relativeMinimum) {
        this.relativeMinimum = relativeMinimum;
    }

    /**
     * 
     * @return
     *     The transactionCount
     */
    @JsonProperty("transactionCount")
    public Integer getTransactionCount() {
        return transactionCount;
    }

    /**
     * 
     * @param transactionCount
     *     The transactionCount
     */
    @JsonProperty("transactionCount")
    public void setTransactionCount(Integer transactionCount) {
        this.transactionCount = transactionCount;
    }

    /**
     * 
     * @return
     *     The minimum
     */
    @JsonProperty("minimum")
    public Integer getMinimum() {
        return minimum;
    }

    /**
     * 
     * @param minimum
     *     The minimum
     */
    @JsonProperty("minimum")
    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    /**
     * 
     * @return
     *     The maximum
     */
    @JsonProperty("maximum")
    public Integer getMaximum() {
        return maximum;
    }

    /**
     * 
     * @param maximum
     *     The maximum
     */
    @JsonProperty("maximum")
    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    /**
     * 
     * @return
     *     The relativeMaximum
     */
    @JsonProperty("relativeMaximum")
    public Double getRelativeMaximum() {
        return relativeMaximum;
    }

    /**
     * 
     * @param relativeMaximum
     *     The relativeMaximum
     */
    @JsonProperty("relativeMaximum")
    public void setRelativeMaximum(Double relativeMaximum) {
        this.relativeMaximum = relativeMaximum;
    }

}
